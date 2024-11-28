package espol.edu.ec.controlador;

import java.util.*;
import espol.edu.ec.modelo.Medico;
import espol.edu.ec.vista.*;
public class MedicoControlador {
    private ArrayList<Medico> medicos;

    public MedicoControlador() {
        medicos = new ArrayList<>();
        // Médico inicial cargado por defecto
        medicos.add(new Medico("Dr. Pérez", "Pediatra", "0991234567", "dr.perez@hospital.com", "Av. Principal 123"));
    }

    public void agregarMedico(String nombre, String especialidad, String telefono, String email, String direccion) {
        medicos.add(new Medico(nombre, especialidad, telefono, email, direccion));
        System.out.println("Médico añadido exitosamente.");
    }

    public List<Medico> listarMedicos() {
        return medicos; // Devuelve la lista de médicos registrados
    }
}