package UT04Ejercicios06HerenciaRestaurante;

public class Postres extends  Platos {
    boolean tieneAzucarElPostre;

    public Postres(String nombrePlato, double precioPlato, boolean tieneAzucarElPostre) {
        super(nombrePlato, precioPlato);
        this.tieneAzucarElPostre = tieneAzucarElPostre;
    }

    public Postres() {
        this.tieneAzucarElPostre = true;
    }

    public String toString (){
        if (tieneAzucarElPostre){
            return super.toString() + " el postre tiene azúcar";
        } else {
            return super.toString() + " el postre no tiene azúcar";
        }
    }

}
