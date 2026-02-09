package UT04Ejercicios06HerenciaRestaurante;

public class Carnes  extends herenciaRestaurante.Platos {

    private herenciaRestaurante.GradoCoccion puntoCarne;

    public herenciaRestaurante.GradoCoccion getPuntoCarne() {
        return puntoCarne;
    }

    public void setPuntoCarne(herenciaRestaurante.GradoCoccion puntoCarne) {
        if (puntoCarne == null){
            this.puntoCarne = herenciaRestaurante.GradoCoccion.AL_PUNTO;
        } else {
            this.puntoCarne = puntoCarne;

        }
    }

    public Carnes(String nombre, double precio, herenciaRestaurante.GradoCoccion puntoCarne) {
        super(nombre, precio);
        setPuntoCarne(puntoCarne);

    }

    @Override
    public String toString() {

        return super.toString() +  " debe estar " + puntoCarne;
    }
}
