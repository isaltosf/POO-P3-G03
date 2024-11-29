package espol.edu.ec.controlador;
import java.util.ArrayList;
import espol.edu.ec.modelo.ActividadFisica;

public class ActividadFisicaControlador {
    private ArrayList<ActividadFisica> lstacActividadFisicas;

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

    public ArrayList<ActividadFisica> getActividadesOrdenadas(){
        return lstacActividadFisicas;
    }
}