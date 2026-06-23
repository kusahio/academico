package Ejercicio_04;

public class Main {
    public  static void main(String[] args){
        Gallina gallinaA = new Gallina();
        Gallina gallinaB = new Gallina();

        //edad negativa
        gallinaA.setEdad(-2);

        gallinaA.setIdGallina(1);
        gallinaA.setEdad(2);

        gallinaB.setIdGallina(2);
        gallinaB.setEdad(1);

        // Simular acciones independientes
        gallinaA.ponerHuevo(2);
        gallinaA.envejecer();
        gallinaB.ponerHuevo(1);
        gallinaB.envejecer();

        // Mostrar estado
        System.out.println("Gallina A");
        gallinaA.mostrarEstado();

        System.out.println("\nGallina B");
        gallinaB.mostrarEstado();
    }
}
