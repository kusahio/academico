package Ejercicio_02;

public class Main {
    public static void main(String[] args) {
        Bateria bateriaExterna = new Bateria("Litio", 2500);

        Celular miCelular = new Celular("987654321012345", "nokia", "1100", bateriaExterna);

        Usuario miUsuario = new Usuario("Camilo", "12345678");

        miCelular.setUsuario(miUsuario);

        System.out.println("VERIFICACIÓN DE CONSISTENCIA BIDIRECCIONAL");
        System.out.println("El usuario del celular es: " + miCelular.getUsuario().getNombre());
        System.out.println("El celular del usuario es: " + miUsuario.getCelular().getMarca() + " " + miUsuario.getCelular().getModelo());

        System.out.println("\n VERIFICACIÓN DE AGREGACIÓN");
        System.out.println("Modelo de Batería incorporada: " + miCelular.getBateria().getModelo() + " (" + miCelular.getBateria().getCapacidad() + " mAh)");
    }
}