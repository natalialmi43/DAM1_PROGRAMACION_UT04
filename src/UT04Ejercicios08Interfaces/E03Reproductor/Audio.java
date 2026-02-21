package UT04Ejercicios08Interfaces.E03Reproductor;

public class Audio implements  Reproducible {

    @Override
    public void reproducir() {
        System.out.println("Sonando canción...");
    }

    @Override
    public void pausar() {

    }

    @Override
    public void parar() {

    }
}
