package UT04Repaso.E01Comanda;

public class Carne extends Plato {


    private GradoCoccion gradoCoccion;

    public Carne(String nombre, double precio, GradoCoccion gradoCoccion) {
        super(nombre, precio);
        this.gradoCoccion = gradoCoccion;
    }

    public void setGradoCoccion(GradoCoccion gradoCoccion) {
        if (gradoCoccion == null ){
            this.gradoCoccion = GradoCoccion.AL_PUNTO;
        }else {
            this.gradoCoccion = gradoCoccion;
        }
    }
}
