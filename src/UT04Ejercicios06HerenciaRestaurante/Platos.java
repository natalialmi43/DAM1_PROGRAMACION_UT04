package UT04Ejercicios06HerenciaRestaurante;

public class Platos {

    String nombrePlato;
    double precioPlato;


    public Platos(String nombrePlato, double precioPlato) {
        this.nombrePlato = nombrePlato;
        this.precioPlato = precioPlato;
    }

    public Platos() {
        this.nombrePlato = "Por defecto";
        this.precioPlato = 0.00;
    }


    public String toString (){
        return "El " + nombrePlato + " cuesta " + precioPlato;
    }

}
