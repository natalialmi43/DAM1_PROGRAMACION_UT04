package UT04Ejercicios06HerenciaRestaurante;

public class Main {
    public static void main(String[] args) {

        Primeros primeros1 = new Primeros("Sopa", 5,false);
        Carnes carnes1 = new Carnes("Pollo", 5, GradoCoccion.AL_PUNTO);
        Pescados pescados1 = new Pescados("Merluza", 5);
        Postres postres1 = new Postres("Tarta", 5, false);

        Comanda c1 = new Comanda(3,2);

        c1.addPlato(primeros1);
        c1.addPlato(carnes1);
        c1.addPlato(pescados1);
        c1.addPlato(postres1);


        System.out.println("la cuenta es de " + c1.sacarCuenta());

        System.out.println(c1.hayDiabeticos()? "Hay diabeticos " : "No hay diabeticos");

        c1.mostrarComanda();


    }
}
