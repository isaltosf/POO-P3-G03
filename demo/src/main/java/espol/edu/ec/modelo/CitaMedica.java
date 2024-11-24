package espol.edu.ec.modelo;


public class CitaMedica {
    private static int contador = 0; // Contador para IDs únicos
    private int id;
    private String titulo; // Título de la cita
    private String doctor; // Nombre del doctor
    private String fechaHora; // Fecha y hora en formato adecuado

    // Constructor
    public CitaMedica(String titulo, String doctor, String fechaHora) {
        this.id = ++contador;
        this.titulo = titulo;
        this.doctor = doctor;
        this.fechaHora = fechaHora;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", Doctor: " + doctor + ", Fecha y Hora: " + fechaHora;
    }
}