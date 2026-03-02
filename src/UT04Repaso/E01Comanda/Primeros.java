package UT04Repaso.E01Comanda;

public class Primeros extends  Plato {

    private boolean compartir;

    public Primeros(String nombre, double precio, boolean compartir) {
        super(nombre, precio);
        this.compartir = compartir;
    }

    @Override
    public String toString() {
        return super.toString() + (compartir ? " es para compartir" : " no es para compartir");
    }
}
