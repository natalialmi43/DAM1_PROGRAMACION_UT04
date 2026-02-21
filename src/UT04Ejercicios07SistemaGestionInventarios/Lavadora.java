package UT04Ejercicios07SistemaGestionInventarios;

public class Lavadora extends Electrodomestico {

    private double cargaEnKg;

    public Lavadora(double precioBase, double pesoEnKg, double cargaEnKg) {
        super(precioBase, pesoEnKg);
        setCargaEnKg(cargaEnKg);
    }

    public Lavadora(double precioBase, Color color, char consumoEnergetico, double pesoEnKg, double cargaEnKg) {
        super(precioBase, color, consumoEnergetico, pesoEnKg);
        setCargaEnKg(cargaEnKg);
    }


    private void setCargaEnKg(double cargaEnKg) {
        if (cargaEnKg < 0){
            this.cargaEnKg = 0;
        } else {
            this.cargaEnKg = cargaEnKg;
        }
    }


    @Override
    public double calcularPrecioFinal() {

        double precioFinal = super.calcularPrecioFinal();

        if (cargaEnKg > 30){
            precioFinal *= 1.10;
        }

        return precioFinal;
    }


}
