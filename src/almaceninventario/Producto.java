/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.text.DateFormat;
//Este es un modelo al igual que la claseUsuario
public class Producto {

    String Codigo;
    String FechaIngreso;
    String PrecioCompra;
    String EstadoProducto;
    String PrecioVenta;
    String Nombre;
    String Descripcion;
    String Existencias;

    public Producto(
            String Codigo,
            String FechaIngreso,
            String PrecioCompra,
            String EstadoProducto,
            String PrecioVenta,
            String Nombre,
            String Descripcion,
            String Existencias
            ) {
        this.Codigo = Codigo;
        this.FechaIngreso = FechaIngreso;
        this.PrecioCompra = PrecioCompra;
        this.EstadoProducto = EstadoProducto;
        this.PrecioVenta = PrecioVenta;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Existencias = Existencias;
    }

    public Producto() {
    }

}
