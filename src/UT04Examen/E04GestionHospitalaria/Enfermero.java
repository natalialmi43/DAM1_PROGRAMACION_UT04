package UT04Examen.E04GestionHospitalaria;

public class Enfermero extends PersonalMedico implements Atendible{

    private int turnosExtra;

    public Enfermero(String nombre, double sueldoBase, int turnosExtra) {
        super(nombre, sueldoBase);
        setTurnosExtra(turnosExtra);
    }

    public void setTurnosExtra(int turnosExtra) {
        if(turnosExtra < 0){
            this.turnosExtra = 1;
        } else {
            this.turnosExtra = turnosExtra;
        }
    }

    @Override
    public void atender(Paciente p) throws RecursosAgotados {
        System.out.println("Tomando constantes");
    }

    @Override
    protected double calcularNominas() {
        return getSueldoBase() + (turnosExtra * 50);
    }

    @Override
    public String toString() {
        return super.toString() + " ha hecho " + turnosExtra + " turnos extra";
    }
}
