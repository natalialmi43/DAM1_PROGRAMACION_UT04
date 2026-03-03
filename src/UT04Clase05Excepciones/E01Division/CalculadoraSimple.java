package UT04Clase05Excepciones.E01Division;

public class CalculadoraSimple {

    public String nombre;

    public CalculadoraSimple(String nombre) {
        this.nombre = nombre;
    }

    public double dividir (int dividendo, int divisor){

        if (divisor == 0){
            throw new ArithmeticException("No se puede dividir entre 0");
        }

        return dividendo/divisor;
    }
}
