/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Materials;

import construction.Class.Material;
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
public class MaterialTable extends javax.swing.JFrame {

    /**
     * Creates new form MaterialTable
     */
    public MaterialTable(MaterialPage materialPage) {
        initComponents();
        displayTable();
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            materialPage.reEnable();
            dispose();
        }
    });
    }
    
    public ArrayList<Material> List(){
        ArrayList<Material> materialList=new ArrayList<>();
        Material material;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Construction;selectMethod=cursor", "sa", "123456");
            String query="select * from Material";
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);            
            while (resultSet.next()) {                
                material=new Material(
                        resultSet.getString("ID"),
                        resultSet.getString("Name"),
                        resultSet.getString("UnitPrice"),
                        resultSet.getString("EstimatedAmount"),
                        resultSet.getString("PurchasedAmount"),                      
                        resultSet.getString("TotalCost"));                
                materialList.add(material);
            }        
        }catch (Exception e) {
          JOptionPane.showMessageDialog(null,e);
        }
        return materialList;
    }
    
    public void displayTable(){
        ArrayList<Material> list= List();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        Object[] row= new Object[14];        
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getID();
            row[1]=list.get(i).getName();
            row[2]=list.get(i).getUnitPrice();
            row[3]=list.get(i).getEstimatedAmount();
            row[4]=list.get(i).getPurchasedAmount();
            row[5]=list.get(i).getTotalCost();
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
                "ID", "Name", "UnitPrice", "EstimatedAmount", "PurchasedAmount", "TotalCost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(MaterialTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaterialTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaterialTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaterialTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MaterialTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
