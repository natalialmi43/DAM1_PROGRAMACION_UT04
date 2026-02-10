package UT04Ejercicios04HerenciaFiguras;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double calcularAreaCuadrado (){
        return lado*lado;
    }

    public double calcularPerimetroCuadrado (){
        return 4*lado;
    }
}
