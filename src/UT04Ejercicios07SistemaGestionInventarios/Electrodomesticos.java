package UT04Ejercicios07SistemaGestionInventarios;

public abstract class Electrodomesticos {
    private double precioBase;
    private Colores colorGama;
    private char consumoEnergetico;
    private double peso;

    public Electrodomesticos(double precioBase, Colores colorGama, char consumoEnergetico, double peso) {
        setPrecioBase (precioBase);
        setColorGama(colorGama);
        setConsumoEnergetico(consumoEnergetico);
        setPeso(peso);

    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 0){
            this.precioBase = 0.00;
        } else {
            this.precioBase = precioBase;
        }

    }

    public Colores getColorGama() {
        return colorGama;
    }

    public void setColorGama(Colores colorGama) {
        if (colorGama == null){
            this.colorGama = Colores.BLANCO;
        } else {
            this.colorGama = colorGama;
        }
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico == 'A' || consumoEnergetico == 'B' || consumoEnergetico == 'C' || consumoEnergetico == 'D' || consumoEnergetico == 'F'){
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = 'F';
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0){
            this.peso = 0;
        } else {
            this.peso = peso;
        }
    }


    public String toString (){
        return " es de color " + colorGama + " y tiene un consumo energetico de categoria " + consumoEnergetico + " pesa  " + peso + " y su precio baso  " + precioBase;
    }

}
