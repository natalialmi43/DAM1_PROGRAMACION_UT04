package UT04Ejercicios05HerenciaVehiculos;

public class Coche extends ConMotor {

    int numeroPuertas;

    public Coche(String color, String modelo, double precio, String marca, int cilindrada, String combustible, int numeroPuertas) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.numeroPuertas = numeroPuertas;
    }

}
