package UT04Ejercicios08Interfaces.E02RPG;

public class Guerrero implements Atacante {

    @Override
    public void atacar() {
        System.out.println("El Guerrero da un tajo con su espada.");
    }
}
