package UT04Ejercicios07SistemaGestionInventarios;

public class Lavadoras extends Electrodomesticos {

    private double capacidadCargaEnKg;


    public Lavadoras(double precioBase, Colores colorGama, char consumoEnergetico, double peso, double capacidadCargaEnKg) {
        super(precioBase, colorGama, consumoEnergetico, peso);
        this.capacidadCargaEnKg = capacidadCargaEnKg;
    }

    public double getCapacidadCargaEnKg() {
        return capacidadCargaEnKg;
    }

    public void setCapacidadCargaEnKg(double capacidadCargaEnKg) {
        if (capacidadCargaEnKg < 0) {
            this.capacidadCargaEnKg = 0;
        } else if (capacidadCargaEnKg > 30) {

        } else {
            this.capacidadCargaEnKg = capacidadCargaEnKg;
        }
    }

    @Override
    public String toString() {
        return "la lavadora tiene una capacidad de carga de" + capacidadCargaEnKg + super.toString() ;
    }


    public double precioFinal (Electrodomesticos electrodomesticos) {

        double precioSuplemeto = electrodomesticos.getPrecioBase() * 1.30;

        if (capacidadCargaEnKg > 30 ){
            return precioSuplemeto;
        } else {
            return electrodomesticos.getPrecioBase();
        }
    }
}
