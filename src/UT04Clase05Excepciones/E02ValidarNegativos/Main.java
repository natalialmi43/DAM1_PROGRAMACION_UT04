package UT04Clase05Excepciones.E02ValidarNegativos;

public class Main {
    public static void main(String[] args) {

        ValidadorNumero v1 = new ValidadorNumero("AAA");

        try {
            v1.validarPositivo(4);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }


        try {
            v1.validarPositivo(-4);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
