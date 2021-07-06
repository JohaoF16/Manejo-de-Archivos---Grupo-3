package test;

import dominio.Archivo;
import dominio.LlenaEmpleado;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
                                   Seleccione una opcion: """);
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
                        Archivo abrearc = new Archivo();
                        System.out.println("Opcion 1");
                        entrada.nextLine();
                        System.out.println("Ingrese el nombre del archivo: ");
                        nombreArchivo = entrada.nextLine();
                        abrearc.op1(nombreArchivo);
                        archivo = new FileWriter(nombreArchivo, true);
                    } 
                case 2:
                     if (nombreArchivo != null) {
                        int aux = 0;
                        int ne = 0;
                        System.out.println("Opcion 2");
                        System.out.println("Numero de Empleados: ");
                        while (ne < 1) {
                            ne = entrada.nextInt();
                        }
                        while (aux < ne) {
                            System.out.println("Empleado N" + (aux + 1)+":");
                            llenaDatos(nombreArchivo);
                            aux++;
                        }
                    } 
                case 3:
                     if (nombreArchivo != null) {
                        Archivo contarc = new Archivo();
                        System.out.println("Opcion 3");
                        System.out.println("Contenido de Archivo");
                        contarc.op3(nombreArchivo);
                    } 
                case 4:
                    System.out.println("Opcion 4");
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
                    System.out.println("Opcion 5");
                    System.out.println("Saliendo");
            }
    }
    while (auxd);
    }
     public static void llenaDatos(String nArchivo) {
        Archivo escribir = new Archivo();
        Calendar fecha = new GregorianCalendar();
        int anio = 2022,
                mes = 0,
                dia = 0;
        String nombre = null;
        LlenaEmpleado ob1 = new LlenaEmpleado(nombre, anio, mes, dia);
        entrada.nextLine();
        
        System.out.println("Nombre: ");
        nombre = entrada.nextLine();
        ob1.setNombre(nombre);
        
         System.out.println("Fecha de Nacimiento");
        System.out.println("Año: ");
        while (anio > fecha.get(Calendar.YEAR)) {
            anio = entrada.nextInt();
        }
        ob1.setAnio(anio);

        System.out.println("Mes:");
        while (mes < 1 || mes > 12) {
            mes = entrada.nextInt();
        }
        ob1.setMes(mes - 1);

        System.out.println("Dia: ");
        while (dia < 1 || dia > 31) {
            dia = entrada.nextInt();
        }
        ob1.setDia(dia);
        System.out.println(ob1);
        escribir.escribirArchivo(nArchivo, ob1.getNombre(), ob1.getAnio(), ob1.getMes(), ob1.getDia());
    }
}
    
