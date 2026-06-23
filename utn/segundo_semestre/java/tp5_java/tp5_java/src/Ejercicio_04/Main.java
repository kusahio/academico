package Ejercicio_04;

public class Main {
    public static void main(String[] args) {
        Banco bancoEstado = new Banco("Banco Estado", "10-0000076-1");

        TarjetaDeCredito visaShare = new TarjetaDeCredito("0000-1111-2222-4444", "12/31", bancoEstado);

        Cliente cliente = new Cliente("Juan Nieves", "43276543");

        cliente.setTarjeta(visaShare);

        System.out.println("Titular de la Tarjeta: " + visaShare.getCliente().getNombre());
        System.out.println("DNI del Titular: " + visaShare.getCliente().getDni());
        System.out.println("Número de Tarjeta asignada al Cliente: " + cliente.getTarjeta().getNumero());
        System.out.println("Banco Emisor de la Tarjeta: " + visaShare.getBanco().getNombre() + " (CUIT: " + visaShare.getBanco().getCuit() + ")");
    }
}