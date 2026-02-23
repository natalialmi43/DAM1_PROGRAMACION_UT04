package UT04Repaso.E01GEstionEnvios;

public class Main {

    public static void main(String[] args) {

        PaqueteEstandar p1 = new PaqueteEstandar("4562", 100,5);

        PaqueteValioso p2 = new PaqueteValioso("45632", 200,1000);

        System.out.println(p1.calcularCosteEnvio());

        System.out.println(p2.calcularCosteEnvio());

        System.out.println(p2.calcularSeguro());

    }
}
