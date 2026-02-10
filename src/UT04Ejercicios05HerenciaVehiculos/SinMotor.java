package UT04Ejercicios05HerenciaVehiculos;

public class SinMotor extends Vehiculo {

    String material;

    public SinMotor(String color, String modelo, double precio, String marca, String material) {
        super(color, modelo, precio, marca);
        this.material = material;
    }

}
