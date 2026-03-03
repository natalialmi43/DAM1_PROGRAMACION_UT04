package UT04Ejercicios08Interfaces.E02RPG;

public class Clerigo implements Curar {

    @Override
    public void curar() {
        System.out.println("El Clérigo lanza un hechizo de sanación.");
    }
}
