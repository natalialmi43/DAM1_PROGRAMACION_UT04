package UT04Ejercicios10Repaso.E01SistemaDeEmpleados;

public class Gerente extends Empleado {

    private double bono;


    public Gerente(String nombre, double sueldoBase, double bono) {
        super(nombre, sueldoBase);
        setBono(bono);
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        if (bono < 0){
            this.bono = 10;
        } else {
            this.bono = bono;
        }
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + bono;
    }
}
