public class Main
{
    public static void main(String[] args)
    {
        CuentaBancaria cuenta1 = new CuentaBancaria( id: "1", saldoInicial: 100);
        cuenta1.retirar( valorARetirar: 100);
        cuenta1.consignar( valorAConsignar: 150);
        System.out.printf("El saldo de la cuenta es: " + cuenta1.getSaldo());
    }
}