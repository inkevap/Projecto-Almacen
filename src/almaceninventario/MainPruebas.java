/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import almaceninventario.Archivo;

/**
 *
 * @author Kevin Pocon
 */
public class MainPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Probando Leer Usuarios
        Archivo DBuser = new Archivo("ArchivoPruebas.txt");
        DBuser.LeerUsuarios();
        if (DBuser.hayUsuarios()) {
            for (Usuario user : DBuser.Usuarios) {
                System.out.println(
                        user.Nombre
                        + user.Apellido
                        + user.Us
                        + user.PwdUsuario
                        + user.TipoUsuario);
            }

        }
        //Probando Escribir usuarios
        Usuario Temp = new Usuario("Kevin", "Pocon", "Bpocon", "password", "Admin");
        DBuser.Usuarios.remove(Temp);
        DBuser.EscribirUsuarios();
        
    }

}
