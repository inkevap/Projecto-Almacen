/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.util.ArrayList;
import java.util.HashMap;
import almaceninventario.ProductosVendidos;


/*Este no es mas que un  modelo del usuario, este nos sirve para poder crear usuarios
que cumplen concaracteristicas previamente definidas*/
public class Venta {

    String Nombre;
    String NIT;
    ArrayList<ProductosVendidos> productosVendidos;
    String PwdUsuario;
    String TipoUsuario;
    String NoVenta;
    String FechaCreacion;

    public Venta(//El usuario se puede crear dando le los parametros al 
            String Nombre,
            String NIT,
            ArrayList<ProductosVendidos> productosVendidos,
            String PwdUsuario,
            String TipoUsuario,
            String NoVenta,
            String FechaCreacion
    ) {
        this.Nombre = Nombre;
        this.NIT = NIT;
        this.productosVendidos = productosVendidos;
        this.PwdUsuario = PwdUsuario;
        this.TipoUsuario = TipoUsuario;
        this.NoVenta = NoVenta;
        this.FechaCreacion = FechaCreacion;
    }


}
