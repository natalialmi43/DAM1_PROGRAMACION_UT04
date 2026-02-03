package UT04Clase02FigurasCorregido;

public class Figura {
    String color;
    public Figura(String color) {
        this.color = color;
    }
    public Figura() {
        this("negro");
    }

    public String toString() {
        return "Figura abstracta " + color;
    }

    public String perimetro() {
        return "no hemos calculado el perimetro";
    }
}
