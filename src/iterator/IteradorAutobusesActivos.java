package iterator;

import model.Autobus;

import java.util.List;

public class IteradorAutobusesActivos {
    private List<Autobus> autobuses;
    private int posicionActual = 0;

    public IteradorAutobusesActivos(List<Autobus> autobuses) {
        this.autobuses = autobuses;
    }
    public boolean tieneSiguiente() {
        while (posicionActual < autobuses.size()) {
            if (autobuses.get(posicionActual).isEstaActivo()) {
                return true;
            }
            posicionActual++;
        }
        return false;
    }
    public Autobus siguiente() {
        if (this.tieneSiguiente()) {
            Autobus bus = autobuses.get(posicionActual);
            posicionActual++;
            return bus;
        }
        return null;
    }
}
