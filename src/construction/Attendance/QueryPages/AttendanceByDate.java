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

class AttendanceByDateClass{
    String id;
    String name;
    String time;
    String weekday;

    public AttendanceByDateClass(String id,String name, String time, String weekday) {
        this.id = id;
        this.name=name;
        this.time = time;
        this.weekday = weekday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    
    
    
    
}

public class AttendanceByDate extends javax.swing.JFrame {

    /**
     * Creates new form AttendanceByDate
     */
    public AttendanceByDate(AttendanceQuery attendanceQuery,int option,String date) {
        initComponents();
        
        if(option==1){
            displayAttendanceByDateTable(1,date);
        }else if(option==2){
            displayAttendanceByDateTable(2,date);
        }else if(option==3){
            displayAttendanceByDateTable(3,date);
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
    
    public ArrayList<AttendanceByDateClass> AttendanceDateList(int option,String date){
        ArrayList<AttendanceByDateClass> attendanceByDateClassesList=new ArrayList<>();
        AttendanceByDateClass attendancedByDateClass;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
            String query="select EngineerAttendance.EngineerID as ID,EngineerAttendance.Time as Time,Upper (EngineerAttendance.WeekDay) as Weekday from EngineerAttendance where Date like '"+date+"'";
            if(option==1){
                query="select EngineerAttendance.EngineerID as ID,Engineer.Name as Name,EngineerAttendance.Time as Time,Upper (EngineerAttendance.WeekDay) as Weekday from EngineerAttendance inner join Engineer on EngineerAttendance.EngineerID=Engineer.ID where EngineerAttendance.Date like '"+date+"'";
            }else if(option==2){
                query="select ArchitectureAttendance.ArchitectureID as ID,Architecture.Name as Name,ArchitectureAttendance.Time as Time,Upper (ArchitectureAttendance.WeekDay) as Weekday from ArchitectureAttendance inner join Architecture on ArchitectureAttendance.ArchitectureID=Architecture.ID where ArchitectureAttendance.Date like '"+date+"'";
            }else if(option==3){
                query="select LaborAttendance.LaborID as ID,Labor.Name as Name,LaborAttendance.Time as Time,Upper (LaborAttendance.WeekDay) as Weekday from LaborAttendance inner join Labor on LaborAttendance.LaborID=Labor.ID where LaborAttendance.Date like '"+date+"'";
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);            
            while (resultSet.next()) {
                
                attendancedByDateClass=new AttendanceByDateClass(resultSet.getString("ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("Time"),
                        resultSet.getString("Weekday"));                
                attendanceByDateClassesList.add(attendancedByDateClass);
            }        
        }catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
        }
        return attendanceByDateClassesList;
    }
    
    public void displayAttendanceByDateTable(int option,String date){
        ArrayList<AttendanceByDateClass> list= AttendanceDateList(option,date);
        DefaultTableModel model=(DefaultTableModel)attendanceByDateTable.getModel();
        Object[] row= new Object[4];        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getTime();
            row[3]=list.get(i).getWeekday();
            model.addRow(row);
        }
        //attendanceTable.enable(false);
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
        attendanceByDateTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        attendanceByDateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Time", "Weekday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(attendanceByDateTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(AttendanceByDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceByDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceByDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceByDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AttendanceByDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendanceByDateTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
