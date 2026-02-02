package UT04Ejercicios04HerenciaFiguras;

public class Prueba {
    public static void main(String[] args) {

        Figura f1 = new Figura("Verde");

        Cuadrado c1 = new Cuadrado("Azul", 4);

        System.out.println(c1.calcularAreaCuadrado());

    }
}
