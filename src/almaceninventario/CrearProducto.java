/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import almaceninventario.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Windows 10
 */
public class CrearProducto extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public CrearProducto() {
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

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtPrecioCompra = new javax.swing.JTextField();
        txtEstadoProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCrearUsuario = new javax.swing.JButton();
        btnCancelUser = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtExistencias = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setText("CREAR UN NUEVO USUARIO");

        txtCodigo.setToolTipText("INGRESE SU NOMBRE COMPLETO");
        txtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCodigoFocusLost(evt);
            }
        });
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtCodigoPropertyChange(evt);
            }
        });

        txtPrecioCompra.setToolTipText("INGRESE SUS APELLIDOS");
        txtPrecioCompra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioCompraFocusLost(evt);
            }
        });
        txtPrecioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCompraActionPerformed(evt);
            }
        });

        txtEstadoProducto.setToolTipText("INGRESE SU USUARIO");

        jLabel2.setText("CODIGO");

        jLabel3.setText("PRECIO DE COMPRA");

        jLabel4.setText("ESTADO DEL PRODUCTO");

        jLabel5.setText("PRECIO DE VENTA");

        btnCrearUsuario.setText("CREAR");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnCancelUser.setText("CANCELAR");
        btnCancelUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelUserActionPerformed(evt);
            }
        });

        txtNombre.setToolTipText("INGRESE SU NOMBRE COMPLETO");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtDescripcion.setToolTipText("INGRESE SUS APELLIDOS");
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        txtExistencias.setToolTipText("INGRESE SU USUARIO");
        txtExistencias.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtExistenciasFocusLost(evt);
            }
        });

        jLabel7.setText("NOMBRE");

        jLabel8.setText("DESCRIPCION");

        jLabel9.setText("EXISTENCIAS");

        txtPrecioVenta.setToolTipText("INGRESE SU USUARIO");
        txtPrecioVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecioVentaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCrearUsuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(567, 567, 567)
                        .addComponent(btnCancelUser)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtExistencias, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDescripcion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEstadoProducto, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrecioCompra, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(66, 66, 66)
                .addComponent(btnCrearUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelUser)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtPrecioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCompraActionPerformed
    // La fecha tiene formato asignado, esto para que cuando tome la hora y fecha de hoy lo coloque en un formato agradable
    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed

        if (!txtCodigo.getText().isEmpty()// verificamos que las casillas tengan contenido 
                && !txtPrecioCompra.getText().isEmpty()//para evitarnos errores
                && !txtEstadoProducto.getText().isEmpty()
                && !txtPrecioVenta.getText().isEmpty()
                && !txtNombre.getText().isEmpty()
                && !txtDescripcion.getText().isEmpty()
                && !txtExistencias.getText().isEmpty()) {

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//definimos primero las variables que van
            String FechaIngreso = dateFormat.format(Calendar.getInstance().getTime());// a contener
            String Codigo = txtCodigo.getText();//la informacion para hacer un producto individual
            float PrecioCompra = Float.parseFloat(txtPrecioCompra.getText());
            String EstadoProducto = txtEstadoProducto.getText();
            float PrecioVenta = Float.parseFloat(txtPrecioVenta.getText());
            String Nombre = txtNombre.getText();
            String Descripcion = txtDescripcion.getText();
            int Existencias = Integer.parseInt(txtExistencias.getText());
            String FechaUltimaModificacion = dateFormat.format(Calendar.getInstance().getTime());

            ArchivoProductos Productos = new ArchivoProductos("Productos.txt");// Abrimos nuestra base de datos en fichero
            Producto ProductoTemp = new Producto(//creamos el producto per se 
                    Codigo,//agregamos todos los valores que previamente definimos
                    FechaIngreso,
                    PrecioCompra,
                    EstadoProducto,
                    PrecioVenta,
                    Nombre,
                    Descripcion,
                    Existencias,
                    FechaUltimaModificacion
            );
            Productos.Productos.add(ProductoTemp);//Agregamos el nuevo usuario a nuestra base de datos que previamente habiamos cargado
            Productos.EscribirProductos(true);//Escribimos el nuevo producto con la opcion de cantenar la que ya teniamos, en este caso porque
            JOptionPane.showMessageDialog(null, "Producto creado con exito");// no leemos lo que hay en el archivo antes de escribir la informacion
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacios", "Error", JOptionPane.ERROR_MESSAGE);//En caso de que los campos esten
            //vacios este muestra una alerta, asi como la alerta que se muestra cuando se tuve exito.
        }


    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnCancelUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelUserActionPerformed
        this.setVisible(false);// cerramos la ventana actual ya que la ventana anterior no se cierra al
    }//GEN-LAST:event_btnCancelUserActionPerformed
// abrir esta ventana
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtCodigoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCodigoPropertyChange

    }//GEN-LAST:event_txtCodigoPropertyChange

    private void txtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCodigoFocusLost
        ArchivoProductos Productos = new ArchivoProductos("Productos.txt");
        Productos.LeerProductos();
        for (Producto producto : Productos.Productos) {
            if (producto.Codigo.equalsIgnoreCase(txtCodigo.getText())
                    && !txtCodigo.getText().equalsIgnoreCase("")) {
                txtCodigo.setText("");
                JOptionPane.showMessageDialog(null, "El Codigo Ingresado ya existe, ingrese uno distinto", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }//GEN-LAST:event_txtCodigoFocusLost

    private void txtPrecioCompraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioCompraFocusLost
        try {
            if (!txtPrecioCompra.getText().equalsIgnoreCase("")) {
                Float.parseFloat(txtPrecioCompra.getText());
            }
        } catch (Exception e) {
            txtPrecioCompra.setText("");
            JOptionPane.showMessageDialog(null, "El precio de compra debe ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPrecioCompraFocusLost

    private void txtPrecioVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecioVentaFocusLost
        try {
            if (!txtPrecioVenta.getText().equalsIgnoreCase("")) {
                Float.parseFloat(txtPrecioVenta.getText());
            }
        } catch (Exception e) {
            txtPrecioVenta.setText("");
            JOptionPane.showMessageDialog(null, "El precio de venta debe ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtPrecioVentaFocusLost

    private void txtExistenciasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtExistenciasFocusLost
        try {
            if (!txtExistencias.getText().equalsIgnoreCase("")) {
                Integer.parseInt(txtExistencias.getText());
            }
        } catch (Exception e) {
            txtExistencias.setText("");
            JOptionPane.showMessageDialog(null, "La existencia debe ser un numero", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtExistenciasFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting codtxtCodigoal) ">
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
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelUser;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEstadoProducto;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
