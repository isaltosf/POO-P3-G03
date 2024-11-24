package espol.edu.ec.vista;

import espol.edu.ec.controlador.*;
import espol.edu.ec.modelo.*;
import java.util.Scanner;

public class ActividadFisicaVista {
    private ActividadFisicaControlador controlador;
    private Scanner scanner;

    public ActividadFisicaVista(ActividadFisicaControlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Actividad Física ---");
            System.out.println("1. Registrar Actividad");
            System.out.println("2. Listar Actividades");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    registrarActividad();
                    break;
                case 2:
                    listarActividades();
                    break;
                case 3:
                    System.out.println("Saliendo del menú de actividad física...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    private void registrarActividad() {
        System.out.print("Ingrese la fecha (dd-MM-yyyy): ");
        String fecha = scanner.nextLine();
        if (!controlador.validarFecha(fecha)) {
            System.out.println("Fecha inválida. Asegúrese de usar el formato correcto y que no sea una fecha futura.");
            return;
        }

        System.out.print("Ingrese la duración en minutos: ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese el horario (Mañana, Tarde, Noche): ");
        String horario = scanner.nextLine();

        controlador.registrarActividad(fecha, duracion, horario);
    }

    private void listarActividades() {
        System.out.println("\n--- Lista de Actividades Físicas ---");
        for (var actividad : controlador.listarActividades()) {
            System.out.println(actividad);
        }
    }
}