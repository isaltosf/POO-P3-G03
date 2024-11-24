package espol.edu.ec.vista;

import espol.edu.ec.controlador.*;
import espol.edu.ec.modelo.*;
import java.util.Scanner;

public class CitaMedicaVista {
    private CitaMedicaControlador controlador;
    private Scanner scanner;

    public CitaMedicaVista(CitaMedicaControlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Citas Médicas ---");
            System.out.println("1. Agregar Cita Médica");
            System.out.println("2. Listar Citas Médicas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarCita();
                    break;
                case 2:
                    listarCitas();
                    break;
                case 3:
                    System.out.println("Saliendo del menú de citas médicas...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    private void agregarCita() {
        System.out.print("Ingrese el título de la cita: ");
        String titulo = scanner.nextLine();

        System.out.print("Ingrese el nombre del doctor: ");
        String doctor = scanner.nextLine();

        System.out.print("Ingrese la fecha y hora (dd-MM-yyyy HH:mm): ");
        String fechaHora = scanner.nextLine();

        if (!controlador.validarFechaHora(fechaHora)) {
            System.out.println("Fecha y hora inválidas. Asegúrese de usar el formato correcto.");
            return;
        }

        controlador.agregarCita(titulo, doctor, fechaHora);
    }

    private void listarCitas() {
        System.out.println("\n--- Lista de Citas Médicas ---");
        for (CitaMedica cita : controlador.listarCitasOrdenadas()) {
            System.out.println(cita);
        }
    }
}