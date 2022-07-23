/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Employee.Queries;

import construction.Employee.QueryPage;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author faisa
 */
public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    int option;
    String id;
    public Profile(QueryPage queryPage,int option,String id) {
        initComponents();
        this.option=option;
        this.id=id;
        if(option==1){
            
        }
        if(option==2){
            titleLabel.setText("Architecture");
            overtimeLabel.setVisible(false);
            overtimeInfo.setVisible(false);
            bonusInfo.setVisible(false);
            bonusLabel.setVisible(false);            
        }else if(option==3){
            titleLabel.setText("Labor");
            bankAccountInfo.setVisible(false);
            bankAccountLabel.setVisible(false);
            bankNameInfo.setVisible(false);
            bankNameLabel.setVisible(false);
            jobInfo.setVisible(false);
            jobLabel.setVisible(false);
            salaryLabel.setText("Daily Salary");
        }
        showProfile();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            queryPage.reEnable();
            dispose();
        }
    });
    }
    
    public  void showProfile(){
        if(option==1){
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
                String query="select * from Engineer where ID like '"+id+"'";            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);            
                resultSet.next();
            
                IDInfo.setText(resultSet.getString("ID"));
                nameInfo.setText(resultSet.getString("Name"));
                contactInfo.setText(resultSet.getString("Contact"));
                emailInfo.setText(resultSet.getString("Email"));
                addressInfo.setText(resultSet.getString("Address"));
                emergencyContactInfo.setText(resultSet.getString("EmergencyContact"));
                NIDInfo.setText(resultSet.getString("NID"));
                salaryInfo.setText(resultSet.getString("MonthlySalary"));
                jobInfo.setText(resultSet.getString("JobStart"));
                bankNameInfo.setText(resultSet.getString("BankName"));
                bankAccountInfo.setText(resultSet.getString("BankAccount"));
                overtimeInfo.setText(resultSet.getString("OverTime"));
                bonusInfo.setText(resultSet.getString("Bonus"));
            
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
            
        }else if(option==3){
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
                String query="select * from Labor where ID like '"+id+"'";            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);            
                resultSet.next();
            
                IDInfo.setText(resultSet.getString("ID"));
                nameInfo.setText(resultSet.getString("Name"));
                contactInfo.setText(resultSet.getString("Contact"));
                emailInfo.setText(resultSet.getString("Email"));
                addressInfo.setText(resultSet.getString("Address"));
                emergencyContactInfo.setText(resultSet.getString("EmergencyContact"));
                NIDInfo.setText(resultSet.getString("NID"));
                salaryInfo.setText(resultSet.getString("DailySalary"));
                overtimeInfo.setText(resultSet.getString("OverTime"));
                bonusInfo.setText(resultSet.getString("Bonus"));
                
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
            
        }else if(option==2){
            try{
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
                String query="select * from Architecture where ID like '"+id+"'";            
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);            
                resultSet.next();
            
                IDInfo.setText(resultSet.getString("ID"));
                nameInfo.setText(resultSet.getString("Name"));
                contactInfo.setText(resultSet.getString("Contact"));
                emailInfo.setText(resultSet.getString("Email"));
                addressInfo.setText(resultSet.getString("Address"));
                emergencyContactInfo.setText(resultSet.getString("EmergencyContact"));
                NIDInfo.setText(resultSet.getString("NID"));
                salaryInfo.setText(resultSet.getString("MonthlySalary"));
                jobInfo.setText(resultSet.getString("JobStart"));
                bankNameInfo.setText(resultSet.getString("BankName"));
                bankAccountInfo.setText(resultSet.getString("BankAccount"));
                
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,e);
            }
            
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
        titleLabel = new javax.swing.JLabel();
        IDInfo = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        nameInfo = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        contactInfo = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        emailInfo = new javax.swing.JLabel();
        emergencyContactLabel = new javax.swing.JLabel();
        emergencyContactInfo = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        addressInfo = new javax.swing.JLabel();
        NIDLabel = new javax.swing.JLabel();
        NIDInfo = new javax.swing.JLabel();
        salaryLabel = new javax.swing.JLabel();
        bankNameInfo = new javax.swing.JLabel();
        bankNameLabel = new javax.swing.JLabel();
        salaryInfo = new javax.swing.JLabel();
        bankAccountLabel = new javax.swing.JLabel();
        bankAccountInfo = new javax.swing.JLabel();
        jobLabel = new javax.swing.JLabel();
        jobInfo = new javax.swing.JLabel();
        overtimeLabel = new javax.swing.JLabel();
        overtimeInfo = new javax.swing.JLabel();
        bonusLabel = new javax.swing.JLabel();
        bonusInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(156, 151, 178));

        titleLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        titleLabel.setText("Engineer");

        IDInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        IDInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDInfo.setText("ID:");

        contactLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        contactLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contactLabel.setText("Contact : ");

        nameInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nameInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameInfo.setText("Faiaz Ar Rafi");

        nameLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nameLabel.setText("Name : ");

        contactInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        contactInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        contactInfo.setText("+8801956253614");

        emailLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emailLabel.setText("Email : ");

        emailInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emailInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emailInfo.setText("faiaz@gmail.com");

        emergencyContactLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emergencyContactLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emergencyContactLabel.setText("Emergency Contact : ");

        emergencyContactInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        emergencyContactInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        emergencyContactInfo.setText("+8801956253614");

        addressLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        addressLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addressLabel.setText("Address : ");

        addressInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        addressInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addressInfo.setText("Mirpur");

        NIDLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        NIDLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NIDLabel.setText("NID : ");

        NIDInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        NIDInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NIDInfo.setText("15936247896325147");

        salaryLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        salaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salaryLabel.setText("Monthly Salary : ");

        bankNameInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bankNameInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bankNameInfo.setText("DBBL");

        bankNameLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bankNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bankNameLabel.setText("Bank Name : ");

        salaryInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        salaryInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salaryInfo.setText("11000");

        bankAccountLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bankAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bankAccountLabel.setText("Bank Account : ");

        bankAccountInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bankAccountInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bankAccountInfo.setText("145.236.596");

        jobLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jobLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jobLabel.setText("Job Start : ");

        jobInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jobInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jobInfo.setText("2019-06-21");

        overtimeLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        overtimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        overtimeLabel.setText("Over Time : ");

        overtimeInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        overtimeInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        overtimeInfo.setText("6");

        bonusLabel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bonusLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bonusLabel.setText("Bonus :  ");

        bonusInfo.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bonusInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bonusInfo.setText("256");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(emergencyContactLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addComponent(emergencyContactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(contactInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(NIDLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(NIDInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(salaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salaryInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bankAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bankAccountInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(bankNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bankNameInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jobLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jobInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(overtimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(overtimeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bonusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bonusInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(IDInfo)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(nameInfo)
                    .addComponent(nameLabel)
                    .addComponent(contactInfo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailInfo)
                    .addComponent(emergencyContactLabel)
                    .addComponent(emergencyContactInfo))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressInfo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NIDLabel)
                    .addComponent(NIDInfo))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankNameLabel)
                            .addComponent(bankNameInfo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bankAccountLabel)
                            .addComponent(bankAccountInfo)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryLabel)
                            .addComponent(salaryInfo))))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jobLabel)
                    .addComponent(jobInfo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(overtimeLabel)
                    .addComponent(overtimeInfo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bonusLabel)
                    .addComponent(bonusInfo))
                .addContainerGap(31, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDInfo;
    private javax.swing.JLabel NIDInfo;
    private javax.swing.JLabel NIDLabel;
    private javax.swing.JLabel addressInfo;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel bankAccountInfo;
    private javax.swing.JLabel bankAccountLabel;
    private javax.swing.JLabel bankNameInfo;
    private javax.swing.JLabel bankNameLabel;
    private javax.swing.JLabel bonusInfo;
    private javax.swing.JLabel bonusLabel;
    private javax.swing.JLabel contactInfo;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailInfo;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emergencyContactInfo;
    private javax.swing.JLabel emergencyContactLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jobInfo;
    private javax.swing.JLabel jobLabel;
    private javax.swing.JLabel nameInfo;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel overtimeInfo;
    private javax.swing.JLabel overtimeLabel;
    private javax.swing.JLabel salaryInfo;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
