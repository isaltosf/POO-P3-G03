package espol.edu.ec.vista;

import java.util.*;
import espol.edu.ec.controlador.*;
import espol.edu.ec.modelo.Perfil;

public class VistaPerfil {
    ControladorPerfil controlador = new ControladorPerfil();

    public VistaPerfil(ControladorPerfil controlador) {
        this.controlador = controlador;
    }
    public void mostrarListaPerfiles() {
        ArrayList<Perfil> perfiles = controlador.getListaPerfiles();
        if(perfiles.isEmpty()){
            System.out.println("No hay perfiles disponibles");
        }else{
            System.out.println("**********Perfiles**********");
            for (Perfil perfil : perfiles) {
                System.out.println(perfil);
            }
        }
    }


    public void crearPerfil(Scanner sc){
        System.out.println("\n--- Crear Perfil ---");
        System.out.print("Ingrese el nombre del perfil: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la relación (ejemplo: amigo, hija, etc.): ");
        String relacion = sc.nextLine();
        System.out.print("Ingrese el correo electrónico: ");
        String email = sc.nextLine();

        MensajeUsuario mensaje = controlador.agregarPerfil(nombre, relacion, email);
        System.out.println(mensaje.getMensaje());

    }
    private void seleccionarPerfil(Scanner sc) {
        System.out.println("\n--- Seleccionar Perfil ---");
        mostrarListaPerfiles();
        System.out.print("Ingrese el código del perfil que desea seleccionar: ");
        int codigo = Integer.parseInt(sc.nextLine());
        Perfil perfilSeleccionado = controlador.seleccionarPerfil(codigo);
        if (perfilSeleccionado != null) {
            System.out.println("Perfil seleccionado: " + perfilSeleccionado);
        } else {
            System.out.println("No se encontró un perfil con ese código.");
        }
    }
    public void mostrarOpciones(){
        Scanner sc = new Scanner(System.in);
        String opcion = "";

        while (!"d".equals(opcion)) {
            System.out.println("\n--- Menú de Perfiles ---");
            System.out.println("a. Crear perfil");
            System.out.println("b. Seleccionar perfil");
            System.out.println("c. Mostrar lista de perfiles");
            System.out.println("d. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextLine().toLowerCase();

            if ("a".equals(opcion)) {
                crearPerfil(sc);
            } else if ("b".equals(opcion)) {
                seleccionarPerfil(sc);
                Perfil ps = controlador.seleccionarPerfil(Integer.parseInt(sc.nextLine()));
            if (ps != null) {
                mostrarMenuSeleccionar(sc, ps);
            } else {
                System.out.println("No se encontró un perfil con ese código.");
            }
            } else if ("c".equals(opcion)) {
                mostrarListaPerfiles();
            } else if ("d".equals(opcion)) {
                System.out.println("Saliendo del menú de perfiles...");
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    } 
    private void mostrarMenuSeleccionar(Scanner sc, Perfil perfilSeleccionado){
        String opcion = "";

        while (!"5".equals(opcion)) {
            System.out.println("\n--- Menú del Perfil Seleccionado ---");
            System.out.println("1. Administrar Medicamentos");
            System.out.println("2. Administrar Médicos");
            System.out.println("3. Administrar Citas Médicas");
            System.out.println("4. Administrar Actividad Física");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextLine();

            if ("1".equals(opcion)) {
                MedicamentoControlador medicamentoC = new MedicamentoControlador();
                MedicamentoVista mv = new MedicamentoVista(medicamentoC);
                mv.mostrarMenuMedicamentos();
            } else if ("2".equals(opcion)) {
                MedicoControlador medicoC = new MedicoControlador();
                MedicoVista mvv = new MedicoVista(medicoC);
                mvv.MostrarMenuMedico();
            } else if ("3".equals(opcion)) {
                // Lógica para administrar citas médicas
            } else if ("4".equals(opcion)) {
                ActividadFisicaControlador actividadFC = new ActividadFisicaControlador();
                ActividadFisicaVista actividadFisicaVista = new ActividadFisicaVista(actividadFC);
                actividadFisicaVista.mostrarMenuActividadFisica();
            } else if ("5".equals(opcion)) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    

}
