package UT04Ejercicios06HerenciaRestaurante;

public class Pescados  extends herenciaRestaurante.Platos {

    public Pescados(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return super.toString() + " es pescado";
    }
}
