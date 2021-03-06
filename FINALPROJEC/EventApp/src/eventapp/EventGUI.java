/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventapp;

import javax.swing.JOptionPane;

/**
 *
 * @author aenni
 */
public class EventGUI extends javax.swing.JFrame {

        /**
     * Creates new form EventGUI
     */
    
    String name;
    String type;
    String date;
    String location;
    
//    String all = ;
    
    public EventGUI() {
        super("Events Calendar Program - NCI");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        avivaD = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        viewE = new javax.swing.JButton();
        addE = new javax.swing.JButton();
        printE = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        viewP = new javax.swing.JPanel();
        avivaB = new javax.swing.JButton();
        crokeB = new javax.swing.JButton();
        kingspanB = new javax.swing.JButton();
        thomondB = new javax.swing.JButton();
        avivaLabel = new javax.swing.JLabel();
        crokeLabel = new javax.swing.JLabel();
        kingspanLabel = new javax.swing.JLabel();
        thomondLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        addP = new javax.swing.JPanel();
        saveNew = new javax.swing.JButton();
        clearForm = new javax.swing.JButton();

        avivaD.setMinimumSize(new java.awt.Dimension(800, 450));

        javax.swing.GroupLayout avivaDLayout = new javax.swing.GroupLayout(avivaD.getContentPane());
        avivaD.getContentPane().setLayout(avivaDLayout);
        avivaDLayout.setHorizontalGroup(
            avivaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        avivaDLayout.setVerticalGroup(
            avivaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        viewE.setText("View Events");
        viewE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewEActionPerformed(evt);
            }
        });

        addE.setText("Add Event");
        addE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEActionPerformed(evt);
            }
        });

        printE.setText("Save to File");
        printE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printEActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(viewE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(printE)
                                .addComponent(addE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new java.awt.CardLayout());

        viewP.setBackground(new java.awt.Color(153, 255, 153));
        viewP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        avivaB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventapp/aviva.jpg"))); // NOI18N
        avivaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avivaBActionPerformed(evt);
            }
        });

        crokeB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventapp/croke.jpg"))); // NOI18N

        kingspanB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventapp/thomond.jpg"))); // NOI18N

        thomondB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eventapp/kingspan.jpg"))); // NOI18N

        avivaLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        avivaLabel.setText("AVIVA STADIUM");

        crokeLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        crokeLabel.setText("CROKE PARK");

        kingspanLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        kingspanLabel.setText("KINGSPAN STADIUM");

        thomondLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        thomondLabel.setText("THOMOND PARK");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        jLabel1.setText("VIEW EVENTS BY LOCATION");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout viewPLayout = new javax.swing.GroupLayout(viewP);
        viewP.setLayout(viewPLayout);
        viewPLayout.setHorizontalGroup(
            viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(189, 189, 189))
            .addGroup(viewPLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(avivaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thomondB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(viewPLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(avivaLabel))
                    .addComponent(kingspanLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator5))
                .addGap(112, 112, 112)
                .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(crokeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kingspanB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(viewPLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(crokeLabel))
                    .addGroup(viewPLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(thomondLabel))
                    .addComponent(jSeparator7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewPLayout.setVerticalGroup(
            viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewPLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(viewPLayout.createSequentialGroup()
                        .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(avivaB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(crokeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avivaLabel)
                            .addComponent(crokeLabel)))
                    .addComponent(jSeparator1))
                .addGap(18, 18, 18)
                .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewPLayout.createSequentialGroup()
                        .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(thomondB)
                            .addComponent(kingspanB))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kingspanLabel)
                            .addComponent(thomondLabel)))
                    .addGroup(viewPLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jPanel2.add(viewP, "card2");

        addP.setBackground(new java.awt.Color(153, 204, 255));

        saveNew.setText("Save Event");
        saveNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNewActionPerformed(evt);
            }
        });

        clearForm.setText("Clear Form");
        clearForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPLayout = new javax.swing.GroupLayout(addP);
        addP.setLayout(addPLayout);
        addPLayout.setHorizontalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(saveNew)
                .addGap(130, 130, 130)
                .addComponent(clearForm)
                .addContainerGap(490, Short.MAX_VALUE))
        );
        addPLayout.setVerticalGroup(
            addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPLayout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(addPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveNew)
                    .addComponent(clearForm))
                .addGap(233, 233, 233))
        );

        jPanel2.add(addP, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewEActionPerformed
        viewP.setVisible(true);
        addP.setVisible(false);
    }//GEN-LAST:event_viewEActionPerformed

    private void addEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEActionPerformed
        viewP.setVisible(false);
        addP.setVisible(true);
    }//GEN-LAST:event_addEActionPerformed

    private void avivaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avivaBActionPerformed
        avivaD.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_avivaBActionPerformed

    private void printEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printEActionPerformed

    private void clearFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearFormActionPerformed

    }//GEN-LAST:event_clearFormActionPerformed

    private void saveNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNewActionPerformed
        //        String name, type, location, date, all;
        name = whoT.getText();
        type = typeT.getText();
        location = locationT.getText();
        date = dateT.getText();

        JOptionPane.showMessageDialog(null, "The event has been added to the list.");

        // TODO add your handling code here:
    }//GEN-LAST:event_saveNewActionPerformed

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
            java.util.logging.Logger.getLogger(EventGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addE;
    private javax.swing.JPanel addP;
    private javax.swing.JButton avivaB;
    private javax.swing.JDialog avivaD;
    private javax.swing.JLabel avivaLabel;
    private javax.swing.JButton clearForm;
    private javax.swing.JButton crokeB;
    private javax.swing.JLabel crokeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JButton kingspanB;
    private javax.swing.JLabel kingspanLabel;
    private javax.swing.JButton printE;
    private javax.swing.JButton saveNew;
    private javax.swing.JButton thomondB;
    private javax.swing.JLabel thomondLabel;
    private javax.swing.JButton viewE;
    private javax.swing.JPanel viewP;
    // End of variables declaration//GEN-END:variables
}
