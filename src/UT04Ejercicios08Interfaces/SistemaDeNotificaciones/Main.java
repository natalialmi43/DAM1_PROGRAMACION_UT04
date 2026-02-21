package UT04Ejercicios08Interfaces.SistemaDeNotificaciones;

import java.util.Arrays;

public class Main {
    static void main(String[] args) {

        Notificador [] listaNotificaciones = new Notificador[2];

        listaNotificaciones [0] = new EmailNotificador();
        listaNotificaciones [1] = new SMSNotificador();


        for (int i = 0; i < listaNotificaciones.length; i++) {
            listaNotificaciones [i].enviarMensaje("Hola", "Juan");
        }

    }
}
