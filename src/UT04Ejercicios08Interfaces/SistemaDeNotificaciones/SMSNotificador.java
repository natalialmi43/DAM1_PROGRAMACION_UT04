package UT04Ejercicios08Interfaces.SistemaDeNotificaciones;

public class SMSNotificador implements Notificador {


    @Override
    public void enviarMensaje(String mensaje, String destinatario) {

        System.out.println("Enviando Sms a "+ destinatario + ": " + mensaje);

    }
}
