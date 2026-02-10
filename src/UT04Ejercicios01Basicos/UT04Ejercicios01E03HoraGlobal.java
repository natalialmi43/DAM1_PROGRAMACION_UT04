package UT04Ejercicios01Basicos;

/*
Escribe un programa que muestre la hora actual en España ("Europe/Madrid"), Japón ("Asia/Tokyo")
y México ("America/Mexico_City") en el formato "dd/MM/yyyy HH:mm z".
 */

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class UT04Ejercicios01E03HoraGlobal {
    public static void main(String[] args) {


        // Se crea el formato a usar en las tres
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");

        //Se busca la zona
        ZonedDateTime spain = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime japon = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime mexico = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));

        System.out.println(spain);
        System.out.println(japon);
        System.out.println(mexico);
    }
}
