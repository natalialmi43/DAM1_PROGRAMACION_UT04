package UT04Ejercicios06HerenciaRestaurante;

public class Primeros extends Platos {


    private boolean esParaCompartir;

    public boolean getEsParaCompartir() {
        return esParaCompartir;
    }

    public void setEsParaCompartir(boolean esParaCompartir) {
       this.esParaCompartir = esParaCompartir;
    }

    public Primeros(String nombre, double precio, boolean esParaCompartir) {
        super(nombre, precio);
        this.esParaCompartir = esParaCompartir;
    }

    @Override
    public String toString() {
        return super.toString() + " es " + (esParaCompartir ? "para compartir" : "indiviudal") ;
    }
}
