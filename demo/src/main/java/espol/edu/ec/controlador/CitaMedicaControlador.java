package espol.edu.ec.controlador;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import espol.edu.ec.modelo.CitaMedica;

public class CitaMedicaControlador {
    private List<CitaMedica> citas;

    public CitaMedicaControlador() {
        citas = new ArrayList<>();
        // Cita inicial cargada por defecto
        citas.add(new CitaMedica("Consulta General", "Dr. Pérez", "25-11-2024 10:00"));
    }

    public void agregarCita(String titulo, String doctor, String fechaHora) {
        citas.add(new CitaMedica(titulo, doctor, fechaHora));
        System.out.println("Cita médica añadida exitosamente.");
    }

    public List<CitaMedica> listarCitasOrdenadas() {
        // Ordenación manual de las citas
        for (int i = 0; i < citas.size(); i++) {
            for (int j = i + 1; j < citas.size(); j++) {
                if (convertirFechaHora(citas.get(i).getFechaHora())
                        .isAfter(convertirFechaHora(citas.get(j).getFechaHora()))) {
                    // Intercambiar las citas
                    CitaMedica temp = citas.get(i);
                    citas.set(i, citas.get(j));
                    citas.set(j, temp);
                }
            }
        }
        return citas;
    }

    private LocalDateTime convertirFechaHora(String fechaHora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return LocalDateTime.parse(fechaHora, formatter);
    }

    public boolean validarFechaHora(String fechaHora) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            LocalDateTime.parse(fechaHora, formatter); // Validar formato
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }
}