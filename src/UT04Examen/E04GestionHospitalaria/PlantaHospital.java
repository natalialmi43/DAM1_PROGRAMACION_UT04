package UT04Examen.E04GestionHospitalaria;

public class PlantaHospital {

    private int numeroPlanta;
    private Paciente [] pacientes;
    private int contadorPacientes;
    private final int MAXIMO_PACIENTES = 5;

    public PlantaHospital(int numeroPlanta) {
        this.numeroPlanta = numeroPlanta;
        this.pacientes = new Paciente[MAXIMO_PACIENTES];
    }


    public void ingresarPaciente (Paciente p){
        if (contadorPacientes >= MAXIMO_PACIENTES){
            System.out.println("No hay camas disponibles");
        } else {
            pacientes [contadorPacientes] = p;
            contadorPacientes ++;
        }
    }

    public void auditoriaCamas(){

        for (int i = 0; i < contadorPacientes; i++) {
            if (pacientes [i] == null){
                System.out.println("Cama libre encontrada en planta " + numeroPlanta);
            }

        }

    }
}
