package espol.edu.ec.controlador;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import espol.edu.ec.modelo.ActividadFisica;

public class ActividadFisicaControlador {
    private List<ActividadFisica> lstacActividadFisicas;

    public ActividadFisicaControlador() {
        lstacActividadFisicas = new ArrayList<>();
        ordenarActividadesPorFecha();
    }

    public void agregarActividad(ActividadFisica af){
        lstacActividadFisicas.add(af);
    }

    private void ordenarActividadesPorFecha(){
        lstacActividadFisicas.sort((a1,a2) -> a2.getFecha().compareTo(a1.getFecha()));

    }

    public List<ActividadFisica> getActividadesOrdenadas(){
        return lstacActividadFisicas;
    }
}