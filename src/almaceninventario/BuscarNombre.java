/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 10
 */
public class BuscarNombre extends javax.swing.JFrame {

    /*
    ESTE CODIGO FUNCIONA EXACTAMENTE IGUAL A BUSCARNOMBRE CON LA UNICA DIFERENCIA DE QUE
    AQUI SE ESTA BUSCANDO A LOS USUARIOS POR EL CODIGO Y NO POR EL NOMBRE
     */
    private String UltimaBusqueda = "";

    public BuscarNombre() {
        initComponents();
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        ArchivoProductos ArchivoProductos = new ArchivoProductos("Productos.txt");
        ArchivoProductos.LeerProductos();
        if (tabla.getRowCount() > 0) {
            while (tabla.getRowCount() > 0) {
                tabla.removeRow(0);
            }
        }
        for (Producto producto : ArchivoProductos.Productos) {
            //COMPARACION DE CODIGO A NOMBRE, VERIFICAR EN BUSCARNOMBRE() PARA MAYOR DETALLE DE COMO FUNCIONA LA BUSQUEDA.
            Object[] row = {producto.Nombre,
                producto.Codigo,
                producto.Descripcion,
                producto.Existencias,
                producto.EstadoProducto,
                producto.FechaIngreso,
                producto.PrecioCompra,
                producto.PrecioVenta,
            producto.FechaUltimaMod};
            tabla.addRow(row);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpiarTabla = new javax.swing.JButton();
        btnLimpiarTabla1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Producto por Nombre");

        btnSalir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        btnSalir.setText("X");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jButton1.setText("Menu Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar por Nombre del Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtBusqueda.setToolTipText("Ingresa el codigo que deseas buscar.");
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo", "Descripcion", "Existencias", "Estado del Producto", "Fecha de Ingreso", "Precio de Compra", "Precio de venta", "Ultima Modificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Codigo");
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Descripcion");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Existencias");
        }

        btnLimpiarTabla.setText("Limpiar la tabla");
        btnLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTablaActionPerformed(evt);
            }
        });

        btnLimpiarTabla1.setText("Guardar cambios");
        btnLimpiarTabla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTabla1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSalir))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(txtBusqueda)
                        .addGap(242, 242, 242)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(btnLimpiarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(btnLimpiarTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(139, 139, 139))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnSalir)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnLimpiarTabla)
                    .addComponent(btnLimpiarTabla1))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ModificarProducto ModificarProducto = new ModificarProducto();
        ModificarProducto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        ArchivoProductos ArchivoProductos = new ArchivoProductos("Productos.txt");
        ArchivoProductos.LeerProductos();
        if (!txtBusqueda.getText().isEmpty()) {
            if (tabla.getRowCount() > 0) {
                while (tabla.getRowCount() > 0) {
                    tabla.removeRow(0);
                }
            }
            for (Producto producto : ArchivoProductos.Productos) {
                if (producto.Nombre.toLowerCase().contains(txtBusqueda.getText().toLowerCase())) {// <<<<<<<------ ESTA ES LA UNICA LINEA QUE CAMBIA, CAMBIA DE HACER LA 
                    //COMPARACION DE CODIGO A NOMBRE, VERIFICAR EN BUSCARNOMBRE() PARA MAYOR DETALLE DE COMO FUNCIONA LA BUSQUEDA.
                    Object[] row = {producto.Nombre,
                        producto.Codigo,
                        producto.Descripcion,
                        producto.Existencias,
                        producto.EstadoProducto,
                        producto.FechaIngreso,
                        producto.PrecioCompra,
                        producto.PrecioVenta,
                        producto.FechaUltimaMod};
                    tabla.addRow(row);

                }
            }
        } else {
            if (tabla.getRowCount() > 0) {
                while (tabla.getRowCount() > 0) {
                    tabla.removeRow(0);
                }
            }
            for (Producto producto : ArchivoProductos.Productos) {
                //COMPARACION DE CODIGO A NOMBRE, VERIFICAR EN BUSCARNOMBRE() PARA MAYOR DETALLE DE COMO FUNCIONA LA BUSQUEDA.
                Object[] row = {producto.Nombre,
                    producto.Codigo,
                    producto.Descripcion,
                    producto.Existencias,
                    producto.EstadoProducto,
                    producto.FechaIngreso,
                    producto.PrecioCompra,
                    producto.PrecioVenta,
                    producto.FechaUltimaMod};
                tabla.addRow(row);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTablaActionPerformed
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        if (tabla.getRowCount() > 0) {
            while (tabla.getRowCount() > 0) {
                tabla.removeRow(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "La tabla ya se encuentra limpia", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnLimpiarTablaActionPerformed

    private void btnLimpiarTabla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTabla1ActionPerformed
        ArchivoProductos ArchivoProductos = new ArchivoProductos("Productos.txt");
        ArchivoProductos.LeerProductos();
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        if (tabla.getRowCount() > 0) {
            while (tabla.getRowCount() > 0) {
                for (int i = 0; i < ArchivoProductos.Productos.size(); i++) {
                    if (ArchivoProductos.Productos.get(i).FechaIngreso.equalsIgnoreCase((String) tabla.getValueAt(0, 5))) {
                        ArchivoProductos.Productos.get(i).Nombre = (String) tabla.getValueAt(0, 0);
                        ArchivoProductos.Productos.get(i).Codigo = (String) tabla.getValueAt(0, 1);
                        ArchivoProductos.Productos.get(i).Descripcion = (String) tabla.getValueAt(0, 2);
                        ArchivoProductos.Productos.get(i).Existencias = (int) tabla.getValueAt(0, 3);
                        ArchivoProductos.Productos.get(i).EstadoProducto = (String) tabla.getValueAt(0, 4);
                        ArchivoProductos.Productos.get(i).PrecioCompra = Float.parseFloat(tabla.getValueAt(0, 6).toString());
                        ArchivoProductos.Productos.get(i).PrecioVenta = Float.parseFloat(tabla.getValueAt(0, 7).toString());
                    }
                }
                ArchivoProductos.EscribirProductos(false);
                tabla.removeRow(0);

            }
            JOptionPane.showMessageDialog(null, "Los productos han sido actualizados", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnLimpiarTabla1ActionPerformed

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged
    }//GEN-LAST:event_jTable1InputMethodTextChanged

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
            java.util.logging.Logger.getLogger(BuscarNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarNombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarTabla;
    private javax.swing.JButton btnLimpiarTabla1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
