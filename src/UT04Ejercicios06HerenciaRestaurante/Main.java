package herenciaRestaurante;

public class Main {
    public static void main(String[] args) {

        Primeros primeros1 = new Primeros("Sopa", 5,false);
        Carnes carnes1 = new Carnes("Pollo", 5, GradoCoccion.AL_PUNTO);
        Pescados pescados1 = new Pescados("Merluza", 5);
        Postres postres1 = new Postres("Tarta", 5, true);

        Comanda c1 = new Comanda(3,2);

        c1.añadirPlato(primeros1);
        c1.añadirPlato(carnes1);
        c1.añadirPlato(pescados1);
        c1.añadirPlato(postres1);

        System.out.println(c1.toString());

        c1.coste();

        c1.hayDiabeticosEnLaMesa();

        c1.imprimirTicket();
    }
}
