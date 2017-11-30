
package src.cajas;

import javax.swing.ImageIcon;

public class Opcion extends javax.swing.JDialog {

    boolean res;
    
    public Opcion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Atencion");
        ImageIcon image = new javax.swing.ImageIcon(getClass().getResource("/src/cajas/icono.png"));
        setIconImage(image.getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPregunta = new javax.swing.JLabel();
        cmdTrue = new javax.swing.JButton();
        cmdFalso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblPregunta.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        lblPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPregunta.setText("jLabel1");

        cmdTrue.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        cmdTrue.setText("Sí");
        cmdTrue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTrueActionPerformed(evt);
            }
        });

        cmdFalso.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        cmdFalso.setText("No");
        cmdFalso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFalsoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(cmdTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(cmdFalso, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblPregunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdTrue, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdFalso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdTrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTrueActionPerformed

        res = true;
        setVisible(false);

    }//GEN-LAST:event_cmdTrueActionPerformed

    private void cmdFalsoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFalsoActionPerformed

        res = false;
        setVisible(false);

    }//GEN-LAST:event_cmdFalsoActionPerformed

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
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Opcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Opcion dialog = new Opcion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdFalso;
    private javax.swing.JButton cmdTrue;
    private javax.swing.JLabel lblPregunta;
    // End of variables declaration//GEN-END:variables

    public static boolean desplegar(String mensaje){
        
        Opcion caja = new Opcion(null, true);
        
        caja.lblPregunta.setText(mensaje);
        caja.setLocationRelativeTo(null);
        caja.setVisible(true);
        
        return caja.res;
        
    }
    
}
