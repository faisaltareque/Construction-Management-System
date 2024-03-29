/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Attendance;

import construction.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author faisa
 */
public class AttendancePage extends javax.swing.JFrame {

    /**
     * Creates new form AttendancePage
     */
    
    public void reEnable() {
        setEnabled(true);
    }
    public AttendancePage(FrontPage frontPage) {
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

        attendancePagePanel = new javax.swing.JPanel();
        attendancePageTitleLabel = new javax.swing.JLabel();
        attendancePageEntryLabel = new javax.swing.JLabel();
        attendancePageTableLabel = new javax.swing.JLabel();
        attendancePageQueryLabel = new javax.swing.JLabel();
        entryEngineerButton = new javax.swing.JButton();
        entryArchitectureButton = new javax.swing.JButton();
        entryLaborButton = new javax.swing.JButton();
        tableEngineerButton = new javax.swing.JButton();
        tableArchitectureButton = new javax.swing.JButton();
        tableLaborButton = new javax.swing.JButton();
        queryEngineerButton = new javax.swing.JButton();
        queryArchitectureButton = new javax.swing.JButton();
        queryLaborButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        attendancePagePanel.setBackground(new java.awt.Color(156, 151, 178));
        attendancePagePanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        attendancePagePanel.setPreferredSize(new java.awt.Dimension(420, 550));

        attendancePageTitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        attendancePageTitleLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        attendancePageTitleLabel.setText("Attendance");

        attendancePageEntryLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        attendancePageEntryLabel.setText("Table");
        attendancePageEntryLabel.setToolTipText("");

        attendancePageTableLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        attendancePageTableLabel.setText("Entry");
        attendancePageTableLabel.setToolTipText("");

        attendancePageQueryLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        attendancePageQueryLabel.setText("Query");
        attendancePageQueryLabel.setToolTipText("");

        entryEngineerButton.setBackground(new java.awt.Color(200, 185, 230));
        entryEngineerButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        entryEngineerButton.setText("Engineer");
        entryEngineerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entryEngineerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryEngineerButtonActionPerformed(evt);
            }
        });

        entryArchitectureButton.setBackground(new java.awt.Color(200, 185, 230));
        entryArchitectureButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        entryArchitectureButton.setText("Architecture");
        entryArchitectureButton.setBorderPainted(false);
        entryArchitectureButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entryArchitectureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryArchitectureButtonActionPerformed(evt);
            }
        });

        entryLaborButton.setBackground(new java.awt.Color(200, 185, 230));
        entryLaborButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        entryLaborButton.setText("Labor");
        entryLaborButton.setBorderPainted(false);
        entryLaborButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entryLaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryLaborButtonActionPerformed(evt);
            }
        });

        tableEngineerButton.setBackground(new java.awt.Color(200, 185, 230));
        tableEngineerButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tableEngineerButton.setText("Engineer");
        tableEngineerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableEngineerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableEngineerButtonActionPerformed(evt);
            }
        });

        tableArchitectureButton.setBackground(new java.awt.Color(200, 185, 230));
        tableArchitectureButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tableArchitectureButton.setText("Architecture");
        tableArchitectureButton.setBorderPainted(false);
        tableArchitectureButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableArchitectureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableArchitectureButtonActionPerformed(evt);
            }
        });

        tableLaborButton.setBackground(new java.awt.Color(200, 185, 230));
        tableLaborButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tableLaborButton.setText("Labor");
        tableLaborButton.setBorderPainted(false);
        tableLaborButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableLaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableLaborButtonActionPerformed(evt);
            }
        });

        queryEngineerButton.setBackground(new java.awt.Color(200, 185, 230));
        queryEngineerButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        queryEngineerButton.setText("Labor");
        queryEngineerButton.setBorderPainted(false);
        queryEngineerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queryEngineerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryEngineerButtonActionPerformed(evt);
            }
        });

        queryArchitectureButton.setBackground(new java.awt.Color(200, 185, 230));
        queryArchitectureButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        queryArchitectureButton.setText("Architecture");
        queryArchitectureButton.setBorderPainted(false);
        queryArchitectureButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queryArchitectureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryArchitectureButtonActionPerformed(evt);
            }
        });

        queryLaborButton.setBackground(new java.awt.Color(200, 185, 230));
        queryLaborButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        queryLaborButton.setText("Engineer");
        queryLaborButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queryLaborButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                queryLaborButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout attendancePagePanelLayout = new javax.swing.GroupLayout(attendancePagePanel);
        attendancePagePanel.setLayout(attendancePagePanelLayout);
        attendancePagePanelLayout.setHorizontalGroup(
            attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendancePagePanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(attendancePageTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(attendancePageEntryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(attendancePageQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(attendancePagePanelLayout.createSequentialGroup()
                .addGroup(attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(attendancePagePanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(entryEngineerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entryArchitectureButton)
                            .addComponent(entryLaborButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(queryArchitectureButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(queryEngineerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(attendancePagePanelLayout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(queryLaborButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(attendancePagePanelLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tableEngineerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attendancePageTitleLabel)
                            .addComponent(tableArchitectureButton)
                            .addComponent(tableLaborButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        attendancePagePanelLayout.setVerticalGroup(
            attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(attendancePagePanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(attendancePageTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attendancePageTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendancePageEntryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(attendancePageQueryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(queryLaborButton)
                    .addComponent(entryEngineerButton)
                    .addComponent(tableEngineerButton))
                .addGap(79, 79, 79)
                .addGroup(attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryArchitectureButton)
                    .addComponent(tableArchitectureButton)
                    .addComponent(queryArchitectureButton))
                .addGap(67, 67, 67)
                .addGroup(attendancePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryLaborButton)
                    .addComponent(tableLaborButton)
                    .addComponent(queryEngineerButton))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attendancePagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(attendancePagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        attendancePagePanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entryEngineerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryEngineerButtonActionPerformed
        // TODO add your handling code here:
        AttendanceEntryPage attendanceEntryPage=new AttendanceEntryPage(this,1);
        //dispose();
        setEnabled(false);
        attendanceEntryPage.setVisible(true);        
    }//GEN-LAST:event_entryEngineerButtonActionPerformed

    private void entryArchitectureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryArchitectureButtonActionPerformed
        // TODO add your handling code here:        
        AttendanceEntryPage attendanceEntryPage=new AttendanceEntryPage(this,2);
        //dispose();
        setEnabled(false);
        attendanceEntryPage.setVisible(true);  
    }//GEN-LAST:event_entryArchitectureButtonActionPerformed

    private void entryLaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryLaborButtonActionPerformed
        // TODO add your handling code here:
        AttendanceEntryPage attendanceEntryPage=new AttendanceEntryPage(this,3);
        //dispose();
        setEnabled(false);
        attendanceEntryPage.setVisible(true);  
    }//GEN-LAST:event_entryLaborButtonActionPerformed

    private void tableEngineerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableEngineerButtonActionPerformed
        // TODO add your handling code here:
        AttendanceTable attendanceTablePage=new AttendanceTable(this,1);
        //dispose();
        setEnabled(false);
        attendanceTablePage.setVisible(true);  
    }//GEN-LAST:event_tableEngineerButtonActionPerformed

    private void tableArchitectureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableArchitectureButtonActionPerformed
        // TODO add your handling code here:
        AttendanceTable attendanceTablePage=new AttendanceTable(this,2);
        //dispose();
        setEnabled(false);
        attendanceTablePage.setVisible(true); 
    }//GEN-LAST:event_tableArchitectureButtonActionPerformed

    private void tableLaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableLaborButtonActionPerformed
        // TODO add your handling code here:
        AttendanceTable attendanceTablePage=new AttendanceTable(this,3);
        //dispose();
        setEnabled(false);
        attendanceTablePage.setVisible(true); 
    }//GEN-LAST:event_tableLaborButtonActionPerformed

    private void queryEngineerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryEngineerButtonActionPerformed
        // TODO add your handling code here:
        AttendanceQuery attendanceQueryPage=new AttendanceQuery(this,3);
        //dispose();
        setEnabled(false);
        attendanceQueryPage.setVisible(true);
    }//GEN-LAST:event_queryEngineerButtonActionPerformed

    private void queryArchitectureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryArchitectureButtonActionPerformed
        // TODO add your handling code here:
        AttendanceQuery attendanceQueryPage=new AttendanceQuery(this,2);
        //dispose();
        setEnabled(false);
        attendanceQueryPage.setVisible(true); 
    }//GEN-LAST:event_queryArchitectureButtonActionPerformed

    private void queryLaborButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_queryLaborButtonActionPerformed
        // TODO add your handling code here:
        AttendanceQuery attendanceQueryPage=new AttendanceQuery(this,1);
        //dispose();
        setEnabled(false);
        attendanceQueryPage.setVisible(true); 
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
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendancePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AttendancePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel attendancePageEntryLabel;
    private javax.swing.JPanel attendancePagePanel;
    private javax.swing.JLabel attendancePageQueryLabel;
    private javax.swing.JLabel attendancePageTableLabel;
    private javax.swing.JLabel attendancePageTitleLabel;
    private javax.swing.JButton entryArchitectureButton;
    private javax.swing.JButton entryEngineerButton;
    private javax.swing.JButton entryLaborButton;
    private javax.swing.JButton queryArchitectureButton;
    private javax.swing.JButton queryEngineerButton;
    private javax.swing.JButton queryLaborButton;
    private javax.swing.JButton tableArchitectureButton;
    private javax.swing.JButton tableEngineerButton;
    private javax.swing.JButton tableLaborButton;
    // End of variables declaration//GEN-END:variables

    
}
