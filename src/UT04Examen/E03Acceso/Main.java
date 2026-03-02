package UT04Examen.E03Acceso;

public class Main {

    public static void main(String[] args) {

        Concierto c = new Concierto("Rock Fest ", 100, true);

        Feria f = new Feria("Feria Local", 50, true);

        System.out.println(c.toString());
        System.out.println(f.toString());

        c.agregarAsitente(1);
        c.agregarAsitente(1);
        c.agregarAsitente(1);
        f.agregarAsitente(1);
        f.agregarAsitente(1);
        f.agregarAsitente(1);

        System.out.println(c.toString());
        System.out.println(f.toString());

        c.agregarAsitente(500);


    }
}
