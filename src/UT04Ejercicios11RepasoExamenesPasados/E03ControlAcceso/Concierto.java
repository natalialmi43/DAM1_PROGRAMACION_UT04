package UT04Ejercicios11RepasoExamenesPasados.E03ControlAcceso;

public class Concierto extends Evento implements Accesible {

    private boolean esInternacional;

    public Concierto(String nombreEvento, int capacidadMaxima, boolean esInternacional) {
        super(nombreEvento, capacidadMaxima);
        this.esInternacional = esInternacional;
    }

    @Override
    protected double calcularPrecio() {
        double precioFinal;

        if (esInternacional){
            precioFinal = 50;
        } else {
            precioFinal = 30;
        }
        return precioFinal;
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
