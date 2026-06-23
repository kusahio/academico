package Ejercicio_6;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Esteban Quito", "261 555-6666");

        Mesa mesaAsignada = new Mesa(14, 4);

        Reserva reserva = new Reserva("25/05/2026", "21:30", cliente, mesaAsignada);

        System.out.println("Fecha: " + reserva.getFecha() + " | Hora: " + reserva.getHora());
        System.out.println("Cliente: " + reserva.getCliente().getNombre() + " (Tel: " + reserva.getCliente().getTelefono() + ")");
        System.out.println("Mesa asignada: Nro " + reserva.getMesa().getNumero() + " (Capacidad: " + reserva.getMesa().getCapacidad() + " personas)");
    }
}