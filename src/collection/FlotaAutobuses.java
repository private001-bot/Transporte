package collection;
import iterator.Iterador;
import iterator.IteradorAutobusesActivos;
import model.Autobus;
import java.util.ArrayList;
import java.util.List;

public class FlotaAutobuses implements Coleccion {
    private List<Autobus> listaAutobuses;

    public FlotaAutobuses() {
        this.listaAutobuses = new ArrayList<>();
    }
    public void agregarAutobus(Autobus autobus){
        listaAutobuses.add(autobus);
    }
    public Iterador crearIterador() {
        return new IteradorAutobusesActivos(listaAutobuses);
    }
}
