package herenciaRestaurante;

public class Carnes  extends Platos {

    private GradoCoccion puntoCarne;

    public GradoCoccion getPuntoCarne() {
        return puntoCarne;
    }

    public void setPuntoCarne(GradoCoccion puntoCarne) {
        if (puntoCarne == null){
            this.puntoCarne = GradoCoccion.AL_PUNTO;
        } else {
            this.puntoCarne = puntoCarne;

        }
    }

    public Carnes(String nombre, double precio, GradoCoccion puntoCarne) {
        super(nombre, precio);
        setPuntoCarne(puntoCarne);

    }

    @Override
    public String toString() {

        return super.toString() +  " debe estar " + puntoCarne;
    }
}
