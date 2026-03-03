package UT04Ejercicios10RepasoEjerciciosCortos.E04GestionElectroAvila;

public abstract class Electrodomestico {

    private String nombre;
    private double precio;

    public Electrodomestico (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double precioFinal() {
        return precio;
    }

}
