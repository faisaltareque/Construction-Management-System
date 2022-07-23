/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Purchase.Queries;

import construction.Purchase.PurchaseQueryPage;
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

class PurchaseOnDate{
    String trId;
    String itemID;
    String noOfUnit;
    String totalCost;
    String sellerID;
    String trDate;

    public PurchaseOnDate(String trId, String itemID, String noOfUnit, String totalCost, String sellerID, String trDate) {
        this.trId = trId;
        this.itemID = itemID;
        this.noOfUnit = noOfUnit;
        this.totalCost = totalCost;
        this.sellerID = sellerID;
        this.trDate = trDate;
    }

    public String getTrId() {
        return trId;
    }

    public String getItemID() {
        return itemID;
    }

    public String getNoOfUnit() {
        return noOfUnit;
    }

    public String getTotalCost() {
        return totalCost;
    }

    public String getSellerID() {
        return sellerID;
    }

    public String getTrDate() {
        return trDate;
    }
    
    
    
}

public class PurchaseOnDateInfo extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseOnDateInfo
     */
    
    String date;
    String sellerID;
    int type;
    public PurchaseOnDateInfo(PurchaseQueryPage purchaseQueryPage,int type,String date,String sellerID) {
        initComponents();
        this.date=date;
        this.sellerID=sellerID;
        this.type=type;
        reModelTable();
        displayTable();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            purchaseQueryPage.reEnable();
            dispose();
        }
    });        
    }
    
    public ArrayList<PurchaseOnDate> Attendance(){
        ArrayList<PurchaseOnDate> purchaseOnDateList=new ArrayList<>();
        PurchaseOnDate purchaseOnDate;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
            String query="";
            if(type==1){
                query="select TrID as ID,ItemID,NoOfUnit,TotalCost,SellerID,TrDate from Purchase where TrDate like '%"+date+"%'";
            }else if(type==2){
                query="select TrID as ID,ItemID,NoOfUnit,TotalCost,SellerID,TrDate from Purchase where SellerID like '%"+sellerID+"%'";
            }else if(type==3){
                query="select TrID as ID,ItemID,NoOfUnit,TotalCost,SellerID,TrDate from Purchase order by TotalCost desc";
            }else if(type==4){
                query="select TrID as ID,ItemID,NoOfUnit,TotalCost,SellerID,TrDate from Purchase order by NoOfUnit desc";
            }
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);    
            System.out.println();
            while (resultSet.next()) {  
                purchaseOnDate=new PurchaseOnDate(
                        resultSet.getString("ID"),
                        resultSet.getString("ItemID"),
                        resultSet.getString("NoOfUnit"),
                        resultSet.getString("TotalCost"),
                        resultSet.getString("SellerID"),
                        resultSet.getString("TrDate"));                
                purchaseOnDateList.add(purchaseOnDate);
            }        
        }catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
        }
        return purchaseOnDateList;
    }
    
    public void displayTable(){
        ArrayList<PurchaseOnDate> list= Attendance();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
            Object[] row= new Object[5];        
            for(int i=0;i<list.size();i++){
                row[0]=list.get(i).getTrId();
                row[1]=list.get(i).getItemID();
                row[2]=list.get(i).getNoOfUnit();
                row[3]=list.get(i).getTotalCost();
                if(type==1){
                    row[4]=list.get(i).getSellerID();
                }else if(type==2||type==3||type==4){
                    row[4]=list.get(i).getTrDate();
                }
                model.addRow(row);
            }        
    }

    public void reModelTable(){
        if(type==2||type==3||type==4){
            jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TrID", "ItemID", "NoOfUnit", "TotalCost", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);            
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
                "TrID", "ItemID", "NoOfUnit", "TotalCost", "SellerID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
            java.util.logging.Logger.getLogger(PurchaseOnDateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOnDateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOnDateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOnDateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PurchaseOnDateInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
