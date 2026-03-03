package UT04Examen.E02Reservas;

public class Main {
    public static void main(String[] args) {

        Sesion s = new Sesion("Hola", 250, "genero", 40, -8);

        System.out.println(s.toString());

        try {
            s.reservarEntrada(55);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        System.out.println(s.toString());

    }
}
