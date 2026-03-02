package UT04Examen.E02Reservas;

public class Pelicula {
         private String titulo;
         private int duracionMinutos;
         private String genero;


    public Pelicula(String titulo, int duracionMinutos, String genero) {
        setTitulo(titulo);
        setDuracionMinutos(duracionMinutos);
        setGenero(genero);
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()){
            this.titulo = "defecto";
        } else {
            this.titulo = titulo;
        }
    }

    public void setDuracionMinutos(int duracionMinutos) {
        if (duracionMinutos < 0 || duracionMinutos > 200){
            this.duracionMinutos = 120;
        } else {
            this.duracionMinutos = duracionMinutos;
        }
    }

    public void setGenero(String genero) {
        if (genero == null || genero.isEmpty()){
            this.genero = "genero";
        } else {
            this.genero = genero;
        }
    }

    public String toString (){
        return "La pelicula " + titulo + " tiene una duración de " + duracionMinutos + " es de genero "+ genero;
    }


}

