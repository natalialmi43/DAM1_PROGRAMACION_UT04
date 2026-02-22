package UT04Ejercicios11RepasoExamenesPasados.E02SistemaReserva;

public class Main {

    public static void main(String[] args) {

        Pelicula p1 = new Pelicula("AAA", 45, "romance");

        Sesion s1 = new Sesion(p1, 26, 4);

        System.out.println(s1.toString());

        try {
            s1.reservarEntradas(40);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Gracias");
        }


    }
}
