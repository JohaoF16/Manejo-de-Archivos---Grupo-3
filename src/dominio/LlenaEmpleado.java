
package dominio;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LlenaEmpleado {
    Calendar fecha = new GregorianCalendar();
    int diaA = fecha.get(Calendar.DAY_OF_MONTH);
    int mesA = fecha.get(Calendar.MONTH);
    int anioA = fecha.get(Calendar.YEAR);
    private String nombre;
    private int anion;
    private int mesn;
    private int dian;
    
    public LlenaEmpleado(String nombre, int anio, int mes, int dia) {
        this.nombre = nombre;
        this.anion = anio;
        this.mesn = mes;
        this.dian = dia;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnio(int anio) {
        int resultado = anioA - anio;
        this.anion = resultado;
    }

    public int getAnio() {
        return this.anion;
    }

    public int getMes() {
        return this.mesn;
    }

    public void setMes(int mes) {
        int resultado = mesA - mes;
        if (resultado < 0) {
            resultado += 11;
            this.anion--;
        } else if (resultado > 0) {
            resultado--;
        }
        this.mesn = resultado;
    }

    public int getDia() {
        return this.dian;
    }

    public void setDia(int dia) {
        int dias = 31;
        if (mesA == 4 || mesA == 6 || mesA == 9 || mesA == 11) {
            dias = 30;
        } else if (mesA == 2) {
            dias = 28;
        }
        int resultado = diaA - dia;
        if (resultado < 0) {
            resultado += dias;
        }
        this.dian = resultado;
    }
    @Override
    public String toString() {
        return "Nombre:\t" + this.nombre.toUpperCase() + "\nEdad" + "\nAños:\t" +  this.anion + "\nMeses:\t" + this.mesn + "\nDías:\t" + this.dian ;
    }
}
