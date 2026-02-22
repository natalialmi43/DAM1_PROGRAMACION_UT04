package UT04Ejercicios11RepasoExamenesPasados.E02SistemaReserva;

public class Sesion {

    private Pelicula pelicula;
    private double horaInicio;
    private int entradasDisponibles;

    public Sesion(Pelicula pelicula, double horaInicio, int entradasDisponibles) {
        this.pelicula = pelicula;
        setHoraInicio(horaInicio);
        setEntradasDisponibles(entradasDisponibles);
    }


    public void setHoraInicio(double horaInicio) {
        if (horaInicio < 0 || horaInicio > 23.59){
            this.horaInicio = 17.00;
        } else {
            this.horaInicio = horaInicio;
        }
    }

    public void setEntradasDisponibles(int entradasDisponibles) {
        if (entradasDisponibles < 0 ){
            this.entradasDisponibles = 0;
        } else {
            this.entradasDisponibles = entradasDisponibles;
        }
    }

    public void reservarEntradas (int entradas) throws IllegalArgumentException {

        if (entradasDisponibles > entradas){
            entradasDisponibles -= entradas;
            System.out.println("Puede comprar " + entradas + " quedan disponibles " + entradasDisponibles + " entradas" );
        } else {

            throw new IllegalArgumentException("Error: no puede comprar "+ entradas + " solo quedan " + entradasDisponibles + " disponibles");
        }

        System.out.println("Vuelva pronto :)");

    }

    @Override
    public String toString() {
        return pelicula + " se reproducira a a las " + horaInicio + " y quedan " + entradasDisponibles + " entradas disponibles.\n";
    }
}
