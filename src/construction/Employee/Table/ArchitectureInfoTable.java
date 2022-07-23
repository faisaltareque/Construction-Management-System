/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Employee.Table;

import construction.Employee.EmployeePage;
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

class Architecture{
    String ID;
    String Name;
    String Contact;
    String Email;
    String Address;
    String EmergencyContact;
    String NID;
    String MonthlySalary;
    String JobStart;
    String JobEnd;
    String BankName;
    String BankAccount;

    public Architecture(String ID, String Name, String Contact, String Email, String Address, String EmergencyContact, String NID, String MonthlySalary, String JobStart, String JobEnd, String BankName, String BankAccount) {
        this.ID = ID;
        this.Name = Name;
        this.Contact = Contact;
        this.Email = Email;
        this.Address = Address;
        this.EmergencyContact = EmergencyContact;
        this.NID = NID;
        this.MonthlySalary = MonthlySalary;
        this.JobStart = JobStart;
        this.JobEnd = JobEnd;
        this.BankName = BankName;
        this.BankAccount = BankAccount;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getContact() {
        return Contact;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmergencyContact() {
        return EmergencyContact;
    }

    public String getNID() {
        return NID;
    }

    public String getMonthlySalary() {
        return MonthlySalary;
    }

    public String getJobStart() {
        return JobStart;
    }

    public String getJobEnd() {
        return JobEnd;
    }

    public String getBankName() {
        return BankName;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setEmergencyContact(String EmergencyContact) {
        this.EmergencyContact = EmergencyContact;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public void setMonthlySalary(String MonthlySalary) {
        this.MonthlySalary = MonthlySalary;
    }

    public void setJobStart(String JobStart) {
        this.JobStart = JobStart;
    }

    public void setJobEnd(String JobEnd) {
        this.JobEnd = JobEnd;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public void setBankAccount(String BankAccount) {
        this.BankAccount = BankAccount;
    }
    
}
public class ArchitectureInfoTable extends javax.swing.JFrame {

    /**
     * Creates new form ArchitectureInfoTable
     */
    public ArchitectureInfoTable(EmployeePage employeePage) {
        initComponents();
        displayTable();
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            employeePage.reEnable();
            dispose();
        }
    });
    }
    
    public ArrayList<Architecture> List(){
        ArrayList<Architecture> architectureList=new ArrayList<>();
        Architecture architecture;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
            String query="select * from Architecture";
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);            
            while (resultSet.next()) {                
                architecture=new Architecture(
                        resultSet.getString("ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("Contact"),
                        resultSet.getString("Email"),
                        resultSet.getString("Address"),
                        resultSet.getString("EmergencyContact"),
                        resultSet.getString("NID"),
                        resultSet.getString("MonthlySalary"),
                        resultSet.getString("JobStart"),
                        resultSet.getString("JobEnd"),
                        resultSet.getString("BankName"),
                        resultSet.getString("BankAccount"));                
                architectureList.add(architecture);
            }        
        }catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
        }
        return architectureList;
    }
    
    public void displayTable(){
        ArrayList<Architecture> list= List();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row= new Object[12];        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getID();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getContact();
            row[3]=list.get(i).getEmail();
            row[4]=list.get(i).getAddress();
            row[5]=list.get(i).getEmergencyContact();
            row[6]=list.get(i).getNID();
            row[7]=list.get(i).getMonthlySalary();
            row[8]=list.get(i).getJobStart();
            row[9]=list.get(i).getJobEnd();
            row[10]=list.get(i).getBankName();
            row[11]=list.get(i).getBankAccount();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Emaill", "Address", "EmergencyContact", "NID", "MoonthlySalary", "JobStart", "JobEnd", "BankName", "BankAccount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(ArchitectureInfoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArchitectureInfoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArchitectureInfoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArchitectureInfoTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ArchitectureInfoTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
