package UT04Clase05Excepciones.E02ValidarNegativos;

public class ValidadorNumero {

    String nombre;

    public ValidadorNumero(String nombre) {
        this.nombre = nombre;
    }

    public int validarPositivo (int n){

        if (n < 0){
            throw new IllegalArgumentException("Numero negativo");
        }

        return n;
    }
}
