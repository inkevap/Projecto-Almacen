/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almaceninventario;

import almaceninventario.ArchivoUsuarios;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Kevin Pocon
 */
public class MainPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArchivoProductos ArchivoProductos = new ArchivoProductos("Productos.txt");
        ArchivoProductos.LeerProductos();
        System.out.println(ArchivoProductos.Productos.get(0).hashCode());

    }

}
