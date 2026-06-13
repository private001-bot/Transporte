package main;

import collection.FlotaAutobuses;
import iterator.Iterador;
import model.Autobus;

public class main {
    public static void main(String[] args) {
        FlotaAutobuses terminal = new FlotaAutobuses();

        terminal.agregarAutobus(new Autobus("Unidad 101", "Juan Perez", "Ruta Lima", true));
        terminal.agregarAutobus(new Autobus("Unidad 102", "Carlos Ruiz", "Taller Mecanico", false));
        terminal.agregarAutobus(new Autobus("Unidad 103", "Luis Gomez", "Terminal", true));
        terminal.agregarAutobus(new Autobus("Unidad 104", "Pedro Salas", "Fuera de Servicio", false));

        System.out.println("------- Monitoreo de Autobuses Activos ---------");
        Iterador iterador = terminal.crearIterador();

        while (iterador.tieneSiguiente()) {
            Autobus bus = iterador.siguiente();
            System.out.println("Monitoreando : " + bus.getNumeroUnidad() + "| Conductor: " + bus.getConductor() + " | Ubicación: " + bus.getUbicacionActual());
        }
    }
}
