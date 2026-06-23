package interfaces;

public class PayPal implements Pago {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado con PayPal por un total de: $" + monto + " (Enviado a " + email + ")");
    }
}