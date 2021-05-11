/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample.minisuper.view;

import org.sample.minisuper.model.Usuarios;

/**
 *
 * @author victorm
 */
public class VistaEmpleadoHome extends javax.swing.JFrame {
    private final VistaEmpleadoVentas vistaEmpleadoVentas;
    private final VistaEmpleadoAlmacen vistaEmpleadoAlmacen;
    private static VistaEmpleadoHome vistaEmpleadoHome = null;
    private final VistaInicioSesion vistaInicioSesion;
    private Usuarios usuario;

    /**
     * Creates new form VistaEmpleadoHome
     */
    private VistaEmpleadoHome() {
        this.setResizable(false);
        vistaEmpleadoAlmacen = VistaEmpleadoAlmacen.getInstance();
        vistaEmpleadoVentas = VistaEmpleadoVentas.getInstance();
        vistaInicioSesion = VistaInicioSesion.getInstance();
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

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btnVentas = new javax.swing.JToggleButton();
        btnAlmacen = new javax.swing.JToggleButton();
        btnCerrar_Sesion = new javax.swing.JToggleButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btnVentas.setBackground(new java.awt.Color(153, 153, 153));
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sample/minisuper/images/2849824-basket-buy-market-multimedia-shop-shopping-store_107977.png"))); // NOI18N
        btnVentas.setText("Ventas");
        btnVentas.setFocusable(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVentas);

        btnAlmacen.setBackground(new java.awt.Color(153, 153, 153));
        btnAlmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnAlmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sample/minisuper/images/trolley3_122342.png"))); // NOI18N
        btnAlmacen.setText("Almacén");
        btnAlmacen.setFocusable(false);
        btnAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAlmacen);

        btnCerrar_Sesion.setBackground(new java.awt.Color(153, 153, 153));
        btnCerrar_Sesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrar_Sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sample/minisuper/images/log-out_icon-icons.com_50106.png"))); // NOI18N
        btnCerrar_Sesion.setText("Cerrar Sesión");
        btnCerrar_Sesion.setFocusable(false);
        btnCerrar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar_SesionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCerrar_Sesion);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sample/minisuper/images/cashier_icon-icons.com_53629.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 280, 280));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static VistaEmpleadoHome getInstance(){
        if (vistaEmpleadoHome == null) {
            return vistaEmpleadoHome = new VistaEmpleadoHome();
        }
        return vistaEmpleadoHome;
    }
    
    public  void UsuarioResgistrado(Usuarios usuario){
       this.usuario = usuario;
    }  
    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        vistaEmpleadoVentas.setVisible(true);
        vistaEmpleadoVentas.UsuarioResgistrado(usuario);
        this.setVisible(false);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenActionPerformed
        // TODO add your handling code here:
    
        vistaEmpleadoAlmacen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAlmacenActionPerformed

    private void btnCerrar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar_SesionActionPerformed
        // TODO add your handling code here:
        vistaInicioSesion.setVisible(true);
        vistaEmpleadoHome.setVisible(false);
    }//GEN-LAST:event_btnCerrar_SesionActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEmpleadoHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadoHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadoHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadoHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEmpleadoHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JToggleButton btnAlmacen;
    private javax.swing.JToggleButton btnCerrar_Sesion;
    private javax.swing.JToggleButton btnVentas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
