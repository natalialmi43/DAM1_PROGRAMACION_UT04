package UT04Ejercicios10Repaso.E04GestionElectroAvila;

public class Television extends Electrodomestico {

    private double tasa;

    public Television(String nombre, double precio, double tasa) {
        super(nombre, precio);
        this.tasa = tasa;
    }

    @Override
    public double precioFinal() {
        return super.precioFinal() + tasa;
    }

}
