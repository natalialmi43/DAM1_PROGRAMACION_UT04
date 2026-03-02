package UT04Repaso.E01Comanda;

public enum GradoCoccion {

    POCO_HECHO ("poco hecho"),
    AL_PUNTO ("al punto"),
    MUY_HECHO ("muy hecho ");

    private String nombreBonito;

    GradoCoccion(String nombreBonito) {
        this.nombreBonito = nombreBonito;
    }


    @Override
    public String toString() {
        return nombreBonito;
    }
}
