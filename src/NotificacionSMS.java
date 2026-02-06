public class NotificacionSMS extends Notificacion {
    protected NotificacionSMS(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("SMS :" + mensaje + "a:" + receptorNotificacion);
    }
}