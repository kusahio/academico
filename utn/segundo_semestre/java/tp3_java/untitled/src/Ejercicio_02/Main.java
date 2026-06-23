package Ejercicio_02;

public class Main {
    public static void main(String[] args){
        Mascota mascota = new Mascota();

        //Validaciones
        mascota.setNombre("   ");
        mascota.setEdad(-3);
        mascota.setEspecie("");
        System.out.println("Fin validaciones\n");

        //Crear mascota
        mascota.setNombre("Kira chan");
        mascota.setEspecie("Carey diluida");
        mascota.setEdad(4);
        mascota.mostrarInfo();

        //Errores de sumar edad
        System.out.println("\nMostrar errores al cumplir años");
        mascota.cumplorAnios(-1);

        //Cumplir años correctamente
        mascota.cumplorAnios(1);
        mascota.mostrarInfo();
        mascota.cumplorAnios(1);
        mascota.mostrarInfo();
    }
}
