/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.text.DateFormat;


/*Este no es mas que un  modelo del usuario, este nos sirve para poder crear usuarios
que cumplen concaracteristicas previamente definidas*/
public class Usuario {
        String Nombre;
        String Apellido;
        String Us;
        String PwdUsuario;
        String TipoUsuario;
        String FechaCreacion;

        public Usuario(//El usuario se puede crear dando le los parametros al 
                String Nombre,//constructor de la clase usuario.
                String Apellido,
                String Us,
                String PwdUsuario,
                String TipoUsuario,
                String FechaCreacion
                ){
            this.Nombre = Nombre;//este por medio del uso de "This" asigna sus valores
            this.Apellido = Apellido;// a una variable de entorno local.
            this.Us = Us;
            this.PwdUsuario = PwdUsuario;
            this.TipoUsuario = TipoUsuario;
            this.FechaCreacion = FechaCreacion;
        }

        public Usuario(){}



}
