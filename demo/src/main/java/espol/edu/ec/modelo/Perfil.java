package espol.edu.ec.modelo;

public class Perfil {
    private int codigo;
    private String nombre;
    private String relacion;
    private String email;

    public Perfil(int codigo, String nombre, String relacion, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.relacion = relacion;
        this.email = email;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRelacion() {
        return relacion;
    }
    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void generarCodigo(){
        
    }

}
