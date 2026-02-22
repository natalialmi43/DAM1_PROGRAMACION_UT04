package UT04Ejercicios10RepasoEjerciciosCortos.E01SistemaDeEmpleados;

public class Empleado {

    private String nombre;
    private double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        setNombre(nombre);
        setSueldoBase(sueldoBase);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            this.nombre = "Por defecto";
        } else {
            this.nombre = nombre;
        }
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        if(sueldoBase < 0){
            this.sueldoBase = 1500;
        } else {
            this.sueldoBase = sueldoBase;
        }

    }

    public double calcularSueldo(){
        return sueldoBase;
    }
}
