public abstract class Notificacion {
    protected final String receptorNotificacion;

    protected Notificacion(String receptorNotificacion ){
        if(receptorNotificacion == null || receptorNotificacion.isBlank()){
            throw new IllegalArgumentException("El receptor es invalido");
        }
        this.receptorNotificacion = receptorNotificacion;
    }

    public abstract void enviarMensaje(String mensaje);


}

public class NotificacionSms extends Notificacion {
    protected NotificacionSms(String receptorNotificacion) {
        super(receptorNotificacion);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Se envio el sms:" + mensaje + "a:" + receptorNotificacion);
    }
}