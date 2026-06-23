package Ejercicio_05;

public class Main {
    public static void main(String[] args){
        NaveEspacial miNave = new NaveEspacial();
        miNave.setNombre("Explorador UTN");
        miNave.setCombustible(50);
        System.out.println("Inicio de Simulación");
        miNave.mostrarEstado();

        // Intentar avanzar una distancia que requiera más combustible
        System.out.println("\nPrueba 1: Intento de avance insuficiente");
        miNave.avanzar(30);

        // Intentar realizar una recarga superando el límite de 100
        System.out.println("\nPrueba 2: Fallo de seguridad en recarga (Exceso)");
        miNave.recargarCombustible(60); // 50 actual + 60 = 110 (Debe fallar)

        // Operación correcta
        System.out.println("\nPrueba 3: Vuelo exitoso");
        miNave.despegar();
        miNave.recargarCombustible(20);
        miNave.avanzar(10);

        // 5. Mostrar el estado final de la nave
        System.out.println("\nEstado Final");
        miNave.mostrarEstado();
    }
}
