package UT04Ejercicios10RepasoEjerciciosCortos.E02Figuras;

public abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
}
