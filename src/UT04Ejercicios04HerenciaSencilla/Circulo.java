package UT04Ejercicios04HerenciaSencilla;

public class Circulo extends  Figura {

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }


    public double calcularAreaCirculo (){
        return Math.PI*(radio*radio);
    }

    public double calcularPerimetroCirculo (){
        return 2*Math.PI*radio;
    }


}
