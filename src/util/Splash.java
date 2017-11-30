package util;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import src.cajas.Login;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash extends javax.swing.JFrame implements Runnable {
    
    Thread hilo;
    
    public Splash() {
        initComponents();
        setLocationRelativeTo(null);
        hilo = new Thread(this);
        hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAreaSplash = new javax.swing.JPanel();
        lblLeyenda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);

        pnlAreaSplash.setBackground(new java.awt.Color(0, 0, 0));

        lblLeyenda.setFont(new java.awt.Font("Orator Std", 1, 14)); // NOI18N
        lblLeyenda.setForeground(new java.awt.Color(255, 255, 255));
        lblLeyenda.setText("Autores: Ramiro Solis, Alberto Trevizo, Javi Sanchex e Isack Ramirez");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/util/logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlAreaSplashLayout = new javax.swing.GroupLayout(pnlAreaSplash);
        pnlAreaSplash.setLayout(pnlAreaSplashLayout);
        pnlAreaSplashLayout.setHorizontalGroup(
            pnlAreaSplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAreaSplashLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(pnlAreaSplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaSplashLayout.createSequentialGroup()
                        .addComponent(lblLeyenda)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAreaSplashLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        pnlAreaSplashLayout.setVerticalGroup(
            pnlAreaSplashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAreaSplashLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblLeyenda)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAreaSplash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAreaSplash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLeyenda;
    private javax.swing.JPanel pnlAreaSplash;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {

        try {
            Thread.sleep(7000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
        Login.desplegar();
    }
    
}
