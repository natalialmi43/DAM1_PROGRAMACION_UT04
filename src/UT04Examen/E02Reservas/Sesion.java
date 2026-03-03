package UT04Examen.E02Reservas;

public class Sesion extends Pelicula {

    private double horaInicio;
    private int entradasDisponibles;


    public Sesion(String titulo, int duracionMinutos, String genero, double horaInicio, int entradasDisponibles) {
        super(titulo, duracionMinutos, genero);
        setHoraInicio(horaInicio);
        setEntradasDisponibles(entradasDisponibles);
    }

    public void setHoraInicio(double horaInicio) {
        if(horaInicio < 0 || horaInicio > 24){
            this.horaInicio = 17.15;
        } else {
            this.horaInicio = horaInicio;
        }
    }

    public void setEntradasDisponibles(int entradasDisponibles) {
        if (entradasDisponibles < 0){
            this.entradasDisponibles = 50;
        } else {
            this.entradasDisponibles = entradasDisponibles;
        }
    }

    public void reservarEntrada (int entradasDemandadas){
        if (entradasDemandadas > entradasDisponibles){
            throw new IllegalStateException("Error: no hay tantas entradas dispoibles, quedan " + entradasDisponibles);
        }
        entradasDisponibles -= entradasDemandadas;
    }

    @Override
    public String toString() {
        return super.toString() + " empieza a las " + horaInicio + " y tiene " + entradasDisponibles + " entradas disponibles";
    }
}
