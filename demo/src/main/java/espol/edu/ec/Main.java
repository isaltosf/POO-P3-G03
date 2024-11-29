package espol.edu.ec;

import espol.edu.ec.vista.*;
import espol.edu.ec.controlador.*;


public class Main {
    public static void main(String[] args) {
        ControladorPerfil controlador = new ControladorPerfil();
        VistaPerfil vista = new VistaPerfil(controlador);
        vista.mostrarListaPerfiles();
        vista.mostrarOpciones();
    }
}