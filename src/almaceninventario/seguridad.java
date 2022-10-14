package almaceninventario;

import javax.swing.JOptionPane;
import java.util.ArrayList;

class seguridad {

    String res;

    void ValidarUsuario(ArrayList<Usuario> usuarios, String user, String pwd, int intentos) {
        boolean encontrado = false;

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).Us.equalsIgnoreCase(user) && usuarios.get(i).PwdUsuario.equalsIgnoreCase(pwd) ) {
                System.out.println("encontrado");
                res = "Bienvenidos" + user;
                encontrado = true;
                JOptionPane.showMessageDialog(null, res, "inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
                intentos = 0;
                break;
            }
            if (encontrado = false) {
                res = "clave y/o usuario inconrrecto con" + intentos + "intentos fallidos";
                JOptionPane.showMessageDialog(null, res, "inicio de sesion", JOptionPane.ERROR_MESSAGE);
            }
            if (intentos > 2) {
                JOptionPane.showMessageDialog(null, "3 INTENTOS FALLIDOS, SE CERRARA EL SISTEMA", "INICIO DE SESION", JOptionPane.ERROR_MESSAGE);
                System.exit(0);
                break;
            }

        }
    }

}
