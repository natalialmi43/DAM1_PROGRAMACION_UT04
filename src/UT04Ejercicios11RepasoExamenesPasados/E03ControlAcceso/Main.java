package UT04Ejercicios11RepasoExamenesPasados.E03ControlAcceso;

public class Main {

    public static void main(String[] args) {

        Concierto c1 = new Concierto("Rock Fest", 100, true);
        Feria f1 = new Feria("Feria Local", 50, true);


        f1.agregarAsistente();
        f1.agregarAsistente();
        f1.agregarAsistente();

        c1.agregarAsistente();
        c1.agregarAsistente();
        c1.agregarAsistente();

        c1.calcularPrecio();


    }
}
