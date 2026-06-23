package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Camilo Illanes", 50000.0);
        Cuenta cuenta2 = new Cuenta("Kira chan");

        System.out.println(cuenta1);
        System.out.println(cuenta2);

        System.out.println("Saldo cuenta 1");
        cuenta1.consultarSaldo(1350.0);
        System.out.println("Saldo cuenta 2");
        cuenta2.consultarSaldo(1350.0);

        //Depositar/Extraer
        cuenta1.extraer(1000);
        cuenta1.consultarSaldo();
        cuenta2.depositar(4000);
        cuenta2.consultarSaldo();

        Cuenta.mostrarTotalCuentas();
    }
}