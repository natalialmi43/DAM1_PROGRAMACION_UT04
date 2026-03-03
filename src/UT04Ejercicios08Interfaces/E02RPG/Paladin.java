package UT04Ejercicios08Interfaces.E02RPG;

public class Paladin implements Atacante, Curar {

    @Override
    public void atacar() {
        System.out.println("El Paladín golpea con su martillo sagrado.");
    }

    @Override
    public void curar() {
        System.out.println("El Paladín usa imposición de manos para curar heridas.");
    }
}
