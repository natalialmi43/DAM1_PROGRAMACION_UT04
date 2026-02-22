package UT04Ejercicios08Interfaces.E05HerenciaMultipleSimulada;

public class Main {
    public static void main(String[] args) {

        Conectable [] c1 = new Conectable [3];

        c1 [0] = new Lampara();
        c1 [1] = new Movil();

        c1 [1].encender();

        /*

         Ahora intenta meter una Lámpara y un Móvil en un array de Recargable. ¿Por qué da error la lámpara?
         ¿Cómo lo solucionarías en el código?

         La única forma técnica y profesional de solucionarlo en el código para que el sistema la acepte es cambiar el
         contrato de la lámpara.

         */


    }
}
