package UT04Ejercicios07SistemaGestionInventarios;

public enum Color {

    BLANCO ("blanco"),
    NEGRO ("negro"),
    ROJO ("rojo"),
    AZUL ("azul"),
    GRIS ("gris");

    private String escritoBonito;

    Color(String escritoBonito) {
        this.escritoBonito = escritoBonito;
    }

    @Override
    public String toString() {
        return escritoBonito;
    }
}
