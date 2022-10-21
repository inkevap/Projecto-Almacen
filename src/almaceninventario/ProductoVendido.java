/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

/**
 *
 * @author Kevin Pocon
 */
class ProductoVendido {

    String Nombre;
    String Codigo;
    String Descripcion;
    String EstadoProducto;
    int Cantidad;
    float PrecioUnidad;
    float Subtotal;

    public ProductoVendido(
            String Nombre,
            String Codigo,
            String Descripcion,
            String EstadoProducto,
            int Cantidad,
            float PrecioUnidad,
            float Subtotal
    ) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.EstadoProducto = EstadoProducto;
        this.Cantidad = Cantidad;
        this.PrecioUnidad = PrecioUnidad;
        this.Subtotal = Subtotal;
    }

}
