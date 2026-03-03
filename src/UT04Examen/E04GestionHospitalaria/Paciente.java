package UT04Examen.E04GestionHospitalaria;

public class Paciente {
     private String historialClinico;
     private int edad;
     private boolean estaIngresado;
     private static int camasOcupadas = 0;

    public Paciente(String historialClinico, int edad) {
        setHistorialClinico(historialClinico);
        setEdad(edad);
        this.estaIngresado = false;
    }

    public void setHistorialClinico(String historialClinico) {
        if (historialClinico == null || historialClinico.isEmpty()){
            this.historialClinico = "historialClinico";
        } else {
            this.historialClinico = historialClinico;
        }

    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 120 ){
            this.edad = 50;
        } else {
            this.edad = edad;
        }
    }

    public void ingresar (){
        estaIngresado = true;
        camasOcupadas ++;
    }

    public void darAlta (){
        estaIngresado = false;
        camasOcupadas --;
    }
}
