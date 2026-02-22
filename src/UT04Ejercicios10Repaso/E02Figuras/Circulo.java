package UT04Ejercicios10Repaso.E02Figuras;

public class Circulo extends Figura {

    private double radio;

    public Circulo (String color, double radio){
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return 2 * Math.PI * ( radio  * radio);
    }
}
