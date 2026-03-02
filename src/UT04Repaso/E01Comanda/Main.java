package UT04Repaso.E01Comanda;

public class Main {

    public static void main(String[] args) {

        Primeros primero = new Primeros("primero", 10, true);
        Carne carne = new Carne("carne", 20, GradoCoccion.POCO_HECHO);
        Pescado pescado = new Pescado("pesca", 15);
        Postre postre = new Postre("postre", 5, false);

        Comanda comanda = new Comanda(3,2);

        comanda.addPlato(primero);
        comanda.addPlato(carne);
        comanda.addPlato(pescado);
        comanda.addPlato(postre);

        comanda.printComanda();
    }

}
