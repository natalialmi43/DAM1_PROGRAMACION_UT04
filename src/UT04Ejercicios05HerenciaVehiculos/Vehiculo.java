package UT04Ejercicios05HerenciaVehiculos;

public class Vehiculo {

    String color;
    String modelo;
    double precio;
    String marca;

    public Vehiculo(String color, String modelo, double precio, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
    }

    public Vehiculo() {
        this.color = "indefinido";
        this.modelo = "indefinido";
        this.precio = 0;
        this.marca = "indefinido";
    }

    public String toString (){
        return "El vehiculo es de color " + this.color + " ....";
    }


}
