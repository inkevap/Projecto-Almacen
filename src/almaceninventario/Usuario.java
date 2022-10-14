/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;


public class Usuario {
        String Nombre;
        String Apellido;
        String Us;
        String PwdUsuario;
        String TipoUsuario;
        
        public Usuario(
                String Nombre,
                String Apellido,
                String Us,
                String PwdUsuario,
                String TipoUsuario
                ){
            this.Nombre = Nombre;
            this.Apellido = Apellido;
            this.Us = Us;
            this.PwdUsuario = PwdUsuario;
            this.TipoUsuario = TipoUsuario;
        }
        
        public Usuario(){}
        
        
    
}
