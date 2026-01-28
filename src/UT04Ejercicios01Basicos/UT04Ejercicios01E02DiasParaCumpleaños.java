package UT04Ejercicios01Basicos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
Crea un programa que pida al usuario su fecha de nacimiento (día y mes) y calcule cuántos días faltan para su próximo
cumpleaños desde hoy (02/04/2025). 
 */

public class UT04Ejercicios01E02DiasParaCumpleaños {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se establece fecha fija a dia de hoy
        LocalDate hoy = LocalDate.of(2026, 1, 28);


        System.out.print("Introduce tu día de nacimiento: ");
        int dia = scanner.nextInt();

        System.out.print("Introduce tu mes de nacimiento: ");
        int mes = scanner.nextInt();

        scanner.close();

        // Se crea fecha de cumpleaños
        LocalDate proximoCumple = LocalDate.of(hoy.getYear(), mes, dia);

        // Comprobar si ha pasado
        if (proximoCumple.isBefore(hoy)) {
            proximoCumple = proximoCumple.plusYears(1); // Se suma un año en caso
        }

        // Se calcula la diferencia de días
        long diasFaltantes = ChronoUnit.DAYS.between(hoy, proximoCumple);


        System.out.println("Fecha actual: " + hoy);
        System.out.println("Tu próximo cumpleaños será el: " + proximoCumple);
        System.out.println("Faltan " + diasFaltantes + " días.");


    }
}
