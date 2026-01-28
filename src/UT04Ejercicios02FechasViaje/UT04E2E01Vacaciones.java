package UT04Ejercicios02FechasViaje;


import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class UT04E2E01Vacaciones {

    public static void main(String[] args) {

        //Se mete el formatos y los destinos
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZoneId doha = ZoneId.of("Asia/Qatar");
        ZoneId tokio = ZoneId.of("Asia/Tokyo");

        //Salida de Madrid
        ZonedDateTime salidaMadrid = ZonedDateTime.of(2025, 4, 12, 20, 45, 0, 0, madrid);

        //Vuelo a Doha
        ZonedDateTime aDoha = salidaMadrid.plusHours(6).plusMinutes(45).withZoneSameInstant(doha);

        //Parada en Doha
        ZonedDateTime salidaDoha = aDoha.plusHours(1);

        //Vuelo a Tokio
        ZonedDateTime aTokio = salidaDoha.plusHours(10).plusMinutes(25).withZoneSameInstant(tokio);


        System.out.println("Salida Madrid: " + salidaMadrid.format(fmt));
        System.out.println("Aterrizaje Doha (Hora local): " + aDoha.format(fmt));
        System.out.println("Salida Doha (Hora local): " + salidaDoha.format(fmt));
        System.out.println("Aterrizaje Tokio (Hora local): " + aTokio.format(fmt));

        System.out.println(" ");
        gestionarAvisoFamilia("Doha", aDoha);
        gestionarAvisoFamilia("Tokio", aTokio);
        verificarFinDeSemana(aTokio);

        //Se calcula el tiempo
        Duration total = Duration.between(salidaMadrid, aTokio);
        long horas = total.toHours();
        long minutos = total.toMinutesPart();
        System.out.println("\nTiempo total de viaje son " + horas + "horas y " + minutos + "minutos.");
    }

    public static void gestionarAvisoFamilia(String escala, ZonedDateTime horaLlegada) {

        ZonedDateTime horaEnMadrid = horaLlegada.withZoneSameInstant(ZoneId.of("Europe/Madrid"));
        int hora = horaEnMadrid.getHour();

        String accion = (hora >= 9 && hora < 22) ? "Llamar por teléfono" : "Enviar WhatsApp";

        System.out.println("Al llegar a " + escala + ", en Madrid son las " + horaEnMadrid.getHour() + ":" + horaEnMadrid.getMinute()
                + ". Acción: " + accion);
    }

    public static void verificarFinDeSemana(ZonedDateTime fecha) {

        int dia = fecha.getDayOfWeek().getValue();
        if (dia >= 6) {
            System.out.println("Es fin de semana en Japón (" + fecha.getDayOfWeek() + "): Avisando a los amigos por WhatsApp.");
        }
    }
}
