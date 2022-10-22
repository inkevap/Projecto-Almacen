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
 *Crear Usuario funciona de igual manera que ArchivoProductos()
verificar la clas para tener mayor conocimiento de su funcionalidad a detalle
 */
public class ArchivoUsuarios {

    public ArrayList<Usuario> Usuarios = new ArrayList();
    private final String Direccion;

    public ArchivoUsuarios(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Usuario> LeerUsuarios() {
        Usuarios.clear();
        try {
            Scanner scanner = new Scanner(new File(Direccion));//lo unico que cambia son los parametros
            while (scanner.hasNextLine()) {//los parametros aqui usado son los de usuarios
                scanner.nextLine();
                String Nombre = scanner.nextLine();
                String Apellido = scanner.nextLine();
                String NombreUsuario = scanner.nextLine();
                String PwdUser = scanner.nextLine();
                String TipoUsuario = scanner.nextLine();
                String FechaCreacion = scanner.nextLine();

                Usuario user = new Usuario(
                        Nombre,
                        Apellido,
                        NombreUsuario,
                        PwdUser,
                        TipoUsuario,
                        FechaCreacion
                );
                
                Usuarios.add(user);
            }
            scanner.close();
        } catch (Exception e) {
            Logger.getLogger(ArchivoUsuarios.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "La base de datos se encuentra dañada o esta vacia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Usuarios;
    }

    public void EscribirUsuarios() {
        try {
            PrintStream Archivo;
            FileOutputStream temp = new FileOutputStream(Direccion, true);
            Archivo = new PrintStream(temp);
            
            for (Usuario usuario : Usuarios) {
                Archivo.println("---------------------------------------------");
                Archivo.println(usuario.Nombre);
                Archivo.println(usuario.Apellido);
                Archivo.println(usuario.Us);
                Archivo.println(usuario.PwdUsuario);
                Archivo.println(usuario.TipoUsuario);
                Archivo.println(usuario.FechaCreacion);
                
            }
            Archivo.flush();
            Archivo.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(ArchivoUsuarios.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Hubo un Error al tratar de crear el usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
        LeerUsuarios();
    }

    public void BuscarUsuario() {
    }
}
