package src.cajas;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JDialog {

    String[] usuarios = {"Ramiro1", "Alberto2", "Admin"};
    String[] contraseñas = {"1234", "1234", "9999"};

    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblImageLogin = new javax.swing.JLabel();
        cmdAceptar = new javax.swing.JButton();
        pswContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        lblUsuario.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblUsuario.setText("Usuario:");

        lblContraseña.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblContraseña.setText("Contraseña:");

        txtUsuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        lblImageLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/cajas/login.jpg"))); // NOI18N

        cmdAceptar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmdAceptar.setText("Aceptar");
        cmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblImageLogin)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pswContraseña))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(cmdAceptar)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblImageLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContraseña)
                            .addComponent(pswContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmdAceptar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptarActionPerformed

        String usuarioIn = txtUsuario.getText();
        String contraseñaIn = pswContraseña.getText();
        int flag = 1, flag1 = 1;

        for (int i = 0; i < 3; i++) {

            if (usuarios[i].equals(usuarioIn)) {
                System.out.println("In");
                flag = 1; i = 3;
                

                for (int j = 0; j < 3; j++) {
                    if (contraseñas[j].equals(contraseñaIn)) {
                        flag1 = 1;
                        j = 3;
                        setVisible(false);

                    } else {
                        flag1 = 0;
                    }
                }

            } else {
                flag = 0;

            }
        }
       
        if(flag == 0){
            
            mensaje.desplegar("Usuario Incorrecto");
            txtUsuario.setText("");
        }
        if(flag1 == 0){
            
            mensaje.desplegar("Contraseña Incorrecta");
            pswContraseña.setText("");
        }
    }//GEN-LAST:event_cmdAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login dialog = new Login(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cmdAceptar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblImageLogin;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField pswContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    public static void desplegar() {

        Login caja = new Login(null, true);
        caja.setLocationRelativeTo(null);
        caja.setVisible(true);
    }

}
