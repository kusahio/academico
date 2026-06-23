package interfaces;

public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private double descuento = 0;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        this.descuento = porcentaje;
        System.out.println("Tarjeta de Crédito: Se aplicará un " + porcentaje + "% de descuento.");
    }

    @Override
    public void procesarPago(double monto) {
        double totalAPagar = monto * (1 - (descuento / 100));
        System.out.println("Pago procesado con Tarjeta de Crédito por un total de: $" + totalAPagar);
    }
}