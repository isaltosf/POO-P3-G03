package espol.edu.ec.controlador;

import java.util.*;
import espol.edu.ec.modelo.*;
import espol.edu.ec.vista.*;
public class MedicamentoControlador {
    private List<Medicamento> medicamentos;

    public MedicamentoControlador() {
        medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(String nombre, String presentacion, int cantidad, String frecuencia, List<String> horasToma, int dosis) {
        medicamentos.add(new Medicamento(nombre, presentacion, cantidad, frecuencia, horasToma, dosis));
        System.out.println("Medicamento añadido exitosamente.");
    }

    public List<Medicamento> listarMedicamentos() {
        return medicamentos;
    }

    public boolean eliminarMedicamento(int id) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getId() == id) {
                medicamentos.remove(medicamento);
                return true;
            }
        }
        return false;
    }

    public boolean registrarToma(int id, int cantidadTomada) {
        for (Medicamento medicamento : medicamentos) {
            if (medicamento.getId() == id) {
                if (medicamento.getCantidad() >= cantidadTomada) {
                    medicamento.setCantidad(medicamento.getCantidad() - cantidadTomada);
                    return true;
                }
                return false; // No hay suficiente cantidad disponible
            }
        }
        return false; // Medicamento no encontrado
    }
}
