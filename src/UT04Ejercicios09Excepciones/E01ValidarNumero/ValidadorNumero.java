package UT04Ejercicios09Excepciones.E01ValidarNumero;

public class ValidadorNumero {

    public void validarPositivo ( int n) {

       if (n < 0){
           throw new IllegalArgumentException("Error: El número introducido (" + n + ") no puede ser negativo");
       }

        System.out.println("Correcto. El número " + n + " es válido.");

    }
}
