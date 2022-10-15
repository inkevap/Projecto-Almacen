/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import java.text.DateFormat;



public class Usuario {
        String Nombre;
        String Apellido;
        String Us;
        String PwdUsuario;
        String TipoUsuario;
        String FechaCreacion;

        public Usuario(
                String Nombre,
                String Apellido,
                String Us,
                String PwdUsuario,
                String TipoUsuario,
                String FechaCreacion
                ){
            this.Nombre = Nombre;
            this.Apellido = Apellido;
            this.Us = Us;
            this.PwdUsuario = PwdUsuario;
            this.TipoUsuario = TipoUsuario;
            this.FechaCreacion = FechaCreacion;
        }

        public Usuario(){}



}
