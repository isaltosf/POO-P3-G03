package espol.edu.ec.modelo;

public class Perfil {
    private String nombre;
    private String relacion;
    private String email;
    private int codigo;
    private static int codigoSecuencial;

    public Perfil(String nombre, String relacion, String email) {
        this.nombre = nombre;
        this.relacion = relacion;
        this.email = email;
        this.codigo = codigoSecuencial+1;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRelacion() {
        return relacion;
    }

    public String getEmail() {
        return email;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Perfil [nombre=" + nombre + ", relacion=" + relacion + ", email=" + email + ", codigo=" + codigo + "]";
    }


}
