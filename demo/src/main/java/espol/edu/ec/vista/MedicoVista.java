package espol.edu.ec.vista;
import espol.edu.ec.controlador.*;
import espol.edu.ec.modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MedicoVista {
    private MedicoControlador controlador;
    private Scanner scanner;

    public MedicoVista(MedicoControlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void MostrarMenuMedico() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Médicos ---");
            System.out.println("1. Agregar Médico");
            System.out.println("2. Listar Médicos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarMedico();
                    break;
                case 2:
                    listarMedicos();
                    break;
                case 3:
                    System.out.println("Saliendo del menú de médicos...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    private void agregarMedico() {
        System.out.print("\nIngrese el nombre del médico: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la especialidad del médico: ");
        String especialidad = scanner.nextLine();

        System.out.print("Ingrese el número de contacto del médico: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese el correo electrónico del médico: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese la dirección de la consulta médica: ");
        String direccion = scanner.nextLine();

        controlador.agregarMedico(nombre, especialidad, telefono, email, direccion);
    }

    private void listarMedicos() {
        ArrayList<Medico> medicos = controlador.listarMedicos();
        if (medicos.isEmpty()) {
            System.out.println("No hay médicos registrados.");
        } else {
            System.out.println("\n--- Listado de Médicos ---");
            for (Medico medico : medicos) {
                System.out.println("Nombre: " + medico.getNombre());
                System.out.println("Especialidad: " + medico.getEspecialidad());
                System.out.println("Teléfono: " + medico.getTelefono());
                System.out.println("Email: " + medico.getEmail());
                System.out.println("Dirección: " + medico.getDireccion());
                System.out.println("----------------------------------");
        }
    }
}
}