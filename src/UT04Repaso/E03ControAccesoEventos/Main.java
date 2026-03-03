package UT04Repaso.E03ControAccesoEventos;

public class Main {
    public static void main(String[] args) {


        Concierto c1 = new Concierto("RF", 100, true);

        Feria f1 = new Feria("FL", 50, true);

        c1.agregarAsistente();
        c1.agregarAsistente();
        c1.agregarAsistente();


        f1.agregarAsistente();
        f1.agregarAsistente();
        f1.agregarAsistente();


    }
}
