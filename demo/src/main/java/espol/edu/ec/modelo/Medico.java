package espol.edu.ec.modelo;

public class Medico {
    private static int contador = 0; // Contador para IDs únicos
    private int id;
    private String nombre; // Nombre del médico
    private String especialidad; // Especialidad del médico
    private String telefono; // Número de contacto
    private String email; // Dirección de correo electrónico
    private String direccion; // Dirección de la consulta médica

    // Constructor
    public Medico(String nombre, String especialidad, String telefono, String email, String direccion) {
        this.id = ++contador;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    // Representación en texto
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Especialidad: " + especialidad + 
               ", Teléfono: " + telefono + ", Email: " + email + ", Dirección: " + direccion;
    }
}