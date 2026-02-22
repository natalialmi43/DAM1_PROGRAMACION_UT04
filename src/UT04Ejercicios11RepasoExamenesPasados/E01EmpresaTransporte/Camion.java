package UT04Ejercicios11RepasoExamenesPasados.E01EmpresaTransporte;

public class Camion extends Vehiculo {

    private double cargaActual;
    private final int CAPACIDAD_MAXIMA = 5000;

    public Camion(String matricula, double kmRecorridos, double combustibleRestante, double cargaActual) {
        super(matricula, kmRecorridos, combustibleRestante);
        setCargaActual(cargaActual);
    }

    public void setCargaActual(double cargaActual) {
        if (cargaActual > CAPACIDAD_MAXIMA){
            this.cargaActual = CAPACIDAD_MAXIMA;
        } else if (cargaActual < 0){
            this.cargaActual = 0;
        } else {
            this.cargaActual = cargaActual;
        }
    }


    @Override
    protected double calcularConsumo(double distancia) {

        double gastoPorKm = 0.1 + ((this.cargaActual / 1000.0) * 0.01);
        return gastoPorKm * distancia;
    }
}
