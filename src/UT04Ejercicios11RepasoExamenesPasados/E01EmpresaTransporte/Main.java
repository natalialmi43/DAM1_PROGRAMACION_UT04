package UT04Ejercicios11RepasoExamenesPasados.E01EmpresaTransporte;

public class Main {
    public static void main(String[] args) {


        Camion c1 = new Camion("Z000X", 45,15,2000);

        Autobus a1 = new Autobus("X000Z", 100, 15,20);

        Burro b1 = new Burro("Paco", 100, 50);

        try {
            c1.viajar(35);

        } catch (IllegalArgumentException e){
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("Se ha finalizado la operacion\n");
        }

        try {
            a1.viajar(35);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se ha finalizado la operacion\n");
        }

        try {
            b1.viajar(35);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se ha finalizado la operacion\n");
        }

    }
}
