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

/**
 *
 */
public class ArchivoProductos {

    public ArrayList<Producto> Productos = new ArrayList();//creamos un array indefinido para poder usarlo como
    //base de datos en memoria de los productos
    private String Direccion;//creamos una variable para guardar nuestra base de datos

    public ArchivoProductos(String Direccion) {
        this.Direccion = Direccion;//recibimos la direccion y lo almacenamos en la variable que ya habiamos creado.
    }

    public ArrayList<Producto> LeerProductos() {
        Productos.clear();// Limpiamos todo lo que hay en nuestra base de datos en momoria para alistar lo para cargar informacion de nuevo
        try {//utilizamos un try and catch porque este tipo de codigo puede fallar y es necesario tomar lo en cuenta y tener programacion que responda
            //cuando el programa falle
            Scanner scanner = new Scanner(new File(Direccion));//leemos el fichero de nuestra DDBB(base de datos)
            while (scanner.hasNextLine()) {//verificamos que mientras tenga datos
                scanner.nextLine();
                String Codigo = scanner.nextLine();
                String FechaIngreso = scanner.nextLine();
                float PrecioCompra = Float.parseFloat(scanner.nextLine());
                String EstadoProducto = scanner.nextLine();
                float PrecioVenta = Float.parseFloat(scanner.nextLine());
                String Nombre = scanner.nextLine();
                String Descripcion = scanner.nextLine();
                int Existencias = Integer.parseInt(scanner.nextLine());
                String FechaUltimaMod = scanner.nextLine();

                Producto Product = new Producto(//se cree un Producto con esos datos en el siguiente orden
                        Codigo,
                        FechaIngreso,
                        PrecioCompra,
                        EstadoProducto,
                        PrecioVenta,
                        Nombre,
                        Descripcion,
                        Existencias,
                        FechaUltimaMod
                );

                Productos.add(Product);//agregamos el usuario a nuestra base de datos en memoria

            }
            scanner.close();//cerramos el fichero
        } catch (Exception e) {//en caso de que falle va a guardar la informacion en un LOG y va a mostrar una ventana con el error que se dio
            Logger.getLogger(ArchivoProductos.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "La base de datos se encuentra dañada o esta vacia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return Productos;//en caso de que sea necesario devolvemos la base de datos en memoria.
    }

    public void EscribirProductos(Boolean Anidar) {//Esta linea es lo unico que cambiarian en la logica en comparacion con ArchivoUsuarios()
        /*Agregue una variable la cual me permite indicar le al programa si quiero que la informacion se concatenada o que sea sobreescrita
        teniendo asi la facilidad de reutilizar el codigo sin realizar tantos cambios*/
        try {//realizamos un try and catch de nuevo debido a que abrimos el archivo
            PrintStream Archivo;//preparamos una variable para escribir en el fichero
            FileOutputStream temp = new FileOutputStream(Direccion, Anidar);//Convertimos el fichero a informacion que sea legible para el programa
            Archivo = new PrintStream(temp);//Luego cargamos esa referencia a memoria y estamos listos para escribir informacion en el archivo

            for (Producto producto : Productos) {//cada producto dentro de nuestra base de datos de productos
                Archivo.println("---------------------------------------------");
                Archivo.println(producto.Codigo);//va a estar guardando sus parametros en el orden que se muestra a continuacion
                Archivo.println(producto.FechaIngreso);//es importante que se respete este orden porque es el orden en el que se 
                Archivo.println(producto.PrecioCompra);//leera y se asignara de nuevo en el futuro,
                Archivo.println(producto.EstadoProducto);
                Archivo.println(producto.PrecioVenta);
                Archivo.println(producto.Nombre);
                Archivo.println(producto.Descripcion);
                Archivo.println(producto.Existencias);
                Archivo.println(producto.FechaUltimaMod);
            }

            Archivo.flush();//limpiamos la memoria de los ficheros que hemos cargado
            Archivo.close();//y cerramos el fichero y eliminamos la referencia del fichero
        } catch (FileNotFoundException e) {//en caso de que se presente algun problema este sera guardado en un log y de igual manera
            //se le notificara al usuario que hubo un error
            Logger.getLogger(ArchivoProductos.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(null, "Hubo un Error al tratar de crear el producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
        LeerProductos();//luego de haber escrito la informacion en el fichero refrescamos la base de datos en memoria para tener la informacion disponible.
    }

}
