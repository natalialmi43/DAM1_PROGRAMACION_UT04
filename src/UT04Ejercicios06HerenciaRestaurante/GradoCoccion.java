package herenciaRestaurante;

public enum GradoCoccion {

    POCO_HECHO ("poco hecho"),
    AL_PUNTO ("al punto"),
    MUY_HECHO ("muy hecho"),
    CARBONIZADO ("carbonizado");

    private String nombreBonito;

    GradoCoccion(String nombreBonito) {
        this.nombreBonito = nombreBonito;
    }

    @Override
    public String toString() {
        return nombreBonito;
    }
}
