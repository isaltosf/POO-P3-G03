package espol.edu.ec.modelo;

public class ActividadFisica {
    private static int contador = 0; // Contador para IDs únicos
    private int id;
    private String fecha; // Fecha en formato dd-MM-yyyy
    private String actividad; // Ahora es un String con valor predeterminado
    private int duracion; // Duración en minutos
    private String horario; // Mañana, Tarde o Noche

    // Constructor
    public ActividadFisica(String fecha, int duracion, String horario) {
        this.id = ++contador;
        this.fecha = fecha;
        this.actividad = "Caminar"; // Valor predeterminado
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
        return "ID: " + id + ", Fecha: " + fecha + ", Actividad: " + actividad +
               ", Duración: " + duracion + " minutos, Horario: " + horario;
    }
}