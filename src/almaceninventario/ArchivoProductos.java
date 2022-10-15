/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 */
public class ArchivoProductos {

    public ArrayList<Producto> Productos = new ArrayList();
    private String Direccion;

    public ArchivoProductos(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Producto> LeerProductos() {
        Productos.clear();
        try {
            Scanner scanner = new Scanner(new File(Direccion));
            while (scanner.hasNextLine()) {
                Producto Product = new Producto(
                        scanner.nextLine(),//Codigo
                        scanner.nextLine(),//Fecha Ingreso
                        scanner.nextLine(),//PrecioCompra
                        scanner.nextLine(),//EstadoProducto
                        scanner.nextLine(),//PrecioVenta
                        scanner.nextLine(),//Nombre
                        scanner.nextLine(),//Descripcion
                        scanner.nextLine()//Existencias
                );
                Productos.add(Product);
            }
            scanner.close();
        } catch (Exception e) {
            Logger.getLogger(ArchivoProductos.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null,"La base de datos se encuentra dañada o esta vacia","Error",JOptionPane.ERROR_MESSAGE);
        }
        return Productos;
    }

    public Boolean hayProductos() {
        return (Productos.size() == 0) ? false : true;
    }

    public void EscribirProductos() {
        try {
            PrintStream Archivo;
            FileOutputStream temp = new FileOutputStream(Direccion, true);
            Archivo = new PrintStream(temp);
            for (Producto producto : Productos) {
                Archivo.println(producto.Nombre);
                Archivo.println(producto.FechaIngreso);
                Archivo.println(producto.PrecioCompra);
                Archivo.println(producto.EstadoProducto);
                Archivo.println(producto.PrecioVenta);
                Archivo.println(producto.Nombre);
                Archivo.println(producto.Descripcion);
                Archivo.println(producto.Existencias);
            }
            Archivo.flush();
            Archivo.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(ArchivoProductos.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null,"Hubo un Error al tratar de crear el producto","Error",JOptionPane.ERROR_MESSAGE);
        }
        LeerProductos();
    }

}
