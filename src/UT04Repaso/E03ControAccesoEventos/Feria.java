package UT04Repaso.E03ControAccesoEventos;

public class Feria extends Evento implements Accesible {
    private  boolean esFamiliar;

    public Feria(String nombre, int capacidad, boolean esFamiliar) {
        super(nombre, capacidad);
        this.esFamiliar = esFamiliar;
    }

    @Override
    protected double calcularPrecio() {
        if (esFamiliar){
            return 10;
        } else {
            return 15;
        }
    }

    @Override
    public boolean puedeEntrar(int edad) {
        if (edad <= 12){
            return false;
        } else {
            return true;
        }
    }
}
