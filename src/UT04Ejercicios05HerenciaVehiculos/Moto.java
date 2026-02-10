package UT04Ejercicios05HerenciaVehiculos;

public class Moto extends ConMotor {

    String tipo;

    public Moto(String color, String modelo, double precio, String marca, int cilindrada, String combustible, String tipo) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.tipo = tipo;
    }

}
