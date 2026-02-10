package UT04Ejercicios03Avanzados;

import java.time.LocalTime;

/*
Concierto
Planeas viajar desde Madrid a Londres para ver a tu banda favorita en concierto. Hoy es 03/04/2026, y el concierto es el
 sábado 05/04/2026 a las 20:00 (hora de Londres).
Sales de Madrid el sábado a las 11:30 (hora local), y el vuelo dura 2 horas y 15 minutos hasta Londres.
Desde el aeropuerto de Londres, tardas 45 minutos en llegar al lugar del concierto.
Se pide:
Calcula y muestra la hora local de salida desde Madrid y la hora local de llegada a Londres.
Determina a qué hora llegarás al lugar del concierto y si llegarás a tiempo para el inicio (20:00 en Londres).
El concierto dura 2 horas y 30 minutos. Calcula la hora de fin y decide si podrás tomar un vuelo de vuelta a Madrid esa
misma noche, que sale a las 23:45 (hora de Londres), considerando que necesitas 1 hora para volver al aeropuerto desde el concierto.
 */

public class UT04E30E02Concierto {

    public static void main(String[] args) {

        LocalTime salidaMadrid = LocalTime.of(11, 30);
        int duracionVueloMinutos = 135;
        int trasladoAlConcierto = 45;
        LocalTime inicioConcierto = LocalTime.of(20, 0);

        // Londres cambia la hora
        LocalTime salidaHoraLondres = salidaMadrid.minusHours(1);
        LocalTime llegadaLondres = salidaHoraLondres.plusMinutes(duracionVueloMinutos);

        System.out.println("Salida de Madrid (Local): " + salidaMadrid);
        System.out.println("Llegada a Londres (Local): " + llegadaLondres);


        LocalTime llegadaAlRecinto = llegadaLondres.plusMinutes(trasladoAlConcierto);
        System.out.println("Llegada al concierto: " + llegadaAlRecinto);

        if (llegadaAlRecinto.isBefore(inicioConcierto)) {
            System.out.println("Llegas a tiempo!!");
        } else {
            System.out.println("Vas tarde, corre!");
        }

        int duracionConciertoMinutos = 150;
        LocalTime finConcierto = inicioConcierto.plusMinutes(duracionConciertoMinutos);
        System.out.println("El concierto termina a las: " + finConcierto);

        LocalTime llegadaAeropuertoVuelta = finConcierto.plusHours(1);
        LocalTime salidaVueloVuelta = LocalTime.of(23, 45);

        System.out.println("Llegada al aeropuerto para volver: " + llegadaAeropuertoVuelta);

        if (llegadaAeropuertoVuelta.isBefore(salidaVueloVuelta)) {
            System.out.println("Te da tiempo a coger el vuelo.");
        } else {
            System.out.println("Perdiste el vuelo de vuelta.");
        }
    }
}
