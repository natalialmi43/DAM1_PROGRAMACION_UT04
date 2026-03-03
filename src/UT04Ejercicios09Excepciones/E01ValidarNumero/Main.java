package UT04Ejercicios09Excepciones.E01ValidarNumero;

public class Main {
    public static void main(String[] args) {

        ValidadorNumero validador = new ValidadorNumero();

        try {

            validador.validarPositivo(-4);

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());
        }
    }
}