package UT04Clase05Excepciones.E04ExcepcionPersonalizada;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("AAA");

        try {
            p1.establecerPrecio(4.5);
        } catch (ValorInvadidoException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        try {
            p1.establecerPrecio(-4.5);
        } catch (ValorInvadidoException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
