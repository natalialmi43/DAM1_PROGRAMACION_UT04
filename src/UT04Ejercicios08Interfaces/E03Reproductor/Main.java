package UT04Ejercicios08Interfaces.E03Reproductor;

public class Main {
    public static void main(String[] args) {


        Reproducible [] reproducibles = new Reproducible [2];

        reproducibles[0] = new Audio();
        reproducibles[1] = new Video();

        for (int i = 0; i < reproducibles.length; i++) {
            reproducibles[i].reproducir();
        }

    }
}
