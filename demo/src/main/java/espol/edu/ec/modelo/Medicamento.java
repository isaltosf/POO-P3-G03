package espol.edu.ec.modelo;
import java.util.*;

public class Medicamento {
    private static int contador = 0; // Contador para IDs únicos
    private int id;
    private String nombre; // Nombre del medicamento
    private String presentacion; // Presentación del medicamento (pastilla, inyección, etc.)
    private int cantidad; // Cantidad disponible en el inventario
    private String frecuencia; // Frecuencia (ej. Cada día, Cada x días, etc.)
    private List<String> horasToma; // Lista de horas para las tomas diarias
    private int dosis; // Dosis para cada toma

    // Constructor
    public Medicamento(String nombre, String presentacion, int cantidad, String frecuencia, List<String> horasToma, int dosis) {
        this.id = ++contador;
        this.nombre = nombre;
        this.presentacion = presentacion;
        this.cantidad = cantidad;
        this.frecuencia = frecuencia;
        this.horasToma = horasToma;
        this.dosis = dosis;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public List<String> getHorasToma() {
        return horasToma;
    }

    public int getDosis() {
        return dosis;
    }

    // Setters
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Presentación: " + presentacion +
               ", Cantidad: " + cantidad + ", Frecuencia: " + frecuencia +
               ", Horas de Toma: " + horasToma + ", Dosis: " + dosis;
    }
}