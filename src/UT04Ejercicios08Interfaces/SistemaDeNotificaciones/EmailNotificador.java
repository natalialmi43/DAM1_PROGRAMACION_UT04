package UT04Ejercicios08Interfaces.SistemaDeNotificaciones;

public class EmailNotificador implements Notificador {


    @Override
    public void enviarMensaje(String mensaje, String destinatario) {

        System.out.println("Enviando Email a "+ destinatario + ": " + mensaje);

    }
}
