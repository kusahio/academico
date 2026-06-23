package Ejercicio_05;

public class Main {
    public static void main(String[] args) {
        Computadora miCompu = new Computadora("HP", "SN-2026XYZ", "Intel Omnitrix Z790", "Intel J980");

        Propietario propietario = new Propietario("Don Chuma", "10323600");

        miCompu.setPropietario(propietario);

        System.out.println("Dueño asignado a la PC: " + miCompu.getPropietario().getNombre());
        System.out.println("PC asignada al dueño: " + propietario.getComputadora().getMarca() + " (S/N: " + propietario.getComputadora().getNumeroSerie() + ")");

        System.out.println("Modelo de Placa Madre integrada: " + miCompu.getPlacaMadre().getModelo());
        System.out.println("Chipset de la Placa: " + miCompu.getPlacaMadre().getChipset());
    }
}