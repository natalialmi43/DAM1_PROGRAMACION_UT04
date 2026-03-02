package UT04Examen.E03Acceso;

public class Concierto extends  Evento implements Accesible {

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
        if (edad >= 18 && edad < 105){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " el artista que viene " + ((esInternacional) ? " es internacional" : " no es internacional, el precio del concierto es " + calcularPrecio());
    }
}
