package UT04Repaso.E01Comanda;

public class Postre extends Plato {

    private boolean tieneAzucar;


    public Postre(String nombre, double precio, boolean tieneAzucar) {
        super(nombre, precio);
        this.tieneAzucar = tieneAzucar;
    }

    public boolean isTieneAzucar() {
        return tieneAzucar;
    }

    @Override
    public String toString() {
        return super.toString() + (tieneAzucar ? "tiene azúcar" : "no tiene azúcar");
    }
}
