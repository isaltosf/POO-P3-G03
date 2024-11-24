package espol.edu.ec.vista;

import java.util.*;
import espol.edu.ec.controlador.*;
import espol.edu.ec.modelo.*;
public class MedicamentoVista {
    private MedicamentoControlador controlador;
    private Scanner scanner;

    public MedicamentoVista(MedicamentoControlador controlador) {
        this.controlador = controlador;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú de Medicamentos ---");
            System.out.println("1. Agregar Medicamento");
            System.out.println("2. Listar Medicamentos");
            System.out.println("3. Eliminar Medicamento");
            System.out.println("4. Registrar Toma de Medicamento");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    agregarMedicamento();
                    break;
                case 2:
                    listarMedicamentos();
                    break;
                case 3:
                    eliminarMedicamento();
                    break;
                case 4:
                    registrarToma();
                    break;
                case 5:
                    System.out.println("Saliendo del menú de medicamentos...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    private void agregarMedicamento() {
        System.out.print("Ingrese el nombre del medicamento: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la presentación (Pastilla, Inyección, etc.): ");
        String presentacion = scanner.nextLine();

        System.out.print("Ingrese la cantidad disponible: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la frecuencia (Cada día, Cada x días, etc.): ");
        String frecuencia = scanner.nextLine();

        System.out.print("Ingrese el número de horas de toma: ");
        int numHoras = scanner.nextInt();
        scanner.nextLine();

        List<String> horasToma = new ArrayList<>();
        for (int i = 0; i < numHoras; i++) {
            System.out.print("Ingrese la hora de la toma (formato 24h HH:mm): ");
            horasToma.add(scanner.nextLine());
        }

        System.out.print("Ingrese la dosis para cada toma: ");
        int dosis = scanner.nextInt();
        scanner.nextLine();

        controlador.agregarMedicamento(nombre, presentacion, cantidad, frecuencia, horasToma, dosis);
    }

    private void listarMedicamentos() {
        System.out.println("\n--- Lista de Medicamentos ---");
        for (Medicamento medicamento : controlador.listarMedicamentos()) {
            System.out.println(medicamento);
        }
    }

    private void eliminarMedicamento() {
        System.out.print("Ingrese el ID del medicamento a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        if (controlador.eliminarMedicamento(id)) {
            System.out.println("Medicamento eliminado exitosamente.");
        } else {
            System.out.println("No se encontró un medicamento con ese ID.");
        }
    }

    private void registrarToma() {
        System.out.print("Ingrese el ID del medicamento para registrar la toma: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la cantidad tomada: ");
        int cantidadTomada = scanner.nextInt();
        scanner.nextLine();

        if (controlador.registrarToma(id, cantidadTomada)) {
            System.out.println("Toma registrada exitosamente.");
        } else {
            System.out.println("Error al registrar la toma. Verifique el ID o la cantidad disponible.");
        }
    }
}