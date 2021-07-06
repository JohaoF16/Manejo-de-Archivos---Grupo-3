
package dominio;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Archivo {
    public void op1(String nombreArchivo) {
        File nombre = new File(nombreArchivo);
        if (nombre.exists()) {
            System.out.println("Abriendo archivo: "+ nombreArchivo);
        } else {
            System.out.println("Archivo creado con nombre: "+ nombreArchivo);
        }
    }
    public void escribirArchivo(String nombreArchivo, String nombre, int anio, int mes, int dia) {
        try {
            LlenaEmpleado ob1 = new LlenaEmpleado(nombre,anio,mes,dia);
            FileWriter archivo = new FileWriter(nombreArchivo, true);
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(ob1);
            salida.flush();
            archivo.close();
        } catch (IOException ex) {
            Logger.getLogger(LlenaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     public void op3(String nombreArchivo) {
        String cadena;
        BufferedReader entrada;
        FileReader archivos;
        try {
            archivos = new FileReader(nombreArchivo);
            entrada = new BufferedReader(archivos);
            cadena = entrada.readLine();
            while (cadena != null) {
                System.out.println(cadena);
                cadena = entrada.readLine();
            }
            archivos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
