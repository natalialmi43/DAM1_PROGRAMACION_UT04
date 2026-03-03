package UT04Examen.E04GestionHospitalaria;

public class Medico extends PersonalMedico implements Atendible {

    private String especialidad;

    public Medico(String nombre, double sueldoBase, String especialidad) {
        super(nombre, sueldoBase);
        setEspecialidad(especialidad);
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.isEmpty()){
            this.especialidad = especialidad;
        } else {
            this.especialidad = especialidad;
        }
    }

    @Override
    public void atender(Paciente p) throws RecursosAgotados {

        System.out.println("Atendiendo al paciente");

        if (especialidad.equals("Ninguna")){
            throw new RecursosAgotados("Error");
        }
    }

    @Override
    protected double calcularNominas() {
        return getSueldoBase() + 1000;
    }

    @Override
    public String toString() {
        return super.toString() + "su especialidad es " + especialidad;
    }
}
