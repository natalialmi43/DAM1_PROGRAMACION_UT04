package UT04Ejercicios10Repaso.E02Figuras;

public class Prueba {

    public static void main(String[] args) {

        Circulo c1 = new Circulo("Verde", 5);

        Rectangulo r1 = new Rectangulo("Azul", 2,5);

        System.out.println(c1.calcularArea());

        System.out.println(r1.calcularArea());
    }

}
