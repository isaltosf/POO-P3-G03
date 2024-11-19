package espol.edu.ec.vista;

import java.util.*;
import espol.edu.ec.controlador.*;
import espol.edu.ec.modelo.Perfil;

public class VistaPerfil {
    ControladorPerfil controlador = new ControladorPerfil();

    public VistaPerfil(ControladorPerfil controlador) {
        this.controlador = controlador;
    }

    public void mostrarMenu(){
        System.out.println("¡Bienvenido!");
        System.out.println("1. Crear perfil.");
        System.out.println("2. Seleccionar perfil.");
        System.out.println("3. Salir.");
        System.out.println("Ingrese una opción: ");
    }

    public void crearPerfil(Scanner sc){
        System.out.println("Ingrese el nombre del miembro de la familia: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Ingrese la relación con el usuario que está creando el perfi: ");
        String relacion = sc.nextLine();
        System.out.println("Ingrese email: ");
        String email = sc.nextLine();
        if (email.trim().isEmpty()) {
            email = "No especificado";
        }
        MensajeUsuario mensaje = controlador.agregarPerfil(nombre,relacion,email);
        if (mensaje != null) {
            mostrarMensaje(mensaje.toString());
        } else {
            mostrarMensaje("Perfil agregado exitosamente.");
        }

    }

    public void mostrarPerfiles() {
        if (controlador.getListaPerfiles().isEmpty()) {
            mostrarMensaje("No hay contactos registrados.");
        } else {
            listarPerfiles(controlador.getListaPerfiles());
        }
        }

    public void listarPerfiles(List<Perfil> perfiles){
        System.out.printf("%-5s %-20s %-10s %-20s\n", "Cod", "Nombre", "Relacion", "Email");
        System.out.println(new String(new char[35]).replace("\0", "-"));
        for(Perfil perfil : perfiles) {
            System.out.println(perfil);
        }

    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    

}
