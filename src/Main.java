public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(  "1",  100);
        cuenta1.retirar(  100);
        cuenta1.consignar (  150);
        System.out.println("Elsaldo de la cuenta es: " + cuenta1.getSaldo());

        Notificacion[ ] notificacion = new Notificacion [ 2];
        notificacion[0] = new NotificacionCorreo( "Pepito");
        notificacion [1] = new NotificacionSMS ( "Juanillo");

        notificacion[0 ].enviarMensaje( "hola mi amigo");
        notificacion[1].enviarMensaje( "Hola mi broco");
    }
}