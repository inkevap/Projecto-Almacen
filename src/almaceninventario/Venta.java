/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.util.ArrayList;
import java.util.HashMap;
import almaceninventario.ProductoVendido;


/*Este no es mas que un  modelo del usuario, este nos sirve para poder crear usuarios
que cumplen concaracteristicas previamente definidas*/
public class Venta {

    String Nombre;
    String NIT;
    ArrayList<ProductoVendido> ProductosVendidos = new ArrayList();
    String NoVenta;
    String FechaCreacion;
    float total;

    public Venta(//El usuario se puede crear dando le los parametros al 
            String Nombre,
            String NIT,
            String NoVenta,
            String FechaCreacion,
            float total
    ) {
        this.Nombre = Nombre;
        this.NIT = NIT;
        this.NoVenta = NoVenta;
        this.FechaCreacion = FechaCreacion;
        this.total = total;
    }
    
    public void AddProductoVendido(ProductoVendido Prod){
        ProductosVendidos.add(Prod);
    }


}
