package UT04Ejercicios10Repaso.E02Figuras;

public class Rectangulo extends Figura{
    private double ancho;
    private double largo;

    public Rectangulo(String color, double ancho, double largo) {
        super(color);
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double calcularArea() {
        return ancho*largo;
    }
}
