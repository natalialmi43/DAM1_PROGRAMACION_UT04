package UT04Ejercicios07SistemaGestionInventarios;

public abstract class Electrodomestico {
    private double precioBase;
    private Color color;
    private char consumoEnergetico;
    private double pesoEnKg;


    public Electrodomestico(double precioBase,double pesoEnKg) {
        setPrecioBase(precioBase);
        setColor(Color.BLANCO);
        setConsumoEnergetico('F');
        setPesoEnKg(pesoEnKg);
    }

    public Electrodomestico(double precioBase, Color color, char consumoEnergetico, double pesoEnKg) {
        setPrecioBase(precioBase);
        setColor(color);
        setConsumoEnergetico(consumoEnergetico);
        setPesoEnKg(pesoEnKg);
    }


    public void setPrecioBase(double precioBase) {
        if (precioBase < 0){
            this.precioBase = 0;
        } else {
            this.precioBase = precioBase;
        }
    }

    private void setColor(Color color) {
        if (color == null){
            this.color = Color.BLANCO;
        } else {
            this.color = color;
        }
    }

    private void setConsumoEnergetico(char consumoEnergetico) {

        char letraMayuscula = Character.toUpperCase(consumoEnergetico);

        if (letraMayuscula != 'A' && letraMayuscula != 'B'&& letraMayuscula != 'C' && letraMayuscula != 'D'&& letraMayuscula != 'E') {
            this.consumoEnergetico = 'F';
        } else {
            this.consumoEnergetico = letraMayuscula;
        }
    }

    private void setPesoEnKg(double pesoEnKg) {
        if (pesoEnKg < 0){
            this.pesoEnKg = 0;
        } else {
            this.pesoEnKg = pesoEnKg;
        }
    }

    public double calcularPrecioFinal() {

        double precioFinal = precioBase;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 10;
                break;
            case 'B':
                precioFinal += 30;
                break;
            case 'C':
                precioFinal += 50;
                break;
            case 'D':
                precioFinal += 70;
                break;
            case 'E':
                precioFinal += 90;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (pesoEnKg >= 0 && pesoEnKg < 20) {
            precioFinal += 10;
        } else if (pesoEnKg >= 20 && pesoEnKg < 50) {
            precioFinal += 50;
        } else if (pesoEnKg >= 50) {
            precioFinal += 80;
        }

        return precioFinal;
    }

}
