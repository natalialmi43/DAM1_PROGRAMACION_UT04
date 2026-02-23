package UT04Clase05Excepciones.E03UsoFinally;

public class PruebaScanner {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        int n = sc.nextInt();

        if (n<0){
            throw new IllegalArgumentException("No puede ser menor a 0");
        }

    }


}
