/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample.minisuper.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.sample.minisuper.controller.DAOAlmacen;
import org.sample.minisuper.controller.DAOVentas;
import org.sample.minisuper.model.Productos;
import org.sample.minisuper.model.Usuarios;
import org.sample.minisuper.model.Ventas;
/**
 *
 * @author alberto
 */
public class VistaEmpleadoVentas extends javax.swing.JFrame {

    private static VistaEmpleadoVentas vistaEmpleadoVentas = null;
    private final ArrayList<Productos> listaVenta;
    private Productos productos;
    private final DAOAlmacen daoAlmacen;
    private final DAOVentas daoVentas;
    private final DefaultTableModel modeloTabla;
    private long TOTAL;
    private  Usuarios usuario;
    private static DateFormat formatoFecha;
     private static DateFormat formatoHora;

    /**
     * Creates new form VistaEmpleado
     */
    private VistaEmpleadoVentas() {
        initComponents();
        listaVenta = new ArrayList<>();
        modeloTabla = (DefaultTableModel) tablaProductos.getModel();
        daoAlmacen = new DAOAlmacen();
        daoVentas = new DAOVentas();
        formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        formatoHora = new SimpleDateFormat("hh:mm:ss a");
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
        jToolBar2 = new javax.swing.JToolBar();
        btnInicio = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnRalizarVenta = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(100);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar2.setRollover(true);

        btnInicio.setBackground(new java.awt.Color(153, 153, 153));
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sample/minisuper/images/home_icon-icons.com_73532.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setMaximumSize(new java.awt.Dimension(127, 44));
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        jToolBar2.add(btnInicio);

        jPanel1.add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ventas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Producto:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));
        jPanel1.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 90, -1));
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, -1));

        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sample/minisuper/images/file-add_114479.png"))); // NOI18N
        btnAgregarProducto.setText(" Agregar producto");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 112, -1, 40));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID producto", "Descripci??n ", "Cantidad", "Importe"
            }
        ));
        jScrollPane1.setViewportView(tablaProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 570, 100));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Subtotal:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        txtSubTotal.setEditable(false);
        jPanel1.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 60, -1));

        txtTotal.setEditable(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 60, -1));

        btnRalizarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sample/minisuper/images/2849824-basket-buy-market-multimedia-shop-shopping-store_107977.png"))); // NOI18N
        btnRalizarVenta.setText("Realizar Venta");
        btnRalizarVenta.setBorder(null);
        btnRalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRalizarVentaActionPerformed(evt);
            }
        });
        jPanel1.add(btnRalizarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 130, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sample/minisuper/images/4882066.jpg"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 570, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static VistaEmpleadoVentas getInstance() {
        if (vistaEmpleadoVentas == null) {
            return vistaEmpleadoVentas = new VistaEmpleadoVentas();
        }
        return vistaEmpleadoVentas;
    }
    
    public  void UsuarioResgistrado(Usuarios usuario){
       this.usuario = usuario;
    }    
    
    
    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        VistaInicioSesion vista = VistaInicioSesion.getInstance();
        vista.setVisible(true);
        vistaEmpleadoVentas.setVisible(false);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here
        try {
            productos = new Productos();
            productos.setIdProducto(Long.parseLong(txtIdProducto.getText().trim()));
            productos = daoAlmacen.mostrarUno(productos);
            productos.setPiezas(Integer.parseInt(txtCantidad.getText().trim()));
            TOTAL += productos.getPiezas() * productos.getPrecio();
            listaVenta.add(productos);
            txtSubTotal.setText(String.valueOf(TOTAL));
            txtTotal.setText(String.valueOf(TOTAL));
            txtCantidad.setText("");
            txtIdProducto.setText("");

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Producto no encondrado");
        }
        modeloTabla.setRowCount(0);
        listaVenta.forEach((producto) -> {
            modeloTabla.addRow(new Object[]{producto.getIdProducto(), producto.getDescripcion(), producto.getPiezas(), producto.getPrecio()});
        });


    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnRalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRalizarVentaActionPerformed
        // TODO add your handling code here:

        int respuesta;
        long cantidad = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero a ingresar"));
        long cambio = cantidad - TOTAL;
        respuesta = JOptionPane.showConfirmDialog(null, "Desea Continuar?", "Venta", JOptionPane.YES_NO_OPTION);
        switch (respuesta) {
            case 0:

                listaVenta.forEach((producto) -> {
                    productos = daoAlmacen.mostrarUno(producto);
                    long piezas = productos.getPiezas();
                    
                    producto.setPiezas(piezas - producto.getPiezas());
                    daoAlmacen.actualizar(producto);
                });
                JOptionPane.showMessageDialog(null, "Cambio: " + cambio);
                
                
                Ventas venta = new Ventas(formatoFecha.format(new Date()), formatoHora.format(new Date()), usuario.getId(), TOTAL);
                daoVentas.guardar(venta);
                modeloTabla.setRowCount(0);
                txtCantidad.setText("");
                txtIdProducto.setText("");
                txtSubTotal.setText("");
                txtTotal.setText("");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Se cancelo la venta");
        }


    }//GEN-LAST:event_btnRalizarVentaActionPerformed

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
            java.util.logging.Logger.getLogger(VistaEmpleadoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaEmpleadoVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaEmpleadoVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JToggleButton btnInicio;
    private javax.swing.JButton btnRalizarVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
