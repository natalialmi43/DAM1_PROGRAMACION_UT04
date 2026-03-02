package UT04Ejercicios11RepasoExamenesPasados.E01Transportes;

public class Main {

    public static void main(String[] args) throws SinCombustible {


        Camion c = new Camion("1111", 1500, 45, 2000, 2000);

        Autobus a = new Autobus("222", 45000, 45, 45, 60);

        Burro b = new Burro("333", 50, 45);

        System.out.println(c);

        System.out.println(a);

        System.out.println(b);


        try {
            c.viajar(35);
        } catch (SinCombustible e) {
            throw new SinCombustible("Error: " + e.getMessage());
        }
        System.out.println(c.toString());

        try {
            a.viajar(35);
        } catch (SinCombustible e) {
            throw new SinCombustible("Error: " + e.getMessage());
        }
        System.out.println(a.toString());


        try {
            b.viajar(3);
        } catch (SinCombustible e) {
            throw new SinCombustible("Error: " + e.getMessage());
        }
        System.out.println(b.toString());


    }
}
