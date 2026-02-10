package UT04Ejercicios01Basicos;
import java.time.LocalDate;
/*
Crea un programa que cuente cuántos días laborables (lunes a viernes) hay entre el 01/04/2025 y el 15/04/2025.

 */
public class UT04Ejercicios01E06ContadorDias {
    public static void main(String[] args) {

        // se define inicio y fin
        LocalDate fechaActual = LocalDate.of(2026, 1, 28);
        LocalDate fechaFin = LocalDate.of(2026, 4, 15);

        int k = 0;

        while (!fechaActual.isAfter(fechaFin)) {

            // para sacar dia en numero
            int diaSemana = fechaActual.getDayOfWeek().getValue();

            if (diaSemana < 6) {
                k++;
            }

            //Se suma un dia para no quedar encerrada en el bucle
            fechaActual = fechaActual.plusDays(1);
        }

        System.out.println("Días laborables totales: " + k);
    }
}
