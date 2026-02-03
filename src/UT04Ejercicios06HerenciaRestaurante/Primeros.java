package UT04Ejercicios06HerenciaRestaurante;

public class Primeros extends Platos {

    boolean compartirPrimeros;

    public Primeros(String nombrePlato, double precioPlato, boolean compartirPrimeros) {
        super(nombrePlato, precioPlato);
        this.compartirPrimeros = compartirPrimeros;
    }

    public Primeros() {
        this.compartirPrimeros = true;
    }

    public String toString (){

        if (compartirPrimeros){
            return super.toString() + " es un primero, y se va a compartir";

        } else {
            return super.toString() + " es un primero, y no se va a compartir";

        }
    }


}
