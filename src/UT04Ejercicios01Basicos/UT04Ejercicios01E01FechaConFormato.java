package UT04Ejercicios01Basicos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
Escribe un programa que muestre la fecha actual en el formato "Hoy es día, dd de mes de yyyy"
(ejemplo: "Hoy es miércoles, 02 de abril de 2025").
 */

public class UT04Ejercicios01E01FechaConFormato {
    public static void main(String[] args) {

        // Se saca la fecha actual
        LocalDate hoy = LocalDate.now();
        // Se crea molde
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("'Hoy es 'EEEE', 'dd' de 'MMMM' de 'yyyy");
        //Se crea String para poderlo imprimir
        String resultado = hoy.format(fecha);
        System.out.println(resultado);
    }
}
