/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 10
 */
public class RegistrarVenta extends javax.swing.JFrame {
    
    float total = 0;
    
    public RegistrarVenta() {
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
                producto.EstadoProducto,
                producto.Existencias,
                0,
                producto.PrecioVenta};
            tabla.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpiarTabla = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        txtBusqueda1 = new javax.swing.JTextField();
        txtBusqueda2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registar Venta");

        jButton1.setText("Cancelar");
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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo", "Descripcion", "Estado del Producto", "Existencias", "Cantidad", "Precio por unidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.setUpdateSelectionOnSort(false);
        jTable1.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jTable1HierarchyChanged(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable1InputMethodTextChanged(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTable1KeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnLimpiarTabla.setText("Agregar Productos");
        btnLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTablaActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar Compra");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Codigo", "Descripcion", "Estado del Producto", "Cantidad", "Precio por unidad", "Sub-total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable3.getTableHeader().setReorderingAllowed(false);
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTable3InputMethodTextChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);
        if (jTable3.getColumnModel().getColumnCount() > 0) {
            jTable3.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            jTable3.getColumnModel().getColumn(1).setHeaderValue("Codigo");
            jTable3.getColumnModel().getColumn(2).setHeaderValue("Descripcion");
            jTable3.getColumnModel().getColumn(3).setHeaderValue("Existencias");
        }

        txtBusqueda1.setToolTipText("Ingresa el codigo que deseas buscar.");
        txtBusqueda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusqueda1ActionPerformed(evt);
            }
        });

        txtBusqueda2.setToolTipText("Ingresa el codigo que deseas buscar.");
        txtBusqueda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusqueda2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Comprador:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NIT:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0.0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TOTAL:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(238, 238, 238)
                                .addComponent(btnLimpiarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(206, 206, 206))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtBusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(67, 67, 67))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarTabla)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtBusqueda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3))
                    .addComponent(jLabel4))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArchivoProductos ArchivoProductos = new ArchivoProductos("Productos.txt");
        ArchivoProductos.LeerProductos();
        DefaultTableModel tabla2 = (DefaultTableModel) jTable3.getModel();
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < tabla2.getRowCount(); i++) {
            String CodigoSel = (String) tabla2.getValueAt(i, 1);
            int Cantidad = (Integer) tabla2.getValueAt(i, 4);
            for (int j = 0; j < ArchivoProductos.Productos.size(); j++) {
                if (ArchivoProductos.Productos.get(j).Codigo.equalsIgnoreCase(CodigoSel)) {
                    ArchivoProductos.Productos.get(j).Existencias += Cantidad;
                }
            }
        }
        ArchivoProductos.EscribirProductos(false);
        GestionVentas GestionVentas = new GestionVentas();
        GestionVentas.setVisible(true);
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
                if (producto.Nombre.toLowerCase().contains(txtBusqueda.getText().toLowerCase())
                        || producto.Codigo.toLowerCase().contains(txtBusqueda.getText().toLowerCase())) {// <<<<<<<------ ESTA ES LA UNICA LINEA QUE CAMBIA, CAMBIA DE HACER LA 
                    //COMPARACION DE CODIGO A NOMBRE, VERIFICAR EN BUSCARNOMBRE() PARA MAYOR DETALLE DE COMO FUNCIONA LA BUSQUEDA.
                    Object[] row = {producto.Nombre,
                        producto.Codigo,
                        producto.Descripcion,
                        producto.EstadoProducto,
                        producto.Existencias,
                        0,
                        producto.PrecioVenta};
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
                    producto.EstadoProducto,
                    producto.Existencias,
                    0,
                    producto.PrecioVenta,};
                tabla.addRow(row);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void btnLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTablaActionPerformed

    }//GEN-LAST:event_btnLimpiarTablaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//    ProductosVendidos vendido = new ProductoVendidos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtBusqueda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqueda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqueda1ActionPerformed

    private void txtBusqueda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusqueda2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusqueda2ActionPerformed

    private void jTable3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable3InputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3InputMethodTextChanged

    private void jTable1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTable1InputMethodTextChanged

    }//GEN-LAST:event_jTable1InputMethodTextChanged

    private void jTable1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jTable1HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1HierarchyChanged

    private void jTable1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1KeyTyped

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2 && evt.getButton() == 1) {
            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
            DefaultTableModel tabla2 = (DefaultTableModel) jTable3.getModel();
            ArchivoProductos ArchivoProductos = new ArchivoProductos("Productos.txt");
            ArchivoProductos.LeerProductos();
            int SelectedItem = -1;
            int CantidadSel = (Integer) tabla.getValueAt(jTable1.getSelectedRow(), 5);
            String CodigoSel = (String) tabla.getValueAt(jTable1.getSelectedRow(), 1);
            
            for (int i = 0; i < ArchivoProductos.Productos.size(); i++) {
                if (ArchivoProductos.Productos.get(i).Codigo.equalsIgnoreCase(CodigoSel)) {
                    SelectedItem = i;
                }
            }
            
            if (ArchivoProductos.Productos.get(SelectedItem).Existencias >= CantidadSel
                    && SelectedItem >= 0 && CantidadSel > 0) {
                Object[] row = {
                    ArchivoProductos.Productos.get(SelectedItem).Nombre,
                    ArchivoProductos.Productos.get(SelectedItem).Codigo,
                    ArchivoProductos.Productos.get(SelectedItem).Descripcion,
                    ArchivoProductos.Productos.get(SelectedItem).EstadoProducto,
                    CantidadSel,
                    ArchivoProductos.Productos.get(SelectedItem).PrecioVenta,
                    CantidadSel * ArchivoProductos.Productos.get(SelectedItem).PrecioVenta};
                tabla2.addRow(row);
                ArchivoProductos.Productos.get(SelectedItem).Existencias -= CantidadSel;
                ArchivoProductos.EscribirProductos(false);
                tabla.setValueAt(ArchivoProductos.Productos.get(SelectedItem).Existencias, jTable1.getSelectedRow(), 4);
            } else if (ArchivoProductos.Productos.get(SelectedItem).Existencias < CantidadSel) {
                JOptionPane.showMessageDialog(null, "No hay existencias suficientes", "Info", JOptionPane.INFORMATION_MESSAGE);//se mostrara un aviso de que el producto ha sido eliminado
            }
            
            total = 0;
            for (int i = tabla2.getRowCount() - 1; i >= 0; i--) {
                total += Float.parseFloat(tabla2.getValueAt(i, 6).toString());
                if (i == 0) {
                    
                    jLabel4.setText(String.valueOf(total));
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        if (evt.getClickCount() == 2 && evt.getButton() == 1) {
            ArchivoProductos ArchivoProductos = new ArchivoProductos("Productos.txt");
            ArchivoProductos.LeerProductos();
            DefaultTableModel tabla2 = (DefaultTableModel) jTable3.getModel();
            DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
            float SubtotalSel = Float.parseFloat(tabla2.getValueAt(jTable3.getSelectedRow(), 6).toString());
            int Cantidad = (Integer) tabla2.getValueAt(jTable3.getSelectedRow(), 4);
            String CodigoSel = (String) tabla2.getValueAt(jTable3.getSelectedRow(), 1);
            int FilaAModificar = -1;
            total -= SubtotalSel;
            jLabel4.setText(String.valueOf(total));
            
            for (int i = 0; i < tabla.getRowCount(); i++) {
                if (tabla.getValueAt(i, 1).toString().equalsIgnoreCase(CodigoSel)) {
                    FilaAModificar = i;
                }
            }
            
            for (int i = 0; i < ArchivoProductos.Productos.size(); i++) {
                if (ArchivoProductos.Productos.get(i).Codigo.equalsIgnoreCase(CodigoSel)) {
                    ArchivoProductos.Productos.get(i).Existencias += Cantidad;
                    ArchivoProductos.EscribirProductos(false);
                    
                    if (FilaAModificar >= 0) {
                        tabla.setValueAt(ArchivoProductos.Productos.get(i).Existencias, FilaAModificar, 4);
                    }
                }
            }
            
            tabla2.removeRow(jTable3.getSelectedRow());
            
        }
    }//GEN-LAST:event_jTable3MouseClicked

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
            java.util.logging.Logger.getLogger(RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiarTabla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtBusqueda1;
    private javax.swing.JTextField txtBusqueda2;
    // End of variables declaration//GEN-END:variables
}
