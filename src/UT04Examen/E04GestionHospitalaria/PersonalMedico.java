package UT04Examen.E04GestionHospitalaria;

public class PersonalMedico {

    private String nombre;
    private double sueldoBase;


    public PersonalMedico(String nombre, double sueldoBase) {
        setNombre(nombre);
        setSueldoBase(sueldoBase);
    }

    public void setNombre(String nombre) {
        if(nombre == null || nombre.isEmpty()){
            this.nombre = "nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public double getSueldoBase (){
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        if (sueldoBase < 1300 || sueldoBase > 3500){
            this.sueldoBase = 1700;
        } else {
            this.sueldoBase = sueldoBase;
        }
    }

    protected abstract double calcularNominas();

    public String toString (){
        return nombre + " tiene un sueldo base de " + sueldoBase;
    }
}
