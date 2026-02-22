package UT04Ejercicios11RepasoExamenesPasados.E01EmpresaTransporte;

public class Autobus extends Vehiculo {

    private int  pasajerosActuales;
    private final int CAPACIDAD_MAXIMA = 50;

    public Autobus(String matricula, double kmRecorridos, double combustibleRestante, int pasajerosActuales) {
        super(matricula, kmRecorridos, combustibleRestante);
        setPasajerosActuales(pasajerosActuales);

    }

    public void setPasajerosActuales(int pasajerosActuales) {
        if (pasajerosActuales < 0){
            this.pasajerosActuales = 0;
        } else if ( pasajerosActuales > CAPACIDAD_MAXIMA) {
            this.pasajerosActuales = CAPACIDAD_MAXIMA;
        } else {
            this.pasajerosActuales = pasajerosActuales;
        }
    }

    @Override
    protected double calcularConsumo(double distancia) {

        double gasto = 0.08 + (pasajerosActuales * 0.005);

        return distancia * gasto;
    }
}
