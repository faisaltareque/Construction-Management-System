/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Seller.Queries;

import construction.Seller.QueryPage;
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

class SellerInfoDiscount{
    String id;
    String name;
    String contact;
    String discount;
    String due;
    String advance;

    public SellerInfoDiscount(String id, String name, String contact, String discount, String due, String advance) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.discount = discount;
        this.due = due;
        this.advance = advance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getDiscount() {
        return discount;
    }

    public String getDue() {
        return due;
    }

    public String getAdvance() {
        return advance;
    }
    
}

public class SellerDiscount extends javax.swing.JFrame {

    /**
     * Creates new form SellerDiscount
     */
    int type;
    public SellerDiscount(QueryPage queryPage,int type) {
        initComponents();
        this.type=type;
        remodelTable();
        displayTable();
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
    public void remodelTable(){
        if(type==2){
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Due"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        }else if(type==3){
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Advance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        }
    }
    
    public ArrayList<SellerInfoDiscount> Attendance(){
        ArrayList<SellerInfoDiscount> sellerInfoDiscountList=new ArrayList<>();
        SellerInfoDiscount sellerInfoDiscount;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
            String query="";
            if(type==1){
                query="select ID,Name,Contact,Discount,DuePayment,AdvancePayment from Seller order by Discount desc";
            }else if(type==2){
                query="select ID,Name,Contact,Discount,DuePayment,AdvancePayment from Seller order by DuePayment desc";
            }else if(type==3){
                query="select ID,Name,Contact,Discount,DuePayment,AdvancePayment from Seller order by AdvancePayment desc";
            }
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);    
            System.out.println();
            while (resultSet.next()) {  
                sellerInfoDiscount=new SellerInfoDiscount(
                        resultSet.getString("ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("Contact"),
                        resultSet.getString("Discount"),
                        resultSet.getString("DuePayment"),
                        resultSet.getString("AdvancePayment"));                
                sellerInfoDiscountList.add(sellerInfoDiscount);
            }        
        }catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
        }
        return sellerInfoDiscountList;
    }
    
    public void displayTable(){
        ArrayList<SellerInfoDiscount> list= Attendance();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row= new Object[4];        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getContact();
            if(type==1){
                row[3]=list.get(i).getDiscount();
            }else if(type==2){
                row[3]=list.get(i).getDue();
            }else if(type==3){
                row[3]=list.get(i).getAdvance();
            }
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

        jPanel1.setBackground(new java.awt.Color(156, 151, 178));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Discount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(SellerDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerDiscount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SellerDiscount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
