package Ejercicio_04;

public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public void hacerSonido() {
        System.out.println("El animal emite un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.print("Este animal se llama " + nombre + " y hace: ");
        hacerSonido();
    }
}