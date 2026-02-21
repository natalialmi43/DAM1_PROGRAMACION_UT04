package UT04Ejercicios07SistemaGestionInventarios;

public class Television extends Electrodomestico {

    private int tamanioPulgadas;
    private boolean sintonizadorTDT;
    private boolean OLED;


    public Television(double precioBase, double pesoEnKg, int tamanioPulgadas, boolean sintonizadorTDT, boolean OLED) {
        super(precioBase, pesoEnKg);
        setTamanioPulgadas(tamanioPulgadas);
        this.sintonizadorTDT = sintonizadorTDT;
        this.OLED = OLED;
    }

    public Television(double precioBase, Color color, char consumoEnergetico, double pesoEnKg, int tamanioPulgadas, boolean sintonizadorTDT, boolean OLED) {
        super(precioBase, color, consumoEnergetico, pesoEnKg);
        setTamanioPulgadas(tamanioPulgadas);
        this.sintonizadorTDT = sintonizadorTDT;
        this.OLED = OLED;
    }


    private void setTamanioPulgadas(int tamanioPulgadas) {
        if (tamanioPulgadas < 0){
            this.tamanioPulgadas = 0;
        } else {
            this.tamanioPulgadas = tamanioPulgadas;
        }
    }



    @Override
    public double calcularPrecioFinal() {

        double precioFinal = super.calcularPrecioFinal();

        if (tamanioPulgadas >= 60){
            precioFinal *= 1.30;
        }

        if (OLED){
            precioFinal += 250;
        }

        return precioFinal;
    }

}
