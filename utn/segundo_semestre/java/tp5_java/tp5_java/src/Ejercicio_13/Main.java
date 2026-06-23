package Ejercicio_13;

public class Main {
    public static void main(String[] args) {
        Usuario cliente = new Usuario("JaimicoAlumno", "correo@ejemplo.com");

        GeneradorQR motorGrafico = new GeneradorQR();

        motorGrafico.generar("https://google.com", cliente);
    }
}