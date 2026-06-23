package Ejercicio_05;

public class Cuenta {
    private final int numero;
    private String titular;
    private double saldo;
    private static int ultimoNumero = 100;
    private static int totalCuentas = 0;

    public Cuenta(String titular, double saldoInicial) {
        this.numero = ++ultimoNumero;
        this.titular = titular;
        if (saldoInicial >= 0) this.saldo = saldoInicial;
        totalCuentas++;
    }

    public Cuenta(String titular) {
        this(titular, 0.0);
    }

    public void consultarSaldo() {
        System.out.println("Saldo: $"+saldo);
    }

    public void consultarSaldo(double cotizacionDolar) {
        double convertido = saldo / cotizacionDolar;
        System.out.println("Saldo en USD: $" + String.format("%.2f", convertido));
    }

    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + String.format("%.2f", saldo));
        } else {
            System.out.println("Error: El monto a depositar debe ser positivo.");
        }
    }

    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo) { // [cite: 220]
            this.saldo -= monto;
            System.out.println("Extracción exitosa. Nuevo saldo: $" + String.format("%.2f", saldo));
        } else {
            System.out.println("Error: Fondos insuficientes o monto inválido."); // [cite: 226]
        }
    }

    @Override
    public String toString() {
        return "Cuenta N°: "+numero +
                "\nTitular: "+titular
                +"\nSaldo: $"+String.format("%.2f", saldo);
    }

    public static void mostrarTotalCuentas() {
        System.out.println("Total de cuentas: "+totalCuentas);
    }
}