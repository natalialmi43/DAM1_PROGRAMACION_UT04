package UT04Ejercicios01Basicos;

import java.time.LocalDate;

/*
Crea un método que reciba una fecha (LocalDate) y devuelva si es sábado o domingo.
 */

public class UT04Ejercicios01E04DevuelveDíaSemana {

        public static void main(String[] args) {
            //Se añade fecha
            LocalDate fecha = LocalDate.now();

            boolean esFinde = esFinDeSemana(fecha);

            System.out.println("Fecha: " + fecha);
            System.out.println("¿Es fin de semana?: " + esFinde);
        }

        public static boolean esFinDeSemana(LocalDate fecha) {

            int dia = fecha.getDayOfWeek().getValue();

            return dia > 5;
        }
}
