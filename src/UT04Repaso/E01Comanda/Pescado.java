package UT04Repaso.E01Comanda;

public class Pescado extends Plato {

    public Pescado(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return super.toString() + "es pesacado";
    }
}
