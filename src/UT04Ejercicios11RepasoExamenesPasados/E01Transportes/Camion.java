package UT04Ejercicios11RepasoExamenesPasados.E01Transportes;

public class Camion extends Vehiculo {

    private double cargaActual;
    private double capacidad;
    private final double CAPACIDAD_MAXIMA = 5000;

    public Camion(String matricula, double kmRecorridos, double combustibleRestante, double cargaActual, double capacidad) {
        super(matricula, kmRecorridos, combustibleRestante);
        setCargaActual(cargaActual);
        setCapacidad(capacidad);
    }

    public void setCargaActual(double cargaActual) {
        if (cargaActual < 0){
            this.cargaActual = 0;
        } else {
            this.cargaActual = cargaActual;
        }
    }

    public void setCapacidad(double capacidad) {
        if (capacidad < 0){
            this.capacidad = capacidad;
        } else if (capacidad > CAPACIDAD_MAXIMA) {
            this.capacidad = CAPACIDAD_MAXIMA;
        } else {
            this.capacidad = capacidad;
        }
    }

    @Override
    protected double consumo(double distancia) {

        double gasta = (0.1 + (0.01 * (cargaActual/1000)) * distancia);
        return gasta;
    }

    @Override
    public String toString() {
        return super.toString() + "es un camión con " + cargaActual + " kg de carga actual";
    }
}
