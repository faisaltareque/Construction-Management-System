/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Attendance.QueryPages;

import construction.Attendance.AttendanceQuery;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author faisa
 */

class WeekendAttendanceClass{
    String ID;
    String weekendAttendance;

    public WeekendAttendanceClass(String ID, String weekendAttendance) {
        this.ID = ID;
        this.weekendAttendance = weekendAttendance;
    }

    public String getID() {
        return ID;
    }

    public String getWeekendAttendance() {
        return weekendAttendance;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setWeekendAttendance(String weekendAttendance) {
        this.weekendAttendance = weekendAttendance;
    }
    
}

public class WeekendAttendance extends javax.swing.JFrame {

    /**
     * Creates new form WeekendAttendance
     */
    public WeekendAttendance(AttendanceQuery attendanceQuery,int option) {
        initComponents();
        if(option==1){
            displayAttendanceByIDTable(1);
        }else if(option==2){
            displayAttendanceByIDTable(2);
        }else if(option==3){
            displayAttendanceByIDTable(3);
        }
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            attendanceQuery.reEnable();
            dispose();
        }
    });
    }
    
    public ArrayList<WeekendAttendanceClass> AttendanceIDList(int option){
        ArrayList<WeekendAttendanceClass> weekendAttendanceClassList=new ArrayList<>();
        WeekendAttendanceClass weekendAttendanceClass;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
            String query="";
            if(option==1){
                query="select EngineerID as ID,Count(EngineerID) as WeekendAttendance from EngineerAttendance where WeekDay like 'Saturday' or WeekDay like 'Friday' group by EngineerID order by (EngineerID) desc";
            }else if(option==2){
                query="select ArchitectureID as ID,Count(ArchitectureID) as WeekendAttendance from ArchitectureAttendance where WeekDay like 'Saturday' or WeekDay like 'Friday' group by ArchitectureID order by (ArchitectureID) desc";
            }else if(option==3){
                query="select LaborID as ID,Count(LaborID) as WeekendAttendance from LaborAttendance where WeekDay like 'Saturday' or WeekDay like 'Friday' group by LaborID order by (LaborID) desc";
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);            
            while (resultSet.next()) {                
                weekendAttendanceClass=new WeekendAttendanceClass(
                        resultSet.getString("ID"),
                        resultSet.getString("WeekendAttendance"));                
                weekendAttendanceClassList.add(weekendAttendanceClass);
            }        
        }catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
        }
        return weekendAttendanceClassList;
    }
    
    public void displayAttendanceByIDTable(int option){
        ArrayList<WeekendAttendanceClass> list= AttendanceIDList(option);
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row= new Object[2];        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getID();
            row[1]=list.get(i).getWeekendAttendance();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Weekend Attendance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeekendAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeekendAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeekendAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeekendAttendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new WeekendAttendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}