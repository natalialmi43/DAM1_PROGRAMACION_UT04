package UT04Ejercicios01E01FechaConFormato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechasConFormato {
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
