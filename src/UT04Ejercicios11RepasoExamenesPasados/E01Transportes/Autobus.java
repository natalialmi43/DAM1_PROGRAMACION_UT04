package UT04Ejercicios11RepasoExamenesPasados.E01Transportes;

public class Autobus extends Vehiculo {

    private int pasajerosActuales;
    private int capacidad;
    private final int CAPACIDAD_MAXIMA = 50;

    public Autobus(String matricula, double kmRecorridos, double combustibleRestante, int pasajerosActuales, int capacidad) {
        super(matricula, kmRecorridos, combustibleRestante);
        setPasajerosActuales(pasajerosActuales);
        setCapacidad(capacidad);
    }

    public void setPasajerosActuales(int pasajerosActuales) {
        if (pasajerosActuales < 0){
            this.pasajerosActuales = 0;
        } else {
            this.pasajerosActuales = pasajerosActuales;
        }
    }

    public void setCapacidad(int capacidad) {
        if (capacidad < 0 || capacidad > CAPACIDAD_MAXIMA){
            this.capacidad = CAPACIDAD_MAXIMA;
        } else {
            this.capacidad = capacidad;
        }
    }

    @Override
    protected double consumo(double distancia) {
        return (0.8 + (0.005 * pasajerosActuales)) * distancia;
    }

    @Override
    public String toString() {
        return super.toString() + " es un autobus con " + pasajerosActuales + " pasajeros ";
    }
}
