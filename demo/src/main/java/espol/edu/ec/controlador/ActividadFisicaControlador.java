package espol.edu.ec.controlador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import espol.edu.ec.modelo.ActividadFisica;

public class ActividadFisicaControlador {
    private List<ActividadFisica> actividades;

    public ActividadFisicaControlador() {
        actividades = new ArrayList<>();
        // Actividad inicial cargada por defecto
        actividades.add(new ActividadFisica("22-11-2024", 30, "Mañana"));
    }

    public void registrarActividad(String fecha, int duracion, String horario) {
        actividades.add(new ActividadFisica(fecha, duracion, horario));
        System.out.println("Actividad física registrada exitosamente.");
    }

    public List<ActividadFisica> listarActividades() {
        return actividades; // Devuelve la lista de actividades registradas
    }

    public boolean validarFecha(String fecha) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate fechaIngresada = LocalDate.parse(fecha, formatter);
            LocalDate fechaActual = LocalDate.now();
            return !fechaIngresada.isAfter(fechaActual); // Valida que no sea futura
        } catch (DateTimeParseException e) {
            return false; // Fecha inválida si ocurre un error al parsear
        }
    }
}