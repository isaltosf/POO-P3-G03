package espol.edu.ec;

import java.util.*;
import espol.edu.ec.vista.*;
import espol.edu.ec.controlador.*;

public class Main {
    public static void main(String[] args) {
        // instancia de controlador
        ControladorPerfil controladorPerfil = new ControladorPerfil();

        // instancia de vista
        VistaPerfil vistaPerfil = new VistaPerfil(controladorPerfil);

        Scanner sc = new Scanner(System.in);
       
        int opcion= 0;
        do {
            vistaPerfil.mostrarMenu();
            opcion = sc.nextInt();

        switch (opcion){
            case 1:
                vistaPerfil.crearPerfil(sc);
                break;
            case 2:
               vistaPerfil.mostrarPerfiles();
            break;
            case 3:
                System.out.println("Saliendo de la aplicación...");
                break;
            default:
                System.out.println("Opción no válida.");
        }

        } while (opcion !=3);

    
    }
}