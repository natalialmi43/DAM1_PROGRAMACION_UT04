package UT04Ejercicios08Interfaces.E04FeedRRSS;

public class Main {
    public static void main(String[] args) {

        Publicacion [] p1 = new Publicacion [4];

        p1 [0] = new Texto("Hola");
        p1 [1] = new Foto("100x100");
        p1 [2] = new Texto("Adios");
        p1 [3] = new Foto("200x100");

        for (Publicacion p : p1){
            p.verLikes();
            p.mostrar();
        }
    }
}
