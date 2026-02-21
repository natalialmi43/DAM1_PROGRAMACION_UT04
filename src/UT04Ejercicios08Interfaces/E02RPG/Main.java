package UT04Ejercicios08Interfaces.E02RPG;

public class Main {

    // Este método es el filtro. Solo acepta objetos que hayan firmado 'Atacante'
    public static void realizarAccionHeroica(Atacante a) {
        a.atacar();
    }

    public static void main(String[] args) {

        // 1. Creamos a nuestros tres personajes
        Guerrero miGuerrero = new Guerrero();
        Paladin miPaladin = new Paladin();
        Clerigo miClerigo = new Clerigo();

        System.out.println("--- TURNO DE COMBATE ---");

        // 2. Mandamos al guerrero. Como es Atacante, el método lo acepta.
        realizarAccionHeroica(miGuerrero);

        // 3. Mandamos al paladín. Aunque también es Curador, el método
        realizarAccionHeroica(miPaladin);

        // Si intentaras hacer esto: realizarAccionHeroica(miClerigo);
        // El programa daría un error en rojo porque el Clérigo no es Atacante.
    }

}
