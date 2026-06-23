package Ejercicio_10;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("987603456709812", 15000900.75, "6789", "18/05/2026");

        Titular cliente = new Titular("Camilo Illanes", "33487432");

        cuenta.setTitular(cliente);

        System.out.println("CBU Cuenta: " + cuenta.getCbu() + " | Saldo: $" + cuenta.getSaldo());
        System.out.println("Titular de la cuenta: " + cuenta.getTitular().getNombre());
        System.out.println("CBU consultado desde el Titular: " + cliente.getCuentaBancaria().getCbu());

        System.out.println("Código PIN Hash: " + cuenta.getClaveSeguridad().getCodigo());
        System.out.println("Última actualización de contraseña: " + cuenta.getClaveSeguridad().getUltimaModificacion());
    }
}
