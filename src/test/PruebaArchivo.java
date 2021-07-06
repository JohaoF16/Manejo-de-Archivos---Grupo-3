package test;

import dominio.Archivo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PruebaArchivo {

    static Scanner entrada = new Scanner(System.in);
    static FileWriter archivo;

    public static void main(String[] args) throws IOException {
        int opcion = 0;
        boolean auxd;
        boolean auxb;
        String nombreArchivo = null;
        do {
            auxb = false;
            try {
                System.out.println("Manejo de Archivos");
                System.out.println("Opciones:");
            } catch (NumberFormatException e) {
                auxb = true;
            }
        } while (auxb);
        do {
            auxd = false;
            try {
                System.out.println("""
                                   1. Abrir/Crear Archivo
                                   2. Insertar Datos
                                   3. Leer Datos
                                   4. Cerrar Archivo
                                   5. Salir
                                   Digite una opcion: """);
                opcion = entrada.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Opcion no existe ");
                auxd = true;
            }
            if (opcion != 5) {
                try {

                } catch (NumberFormatException e) {
                    System.out.println("Dato no valido");
                }
            }
            switch (opcion) {
                case 1:
                    if (nombreArchivo == null) {
                        Archivo abrir = new Archivo();
                        System.out.println("Opcion 1 Ejercutada");
                        entrada.nextLine();
                        System.out.println("Ingrese el nombre del archivo: ");
                        nombreArchivo = entrada.nextLine();
                        abrir.op1(nombreArchivo);
                        archivo = new FileWriter(nombreArchivo, true);
                    } else {
                        System.out.println("Archivo " + nombreArchivo + " existente");
                    }
                case 2:
                        
                        
                case 3:
                        
                        
                case 4:
                    try {
                        System.out.println("Cerrando el Archivo");
                    } finally {
                        try {
                            entrada.close();
                        } catch (Exception ex) {
                            System.out.println("No se pudo cerrar el archivo");
                        }
                    }
                case 5:
                    System.out.println("Saliendo");
            }
         
    }
    while (auxd);
    }
    
}
