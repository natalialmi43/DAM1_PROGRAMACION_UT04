package UT04Ejercicios11RepasoExamenesPasados.E02SistemaReserva;

public class Pelicula {

    private String titulo;
    private double duracion;
    private String genero;

    public Pelicula(String titulo, double duracion, String genero) {
        setTitulo(titulo);
        setDuracion(duracion);
        setGenero(genero);
    }


    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()){
            this.titulo = "Default";
        } else {
            this.titulo = titulo;
        }
    }

    public void setDuracion(double duracion) {
        if (duracion < 0){
            this.duracion = 0;
        } else {
            this.duracion = duracion;
        }
    }

    public void setGenero(String genero) {
        if (genero == null || genero.isEmpty()){
            this.genero = "Default";
        } else {
            this.genero = genero;
        }
    }

    @Override
    public String toString() {
        return "La pelicula " + titulo + " dura " + duracion + " minutos y es de genero " + genero;
    }
}
