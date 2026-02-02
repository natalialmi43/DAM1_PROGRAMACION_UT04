package UT04Ejercicios04HerenciaSencilla;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double calcularAreaTriangulo (){
        return (base*altura)/2;
    }

    public double calcularPerimetroTriangulo (){
        return base*3;
    }
}
