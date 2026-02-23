package UT04Clase05Excepciones.E04ExcepcionPersonalizada;

public class Producto {

    String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public void establecerPrecio(double precio) throws ValorInvadidoException {

        if (precio < 0){
            throw new ValorInvadidoException("No se pueden meter valores menores a 0");
        }

    }
}
