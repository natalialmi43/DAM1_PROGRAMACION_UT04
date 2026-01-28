package UT04Ejercicios03Avanzados;

/*
Proyecto

Eres el responsable de un proyecto en tu empresa y necesitas planificar las fechas clave. El proyecto empieza el próximo lunes (suponiendo que hoy es 28/02/2025) y tiene las siguientes fases:
Fase 1: Análisis, dura 5 días laborables (lunes a viernes).
Fase 2: Desarrollo, dura 15 días laborables.
Fase 3: Pruebas, dura 7 días laborables.
Se pide:
Calcular y mostrar la fecha de inicio y fin de cada fase, considerando solo días laborables.
Si el proyecto termina antes del 15/03/2026, imprime "¡Entrega a tiempo!". Si no, imprime "¡Hay que darse prisa!".
Como bonus, calcula cuántos días naturales (incluyendo fines de semana) dura todo el proyecto desde el inicio hasta el fin.
 */

import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class UT04E03E01Proyecto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDate inicio = LocalDate.of(2025, 3, 3);

        LocalDate finF1 = inicio;
        int diasContados = 1;
        while (diasContados < 5) {
            finF1 = finF1.plusDays(1);
            if (finF1.getDayOfWeek() != DayOfWeek.SATURDAY && finF1.getDayOfWeek() != DayOfWeek.SUNDAY) {
                diasContados++;
            }
        }
        System.out.println("Fase 1: Inicio " + inicio + ". Fin " + finF1);

        //Se calcula el inicio de la siguiente
        LocalDate inicioF2 = finF1.plusDays(1);
        while (inicioF2.getDayOfWeek() == DayOfWeek.SATURDAY || inicioF2.getDayOfWeek() == DayOfWeek.SUNDAY) {
            inicioF2 = inicioF2.plusDays(1);
        }

        LocalDate finF2 = inicioF2;
        diasContados = 1;
        while (diasContados < 15) {
            finF2 = finF2.plusDays(1);
            if (finF2.getDayOfWeek() != DayOfWeek.SATURDAY && finF2.getDayOfWeek() != DayOfWeek.SUNDAY) {
                diasContados++;
            }
        }
        System.out.println("Fase 2: Inicio " + inicioF2 + ". Fin " + finF2);


        LocalDate inicioF3 = finF2.plusDays(1);
        while (inicioF3.getDayOfWeek() == DayOfWeek.SATURDAY || inicioF3.getDayOfWeek() == DayOfWeek.SUNDAY) {
            inicioF3 = inicioF3.plusDays(1);
        }

        LocalDate finF3 = inicioF3;
        diasContados = 1;
        while (diasContados < 7) {
            finF3 = finF3.plusDays(1);
            if (finF3.getDayOfWeek() != DayOfWeek.SATURDAY && finF3.getDayOfWeek() != DayOfWeek.SUNDAY) {
                diasContados++;
            }
        }
        System.out.println("Fase 3: Inicio " + inicioF3 + ". Fin " + finF3);


        LocalDate limite = LocalDate.of(2026, 3, 15);
        if (finF3.isBefore(limite)) {
            System.out.println("¡Entrega a tiempo!");
        } else {
            System.out.println("¡Hay que darse prisa!");
        }
    }
}
