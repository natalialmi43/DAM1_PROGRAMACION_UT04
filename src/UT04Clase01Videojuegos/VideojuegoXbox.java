package UT04Clase01Videojuegos;

public class VideojuegoXbox {

    boolean necesitaGamepass;

    public VideojuegoXbox(String nombre, double precio, boolean necesitaGamepass) {
        super(nombre, precio);
        this.necesitaGamepass = necesitaGamepass;
    }

    public String toString() {
        return super.toString() + (necesitaGamepass ? " y necesita gamepass" : "y no necesita gamepass");
    }
}
