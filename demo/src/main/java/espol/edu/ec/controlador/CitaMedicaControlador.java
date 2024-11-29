package espol.edu.ec.controlador;

import java.util.ArrayList;
import java.util.Date;
import espol.edu.ec.modelo.CitaMedica;

public class CitaMedicaControlador {
    private ArrayList<CitaMedica> lsCitasMedicas;

    public CitaMedicaControlador() {
        this.lsCitasMedicas = new ArrayList<>();
        ordenarActividadesPorFecha();
    }

    private void ordenarActividadesPorFecha(){
        lsCitasMedicas.sort((a1,a2) -> a2.getFechaHora().compareTo(a1.getFechaHora()));
    }

    public void agregarCita(String titulo, String doctor, Date fechaHora){
        lsCitasMedicas.add(new CitaMedica(titulo, doctor, doctor));
        System.out.println("Cita médica añadida exitosamente. ");
    }

    public ArrayList<CitaMedica> getCitaMedicas(){
        return lsCitasMedicas;
    }
}