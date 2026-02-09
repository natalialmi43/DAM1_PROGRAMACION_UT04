package herenciaRestaurante;

public class Pescados  extends  Platos {

    public Pescados(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return super.toString() + " es pescado";
    }
}
