package Ejercicio_02;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- DEMO EJERCICIO 2 ---");
        Figura[] figuras = {
        new Circulo("Círculo Mediano", 3.5),
        new Rectangulo("Rectángulo Base", 5.0, 4.0)
        };

        for (Figura f : figuras) {
            System.out.println("Figura: " + f.getNombre() + " | Área: " + String.format("%.2f", f.calcularArea()));
        }
    }
}