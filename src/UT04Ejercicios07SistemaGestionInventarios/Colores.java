package UT04Ejercicios07SistemaGestionInventarios;

public enum Colores {

    BLANCO ("blanco"),
    NEGRO ("negro"),
    ROJO ("rojo"),
    AZUL ("azul"),
    GRIS ("girs");

    String nombreBonito;

    Colores (String nombreBonito) {
        nombreBonito = this.nombreBonito;
    }

    public String toString (){
        return nombreBonito;
    }

}
