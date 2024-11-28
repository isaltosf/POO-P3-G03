package espol.edu.ec.controlador;
import java.util.*;
import espol.edu.ec.modelo.Perfil;
import espol.edu.ec.vista.*;

public class ControladorPerfil {
    private ArrayList<Perfil> listaPerfiles;

    public ArrayList<Perfil> getListaPerfiles() {
        return listaPerfiles;
    }

    // se carga un perfil para comprobar funcionalidad
    public ControladorPerfil() {
        this.listaPerfiles = new ArrayList<>();
        listaPerfiles.add(new Perfil("Carolina Sánchez","Hija","carisanc@espol.edu.ec"));
    }

    public MensajeUsuario agregarPerfil(String nombre, String relacion, String email){
        if (buscarPerfilPorNombre(nombre) == null) {
            Perfil nuevoPerfil = new Perfil(nombre, relacion, email);
            listaPerfiles.add(nuevoPerfil);
            return new MensajeUsuario("Agregar perfil", "Perfil agregado correctamente.");
        }
        return new MensajeUsuario("Agregar perfil", "El perfil " + nombre + " ya existe.");
    }

    private Perfil buscarPerfilPorNombre(String nombre) {
        for (Perfil perfil : listaPerfiles) {
            if (perfil.getNombre().equalsIgnoreCase(nombre)) {
                return perfil;
            }
        }
        return null; // no se encontró el perfil
    }

    public Perfil seleccionarPerfil(int codigo){
        for(Perfil perfil : listaPerfiles){
            if(perfil.getCodigo() == codigo){
                return perfil;
            }
        }
        return null; // no se encontró el perfil

    }

}
