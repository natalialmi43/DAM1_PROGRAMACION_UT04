package UT04Ejercicios01Basicos;

import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

/*
Escribe un programa que calcule cuántas horas y minutos dura una clase (o varias) que introduzca el usuario.
 */

public class UT04Ejercicios01E05CalculardoraHorasMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hora de inicio (sigue el formato 08:30): ");
        String textoInicio = scanner.nextLine();

        System.out.println("Hora de fin (siguiendo el formato 10:00): ");
        String textoFin = scanner.nextLine();

        scanner.close();

        // Se convierten los String a objetos
        // LocalTime.parse() entiende "HH:mm" automáticamente.
        LocalTime horaInicio = LocalTime.parse(textoInicio);
        LocalTime horaFin = LocalTime.parse(textoFin);

        // Se calcula duracion con .between
        Duration duracion = Duration.between(horaInicio, horaFin);

        // Se extraen horas y minutos
        long horas = duracion.toHours(); // Saca las horas completas
.
        // Se pone %60 para saber los minutos sobrantes
        long minutos = duracion.toMinutes() % 60;

        System.out.println("La clase dura: " + horas + " horas y " + minutos + " minutos.");

    }
}
