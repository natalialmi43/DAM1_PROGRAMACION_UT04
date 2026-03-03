package UT04Ejercicios08Interfaces.E04FeedRRSS;

public class Foto implements Publicacion {

    String resolucion;

    public Foto (String resolucion){
        if (resolucion == null || resolucion.isEmpty()){
            this.resolucion = "Por defecto";
        }else {
            this.resolucion = resolucion;
        }

    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando foto en " + resolucion);
    }

    @Override
    public int verLikes() {
        return 0;
    }
}
