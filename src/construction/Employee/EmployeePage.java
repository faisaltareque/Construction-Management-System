/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Employee;

import construction.Employee.Insert.ArchitectureInfoInsert;
import construction.Employee.Insert.EngineerInfoInsert;
import construction.Employee.Insert.LaborInfoInsert;
import construction.Employee.Table.ArchitectureInfoTable;
import construction.Employee.Table.EngineerInfoTable;
import construction.Employee.Table.LaborInfoTable;
import construction.Employee.Update.EmployeeUpdateLink;
import construction.Employee.WorkTree.InsertWorkTree;
import construction.Employee.WorkTree.UpdateWorkTree;
import construction.FrontPage;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author faisa
 */
public class EmployeePage extends javax.swing.JFrame {

    /**
     * Creates new form EmployeePage
     */
    public void reEnable() {
        setEnabled(true);
    }
    
    public EmployeePage(FrontPage frontPage) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent event) {
            frontPage.reEnable();
            dispose();
        }
    });
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        showEngineerButton = new javax.swing.JButton();
        showArchitectureButton = new javax.swing.JButton();
        showLaborButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        insertEngineerButton = new javax.swing.JButton();
        insertArchitectureButton = new javax.swing.JButton();
        insertLaborButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        deleteEngineerButton = new javax.swing.JButton();
        deleteArchitectureButton = new javax.swing.JButton();
        deleteLaborButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        updateEngineerButton = new javax.swing.JButton();
        updateArchitectureButton = new javax.swing.JButton();
        updateLaborButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        queryEngineerButton = new javax.swing.JButton();
        queryArchitectureButton = new javax.swing.JButton();
        queryLaborButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        architectureEngineerInsertButton = new javax.swing.JButton();
        architectureEngineerInsertButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        architectureEngineerInsertButton2 = new javax.swing.JButton();
        architectureEngineerInsertButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 725));

        jPanel1.setBackground(new java.awt.Color(156, 151, 178));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 725));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Employee Information");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Show Table");

        showEngineerButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        showEngineerButton.setText("Engineer");
        showEngineerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEngineerButtonActionPerformed(evt);
            }
        });

        showArchitectureButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        showArchitectureButton.setText("Architecture");
        showArchitectureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showArchitectureButtonActionPerformed(evt);
            }
        });

        showLaborButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        showLaborButton.setText("Labor");
        showLaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showLaborButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Insert");

        insertEngineerButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        insertEngineerButton.setText("Engineer");
        insertEngineerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertEngineerButtonActionPerformed(evt);
            }
        });

        insertArchitectureButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        insertArchitectureButton.setText("Architecture");
        insertArchitectureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertArchitectureButtonActionPerformed(evt);
            }
        });

        insertLaborButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        insertLaborButton.setText("Labor");
        insertLaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertLaborButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setText("Delete");

        deleteEngineerButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deleteEngineerButton.setText("Engineer");
        deleteEngineerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEngineerButtonActionPerformed(evt);
            }
        });

        deleteArchitectureButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deleteArchitectureButton.setText("Architecture");
        deleteArchitectureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteArchitectureButtonActionPerformed(evt);
            }
        });

        deleteLaborButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        deleteLaborButton.setText("Labor");
        deleteLaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteLaborButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setText("Update");

        updateEngineerButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        updateEngineerButton.setText("Engineer");
        updateEngineerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateEngineerButtonActionPerformed(evt);
            }
        });

        updateArchitectureButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        updateArchitectureButton.setText("Architecture");
        updateArchitectureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateArchitectureButtonActionPerformed(evt);
            }
        });

        updateLaborButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        updateLaborButton.setText("Labor");
        updateLaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateLaborButtonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setText("Query");

        queryEngineerButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        queryEngineerButton.setText("Engineer");
        queryEngineerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryEngineerButtonActionPerformed(evt);
            }
        });

        queryArchitectureButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        queryArchitectureButton.setText("Architecture");
        queryArchitectureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryArchitectureButtonActionPerformed(evt);
            }
        });

        queryLaborButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        queryLaborButton.setText("Labor");
        queryLaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryLaborButtonActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(156, 151, 178));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7.setText("Insert");

        architectureEngineerInsertButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        architectureEngineerInsertButton.setText("Architecture-Engineer");
        architectureEngineerInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                architectureEngineerInsertButtonActionPerformed(evt);
            }
        });

        architectureEngineerInsertButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        architectureEngineerInsertButton1.setText("Engineer-Labor");
        architectureEngineerInsertButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                architectureEngineerInsertButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel8.setText("Delete");

        architectureEngineerInsertButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        architectureEngineerInsertButton2.setText("Architecture-Engineer");
        architectureEngineerInsertButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                architectureEngineerInsertButton2ActionPerformed(evt);
            }
        });

        architectureEngineerInsertButton3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        architectureEngineerInsertButton3.setText("Engineer-Labor");
        architectureEngineerInsertButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                architectureEngineerInsertButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(architectureEngineerInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(architectureEngineerInsertButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(architectureEngineerInsertButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(architectureEngineerInsertButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(architectureEngineerInsertButton)
                .addGap(18, 18, 18)
                .addComponent(architectureEngineerInsertButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(architectureEngineerInsertButton2)
                .addGap(18, 18, 18)
                .addComponent(architectureEngineerInsertButton3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(showEngineerButton))
                    .addComponent(insertEngineerButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteEngineerButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateEngineerButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(queryEngineerButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertArchitectureButton)
                    .addComponent(showArchitectureButton)
                    .addComponent(deleteArchitectureButton)
                    .addComponent(updateArchitectureButton)
                    .addComponent(queryArchitectureButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertLaborButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showLaborButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteLaborButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updateLaborButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(queryLaborButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(showEngineerButton)
                    .addComponent(showArchitectureButton)
                    .addComponent(showLaborButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(insertEngineerButton)
                    .addComponent(insertArchitectureButton)
                    .addComponent(insertLaborButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(deleteEngineerButton)
                    .addComponent(deleteArchitectureButton)
                    .addComponent(deleteLaborButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(updateEngineerButton)
                    .addComponent(updateArchitectureButton)
                    .addComponent(updateLaborButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(queryEngineerButton)
                    .addComponent(queryArchitectureButton)
                    .addComponent(queryLaborButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
                         ******Button ACION START******    
    */
    private void showEngineerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEngineerButtonActionPerformed
        // TODO add your handling code here:
        EngineerInfoTable engineerInfoTable=new EngineerInfoTable(this);
        setEnabled(false);
        engineerInfoTable.setVisible(true);
    }//GEN-LAST:event_showEngineerButtonActionPerformed
    
    private void insertEngineerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertEngineerButtonActionPerformed
        // TODO add your handling code here:
        EngineerInfoInsert engineerInfoinsert=new EngineerInfoInsert(this);
        setEnabled(false);
        engineerInfoinsert.setVisible(true);
    }//GEN-LAST:event_insertEngineerButtonActionPerformed

    private void deleteEngineerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEngineerButtonActionPerformed
        // TODO add your handling code here:
        Delete delete=new Delete(this,1);
        setEnabled(false);
        delete.setVisible(true);
    }//GEN-LAST:event_deleteEngineerButtonActionPerformed

    private void updateEngineerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateEngineerButtonActionPerformed
        // TODO add your handling code here:
        EmployeeUpdateLink employeeUpdateLink=new EmployeeUpdateLink(this,1);
        setEnabled(false);
        employeeUpdateLink.setVisible(true);
    }//GEN-LAST:event_updateEngineerButtonActionPerformed

    private void queryEngineerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryEngineerButtonActionPerformed
        // TODO add your handling code here:
        QueryPage queryPage=new QueryPage(this,1);
        setEnabled(false);
        queryPage.setVisible(true);
    }//GEN-LAST:event_queryEngineerButtonActionPerformed

    private void showArchitectureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showArchitectureButtonActionPerformed
        // TODO add your handling code here:
        ArchitectureInfoTable architectureInfoTable=new ArchitectureInfoTable(this);
        setEnabled(false);
        architectureInfoTable.setVisible(true);
    }//GEN-LAST:event_showArchitectureButtonActionPerformed

    private void showLaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showLaborButtonActionPerformed
        // TODO add your handling code here:        
        LaborInfoTable laborInfoTable=new LaborInfoTable(this);
        setEnabled(false);
        laborInfoTable.setVisible(true);
    }//GEN-LAST:event_showLaborButtonActionPerformed

    private void deleteArchitectureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteArchitectureButtonActionPerformed
        // TODO add your handling code here:
        Delete delete=new Delete(this,2);
        setEnabled(false);
        delete.setVisible(true);
    }//GEN-LAST:event_deleteArchitectureButtonActionPerformed

    private void insertArchitectureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertArchitectureButtonActionPerformed
        // TODO add your handling code here:
        ArchitectureInfoInsert architectureInfoinsert=new ArchitectureInfoInsert(this);
        setEnabled(false);
        architectureInfoinsert.setVisible(true);
    }//GEN-LAST:event_insertArchitectureButtonActionPerformed

    private void deleteLaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteLaborButtonActionPerformed
        // TODO add your handling code here:
        Delete delete=new Delete(this,3);
        setEnabled(false);
        delete.setVisible(true);
    }//GEN-LAST:event_deleteLaborButtonActionPerformed

    private void updateArchitectureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateArchitectureButtonActionPerformed
        // TODO add your handling code here:
        EmployeeUpdateLink employeeUpdateLink=new EmployeeUpdateLink(this,2);
        setEnabled(false);
        employeeUpdateLink.setVisible(true);
    }//GEN-LAST:event_updateArchitectureButtonActionPerformed

    private void updateLaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateLaborButtonActionPerformed
        // TODO add your handling code here:
        EmployeeUpdateLink employeeUpdateLink=new EmployeeUpdateLink(this,3);
        setEnabled(false);
        employeeUpdateLink.setVisible(true);
    }//GEN-LAST:event_updateLaborButtonActionPerformed

    private void insertLaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertLaborButtonActionPerformed
        // TODO add your handling code here:
        LaborInfoInsert laborInfoInsert=new LaborInfoInsert(this);
        setEnabled(false);
        laborInfoInsert.setVisible(true);
        
    }//GEN-LAST:event_insertLaborButtonActionPerformed

    private void architectureEngineerInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_architectureEngineerInsertButtonActionPerformed
        // TODO add your handling code here:
        InsertWorkTree insertWorkTree=new InsertWorkTree(this,1);
        setEnabled(false);
        insertWorkTree.setVisible(true);
    }//GEN-LAST:event_architectureEngineerInsertButtonActionPerformed

    private void architectureEngineerInsertButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_architectureEngineerInsertButton1ActionPerformed
        // TODO add your handling code here:
        InsertWorkTree insertWorkTree=new InsertWorkTree(this,2);
        setEnabled(false);
        insertWorkTree.setVisible(true);
    }//GEN-LAST:event_architectureEngineerInsertButton1ActionPerformed

    private void architectureEngineerInsertButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_architectureEngineerInsertButton2ActionPerformed
        // TODO add your handling code here:
        UpdateWorkTree updateWorkTree=new UpdateWorkTree(this,1);
        setEnabled(false);
        updateWorkTree.setVisible(true);
    }//GEN-LAST:event_architectureEngineerInsertButton2ActionPerformed

    private void architectureEngineerInsertButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_architectureEngineerInsertButton3ActionPerformed
        // TODO add your handling code here:
        UpdateWorkTree updateWorkTree=new UpdateWorkTree(this,2);
        setEnabled(false);
        updateWorkTree.setVisible(true);
    }//GEN-LAST:event_architectureEngineerInsertButton3ActionPerformed

    private void queryArchitectureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryArchitectureButtonActionPerformed
        // TODO add your handling code here:
        QueryPage queryPage=new QueryPage(this,2);
        setEnabled(false);
        queryPage.setVisible(true);
    }//GEN-LAST:event_queryArchitectureButtonActionPerformed

    private void queryLaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryLaborButtonActionPerformed
        // TODO add your handling code here:
        QueryPage queryPage=new QueryPage(this,3);
        setEnabled(false);
        queryPage.setVisible(true);
    }//GEN-LAST:event_queryLaborButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new EmployeePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton architectureEngineerInsertButton;
    private javax.swing.JButton architectureEngineerInsertButton1;
    private javax.swing.JButton architectureEngineerInsertButton2;
    private javax.swing.JButton architectureEngineerInsertButton3;
    private javax.swing.JButton deleteArchitectureButton;
    private javax.swing.JButton deleteEngineerButton;
    private javax.swing.JButton deleteLaborButton;
    private javax.swing.JButton insertArchitectureButton;
    private javax.swing.JButton insertEngineerButton;
    private javax.swing.JButton insertLaborButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton queryArchitectureButton;
    private javax.swing.JButton queryEngineerButton;
    private javax.swing.JButton queryLaborButton;
    private javax.swing.JButton showArchitectureButton;
    private javax.swing.JButton showEngineerButton;
    private javax.swing.JButton showLaborButton;
    private javax.swing.JButton updateArchitectureButton;
    private javax.swing.JButton updateEngineerButton;
    private javax.swing.JButton updateLaborButton;
    // End of variables declaration//GEN-END:variables
}
