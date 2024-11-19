package espol.edu.ec.vista;

public class MensajeUsuario {
    private String titulo;
    private String mensaje;

    public MensajeUsuario(String titulo, String mensaje) {
        this.titulo = titulo;
        this.mensaje = mensaje;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    @Override
    public String toString() {
        return titulo + ": " + mensaje;
    }
}
