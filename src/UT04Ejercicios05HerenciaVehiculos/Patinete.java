package UT04Ejercicios05HerenciaVehiculos;

public class Patinete extends SinMotor {

    int ruedas;

    public Patinete(String color, String modelo, double precio, String marca, String material, int ruedas) {
        super(color, modelo, precio, marca, material);
        this.ruedas = ruedas;
    }


}
