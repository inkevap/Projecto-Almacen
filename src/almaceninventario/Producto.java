/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.text.DateFormat;

public class Producto {

    String Codigo;
    String FechaIngreso;
    int PrecioCompra;
    String EstadoProducto;
    int PrecioVenta;
    String Nombre;
    String Descripcion;
    int Existencias;

    public Producto(
            String Codigo,
            String FechaIngreso,
            int PrecioCompra,
            String EstadoProducto,
            int PrecioVenta,
            String Nombre,
            String Descripcion,
            int Existencias
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
