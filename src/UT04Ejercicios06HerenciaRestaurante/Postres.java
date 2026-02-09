package herenciaRestaurante;

public class Postres extends Platos {

    private boolean tieneAzucar;

    public boolean getTieneAzucar() {
        return tieneAzucar;
    }

    public void setTieneAzucar(boolean tieneAzucar) {
        this.tieneAzucar = tieneAzucar;
    }

    public Postres(String nombre, double precio, boolean tieneAzucar) {
        super(nombre, precio);
        this.tieneAzucar = tieneAzucar;
    }

    @Override
    public String toString() {
        return super.toString() + " es un postre, y " + (tieneAzucar ? " tiene azúcar" : " no tiene azúcar");
    }
}
