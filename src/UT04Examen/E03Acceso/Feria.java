package UT04Examen.E03Acceso;

public class Feria extends  Evento implements Accesible {
    private boolean esFamiliar;

    public Feria(String nombre, int capacidad, boolean esFamiliar) {
        super(nombre, capacidad);
        this.esFamiliar = esFamiliar;
    }

    @Override
    public boolean puedeEntrar(int edad) {
        if ((edad >= 12 && edad < 105) || esFamiliar){
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
