package UT04Ejercicios08Interfaces.E04FeedRRSS;

import java.util.Random;

public class Texto implements Publicacion {

    String contenido;

    public Texto (String contenido){
        if (contenido == null || contenido.isEmpty()){
            this.contenido = "Por defecto.txt";
        } else {
            this.contenido = contenido;
        }
    }

    @Override
    public void mostrar() {
        System.out.println(contenido);
    }

    @Override
    public int verLikes() {
        return (int) (Math.random() * 500);
    }
}
