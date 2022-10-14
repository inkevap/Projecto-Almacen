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

/**
 *
 */
public class Archivo {
    
    public ArrayList<Usuario> Usuarios = new ArrayList();
    private String Direccion;

    public Archivo(String Direccion) {
        this.Direccion = Direccion;
    }

    public ArrayList<Usuario> LeerUsuarios() {
        Usuarios.clear();
        try {
            Scanner scanner = new Scanner(new File(Direccion));
            while (scanner.hasNextLine()) {
                Usuario user = new Usuario(
                        scanner.nextLine(),//Nombre
                        scanner.nextLine(),//Apellido
                        scanner.nextLine(),//NombreUsuario
                        scanner.nextLine(),//PwdUser
                        scanner.nextLine()//TipoUsuario
                );
                Usuarios.add(user);
            }
            scanner.close();
        } catch (Exception e) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
        }
        return Usuarios;
    }
    
    public Boolean hayUsuarios(){
        return (Usuarios.size()== 0 ) ? false : true ;
    }
    
    public void EscribirUsuarios(){
        try {
            PrintStream Archivo;
            FileOutputStream temp = new FileOutputStream(Direccion, false);
            Archivo = new PrintStream(temp);
            for(Usuario usuario : Usuarios){
            Archivo.println(usuario.Nombre);    
            Archivo.println(usuario.Apellido);    
            Archivo.println(usuario.Us);    
            Archivo.println(usuario.PwdUsuario);    
            Archivo.println(usuario.TipoUsuario);
            }
            Archivo.flush();
            Archivo.close();
        } catch (FileNotFoundException e) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Error");
        }       
        LeerUsuarios();
    }
    
    public void BuscarUsuario(){
    }
}
