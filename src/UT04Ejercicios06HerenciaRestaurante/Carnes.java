package UT04Ejercicios06HerenciaRestaurante;

public class Carnes extends Platos {

    String gradoCoccionCarne;


    public Carnes(String nombrePlato, double precioPlato, String gradoCoccionCarne) {
        super(nombrePlato, precioPlato);
        this.gradoCoccionCarne = gradoCoccionCarne;
    }

    public Carnes() {
        if (gradoCoccionCarne != "Poco hecho" || gradoCoccionCarne != "Al punto" || gradoCoccionCarne != "Muy hecho" || gradoCoccionCarne != "Carbonizado" ){
            this.gradoCoccionCarne = "Al punto";
        }
    }


    public String toString (){

        return  super.toString() + " y quiere la carne " + gradoCoccionCarne;
    }



}
