package UT04Ejercicios10Repaso.E04GestionElectroAvila;

public class Main {
    public static void main(String[] args) {

        Electrodomestico [] e = new Electrodomestico[2];

        e [0] = new Lavadora("L001", 450, 10);
        e [1] = new Television("T001", 300, 50);


        double precioFinal = 0;

        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].precioFinal());
            precioFinal += e[i].precioFinal();

            if ( e [i] instanceof Lavadora){
                Lavadora l = (Lavadora) e[i];
                l.saludar();
            }
        }
        System.out.println(precioFinal);

        // Son pruebas, no es exactamente lo que pide en el ejercicio

    }
}
