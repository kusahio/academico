package Ejercicio_04;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- DEMO EJERCICIO 4 ---");
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Buddy"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Claraboya"));

        for (Animal ani : animales) {
            ani.describirAnimal();
        }
    }
}