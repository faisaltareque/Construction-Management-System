/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Attendance;

import construction.Class.EmployeeAttendance;
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
public class AttendanceTable extends javax.swing.JFrame {
    
    //Variables
    public Connection connection;

    /**
     * Creates new form AttendanceTable
     */
    public AttendanceTable(AttendancePage attendancePage,int option) {
        initComponents();
        if(option==1){
            displayAttendanceTable(1);
            attendanceTableTitleLabel.setText("Engineer Attendance Table");
        }else if(option==2){
            displayAttendanceTable(2);
            attendanceTableTitleLabel.setText("Architecture Attendance Table");
        }else if(option==3){
            displayAttendanceTable(3);
            attendanceTableTitleLabel.setText("Labor Attendance Table");
        }
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            attendancePage.reEnable();
            dispose();
        }
    });
    }
    
    public ArrayList<EmployeeAttendance> Attendance(int option){
        ArrayList<EmployeeAttendance> engineerAttendanceList=new ArrayList<>();
        EmployeeAttendance employeeAttendance;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
            String query="select EntryNo,Date,Time,EngineerID as ID,Weekday from EngineerAttendance";;
            if(option==1){
                query="select EntryNo,Date,Time,EngineerID as ID,Weekday from EngineerAttendance";
            }else if(option==2){
                query="select EntryNo,Date,Time,ArchitectureID as ID,Weekday from ArchitectureAttendance";
            }else if(option==3){
                query="select EntryNo,Date,Time,LaborID as ID,Weekday from LaborAttendance";
            }
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);            
            while (resultSet.next()) {
                
                employeeAttendance=new EmployeeAttendance(resultSet.getInt("EntryNo"),
                        resultSet.getString("Date"),
                        resultSet.getString("Time"),
                        resultSet.getString("ID"), 
                        resultSet.getString("Weekday"));                
                engineerAttendanceList.add(employeeAttendance);
            }        
        }catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
        }
        return engineerAttendanceList;
    }
    
    public void displayAttendanceTable(int option){
        ArrayList<EmployeeAttendance> list= Attendance(option);
        DefaultTableModel model=(DefaultTableModel)attendanceTable.getModel();
        Object[] row= new Object[5];        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getEntryNo();
            row[1]=list.get(i).getDate();
            row[2]=list.get(i).getTime();
            row[3]=list.get(i).getID();
            row[4]=list.get(i).getWeekday();
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
        attendanceTableTitleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        attendanceTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(156, 151, 178));

        jPanel1.setBackground(new java.awt.Color(156, 151, 178));

        attendanceTableTitleLabel.setBackground(new java.awt.Color(156, 151, 178));
        attendanceTableTitleLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        attendanceTableTitleLabel.setText("Engineer Attendance Table");

        jScrollPane1.setBackground(new java.awt.Color(156, 151, 178));
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setEnabled(false);

        attendanceTable.setBackground(new java.awt.Color(156, 151, 178));
        attendanceTable.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N
        attendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EntryNo", "Date", "Time", "ID", "Weekday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(attendanceTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(attendanceTableTitleLabel)
                .addContainerGap(162, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(attendanceTableTitleLabel)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(AttendanceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AttendanceTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable attendanceTable;
    private javax.swing.JLabel attendanceTableTitleLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}