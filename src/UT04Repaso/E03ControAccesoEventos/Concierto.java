package UT04Repaso.E03ControAccesoEventos;

public class Concierto extends Evento implements Accesible{

    private boolean esInternacional;

    public Concierto(String nombre, int capacidad, boolean esInternacional) {
        super(nombre, capacidad);
        this.esInternacional = esInternacional;
    }

    @Override
    protected double calcularPrecio() {
        if (esInternacional){
            return 50;
        } else {
            return 30;
        }
    }

    @Override
    public boolean puedeEntrar(int edad) {
        if (edad < 18){
            return false;
        } else {
            return true;
        }
    }
}
