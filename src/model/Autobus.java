package model;

public class Autobus {
    private String numeroUnidad;
    private String conductor;
    private String ubicacionActual;
    private boolean estaActivo;

    public Autobus(String numeroUnidad, String conductor, String ubicacionActual, boolean estaActivo) {
        this.numeroUnidad = numeroUnidad;
        this.conductor = conductor;
        this.ubicacionActual = ubicacionActual;
        this.estaActivo = estaActivo;
    }
    public boolean isEstaActivo() {
        return estaActivo;
    }
    public String getNumeroUnidad() {
        return numeroUnidad;
    }
    public String getConductor() {
        return conductor;
    }
    public String getUbicacionActual() {
        return ubicacionActual;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "numeroUnidad='" + numeroUnidad + '\'' +
                ", conductor='" + conductor + '\'' +
                ", ubicacionActual='" + ubicacionActual + '\'' +
                ", estaActivo=" + estaActivo +
                '}';
    }
}
