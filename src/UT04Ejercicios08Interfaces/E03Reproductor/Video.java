package UT04Ejercicios08Interfaces.E03Reproductor;

public class Video implements Reproducible{

    @Override
    public void reproducir() {
        System.out.println("Proyectando película en 4k...");
    }

    @Override
    public void pausar() {

    }

    @Override
    public void parar() {

    }
}
