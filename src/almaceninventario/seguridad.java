package almaceninventario;

import javax.swing.JOptionPane;
import java.util.ArrayList;

class seguridad {

    String res;

    public Boolean ValidarUsuario(ArrayList<Usuario> usuarios, String user, String pwd, int intentos, String Tipo) {
        //Con esta funcion nosotros validamos que exista un usuario con contrasena y que sea de cierto tipo
        boolean encontrado = false;

        for (int i = 0; i < usuarios.size(); i++) {//
            if (usuarios.get(i).Us.equalsIgnoreCase(user) //se compara el usuario
                    && usuarios.get(i).PwdUsuario.equals(pwd) //se compara la contrasena
                    && usuarios.get(i).TipoUsuario.equalsIgnoreCase(Tipo) ) {// y por ultimo se compara el tipo
                res = "Inicio De Sesion Correcto, Bienvenido " + user;//Si todo coincide de manera adecuada
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, "inicio de sesion", JOptionPane.INFORMATION_MESSAGE);//se dara un saludo
                intentos = 0;//y los intentos se reestableceran
                break;//saliendo del ciclo
            }
            if (encontrado = false) {//caso contrario nos hara saber que hemos metido una contrasena mal o un usuario mal
                res = "clave y/o usuario inconrrecto con" + intentos + "intentos fallidos";
                JOptionPane.showMessageDialog(null, res, "inicio de sesion", JOptionPane.ERROR_MESSAGE);
            }
            if (intentos == 2) {//luego de los 3 intentos fallidos el sitema se cierra, cuando se vuelve a abrir la cuuenta vuelve a estar en 0
                JOptionPane.showMessageDialog(null, "3 INTENTOS FALLIDOS, SE CERRARA EL SISTEMA", "INICIO DE SESION", JOptionPane.ERROR_MESSAGE);
                System.exit(0);//Con est comando le indicamos que cierre todo el programa.
                break;
            }

        }
        return encontrado;
    }

}
