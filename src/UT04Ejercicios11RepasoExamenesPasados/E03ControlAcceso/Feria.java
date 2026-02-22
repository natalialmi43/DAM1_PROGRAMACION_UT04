package UT04Ejercicios11RepasoExamenesPasados.E03ControlAcceso;

public class Feria extends Evento implements Accesible {

    private boolean esFamiliar;

    public Feria(String nombreEvento, int capacidadMaxima, boolean esFamiliar) {
        super(nombreEvento, capacidadMaxima);
        this.esFamiliar = esFamiliar;
    }

    @Override
    public boolean puedeEntrar(int edad) {
        if (edad >= 12 || esFamiliar){
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected double calcularPrecio() {
        if (esFamiliar){
            return 10;
        } else {
            return 15;
        }
    }
}
