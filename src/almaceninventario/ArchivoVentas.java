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
public class ArchivoVentas {

    public ArrayList<Usuario> Usuarios = new ArrayList();
    private String Direccion;

    public ArchivoVentas(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Usuario> LeerUsuarios() {
        Usuarios.clear();
        try {
            Scanner scanner = new Scanner(new File(Direccion));//lo unico que cambia son los parametros
            while (scanner.hasNextLine()) {//los parametros aqui usado son los de usuarios
                Usuario user = new Usuario(
                        scanner.nextLine(),//Nombre
                        scanner.nextLine(),//Apellido
                        scanner.nextLine(),//NombreUsuario
                        scanner.nextLine(),//PwdUser
                        scanner.nextLine(),//TipoUsuario
                        scanner.nextLine()//FechaCreacion
                );
                Usuarios.add(user);
            }
            scanner.close();
        } catch (Exception e) {
            Logger.getLogger(ArchivoVentas.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null,"La base de datos se encuentra dañada o esta vacia","Error",JOptionPane.ERROR_MESSAGE);
        }
        return Usuarios;
    }

    public Boolean hayUsuarios() {
        return (Usuarios.size() == 0) ? false : true;
    }

    public void EscribirUsuarios() {
        try {
            PrintStream Archivo;
            FileOutputStream temp = new FileOutputStream(Direccion, true);
            Archivo = new PrintStream(temp);
            for (Usuario usuario : Usuarios) {
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
            Logger.getLogger(ArchivoVentas.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null,"Hubo un Error al tratar de crear el usuario","Error",JOptionPane.ERROR_MESSAGE);
        }
        LeerUsuarios();
    }

    public void BuscarUsuario() {
    }
}
