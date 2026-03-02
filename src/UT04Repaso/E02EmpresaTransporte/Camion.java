package UT04Repaso.E02EmpresaTransporte;

public class Camion extends Vehiculo {

    private double cargaActual;
    private double capacidad;
    private final double CAPACIDAD_MAXIMA = 5000;

    public Camion(double cargaActual, double capacidad) {
        super("Default", 45,100);
        this.cargaActual = cargaActual;
        this.capacidad = capacidad;
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
            this.capacidad = 0;
        } else if (capacidad > CAPACIDAD_MAXIMA) {
            this.capacidad = CAPACIDAD_MAXIMA;
        } else {
            this.capacidad = capacidad;
        }
    }

    @Override
    public double consumo(double km) {
        double consumoKm = (cargaActual/1000 *0.01) + 0.1;
        return consumoKm * km;
    }
}
