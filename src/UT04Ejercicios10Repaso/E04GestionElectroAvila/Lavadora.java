package UT04Ejercicios10Repaso.E04GestionElectroAvila;

public class Lavadora extends Electrodomestico{

    private double recarga;

    public Lavadora(String nombre, double precio, double recarga) {
        super(nombre, precio);
        this.recarga = recarga;
    }

    @Override
    public double precioFinal() {
        return super.precioFinal() + recarga;
    }

    public void saludar (){
        System.out.println("hola");
    }
}
