package espol.edu.ec.modelo;

public class ActividadFisica {
    private static int contador = 0; // Contador para IDs únicos
    private int id;
    private String fecha; // Fecha en formato dd-MM-yyyy
    private String actividad; // Ahora es un String con valor predeterminado
    private int duracion; // Duración en minutos
    private String horario; // Mañana, Tarde o Noche
    
    public ActividadFisica(String fecha, String actividad, int duracion, String horario) {
        this.fecha = fecha;
        this.actividad = actividad;
        this.duracion = duracion;
        this.horario = horario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getFecha() {
        return fecha;
    }

    public String getActividad() {
        return actividad;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getHorario() {
        return horario;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "ID: " + id + ", Fecha: " + fecha + ", Actividad: " + actividad + ", Duración: " + duracion + " minutos, Horario: " + horario;
    }

    
}
