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

/*
 *Crear Venta funciona de igual manera que ArchivoProductos()
verificar la clas para tener mayor conocimiento de su funcionalidad a detalle
 */
public class ArchivoVentas {

    public ArrayList<Venta> Ventas = new ArrayList();
    private String Direccion;

    public ArchivoVentas(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Venta> LeerVentas() {
        Ventas.clear();
        try {
            Scanner scanner = new Scanner(new File(Direccion));//lo unico que cambia son los parametros
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                String Nombre = scanner.nextLine();
                String NIT = scanner.nextLine();
                String NoVenta = scanner.nextLine();
                String FechaCreacion = scanner.nextLine();
                float Total = Float.parseFloat(scanner.nextLine());

                Venta venta = new Venta(
                        Nombre,
                        NIT,
                        NoVenta,
                        FechaCreacion,
                        Total
                );

                Ventas.add(venta);

                int CantProdVendidos = Integer.parseInt(scanner.nextLine());

                for (int i = 0; i < CantProdVendidos; i++) {

                    String strProdVendido = scanner.nextLine();

                    String[] PartesProdVendido = strProdVendido.split("\\+");
                    String NombreProd = PartesProdVendido[0];
                    String CodigoProd = PartesProdVendido[1];
                    String DescripcionProd = PartesProdVendido[2];
                    String EstadoProd = PartesProdVendido[3];
                    int CantidadProd = Integer.parseInt(PartesProdVendido[4]);
                    float PrecioUnidadProd = Float.parseFloat(PartesProdVendido[5]);
                    float SubtotalProd = Float.parseFloat(PartesProdVendido[6]);

                    ProductoVendido ProdVendido = new ProductoVendido(
                            NombreProd,
                            CodigoProd,
                            DescripcionProd,
                            EstadoProd,
                            CantidadProd,
                            PrecioUnidadProd,
                            SubtotalProd
                    );

                    venta.AddProductoVendido(ProdVendido);
                }

            }
            scanner.close();
        } catch (Exception e) {
            Logger.getLogger(ArchivoVentas.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "La base de datos se encuentra dañada o esta vacia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Ventas;
    }

    public void EscribirVentas(Boolean Concatenar) {
        try {
            PrintStream Archivo;
            FileOutputStream temp = new FileOutputStream(Direccion, Concatenar);
            Archivo = new PrintStream(temp);

            for (Venta venta : Ventas) {
                Archivo.println("---------------------------------------------");
                Archivo.println(venta.Nombre);
                Archivo.println(venta.NIT);
                Archivo.println(venta.NoVenta);
                Archivo.println(venta.FechaCreacion);
                Archivo.println(venta.total);
                Archivo.println(venta.ProductosVendidos.size());

                for (ProductoVendido Pvendidos : venta.ProductosVendidos) {
                    Archivo.println(
                            Pvendidos.Nombre + "+"
                            + Pvendidos.Codigo + "+"
                            + Pvendidos.Descripcion + "+"
                            + Pvendidos.EstadoProducto + "+"
                            + Pvendidos.Cantidad + "+"
                            + Pvendidos.PrecioUnidad + "+"
                            + Pvendidos.Subtotal);
                }

            }
            Archivo.flush();
            Archivo.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(ArchivoVentas.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Hubo un Error al tratar de crear la venta", "Error", JOptionPane.ERROR_MESSAGE);
        }
        LeerVentas();
    }

    public void BuscarVenta() {
    }
}
