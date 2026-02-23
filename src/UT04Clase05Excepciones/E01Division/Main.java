package UT04Clase05Excepciones.E01Division;

public class Main {
    public static void main(String[] args) {

        CalculadoraSimple c1 = new CalculadoraSimple("AAA");

        try {
            c1.dividir(8,4);
        } catch (ArithmeticException e){
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            c1.dividir(8,0);
        } catch (ArithmeticException e){
            System.out.println("ERROR: " + e.getMessage());
        }

    }
}
