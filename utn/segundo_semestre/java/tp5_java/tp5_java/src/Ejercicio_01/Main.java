package Ejercicio_01;

public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Camilo", "Illanes");

        Pasaporte miPasaporte = new Pasaporte(123456, "camilo_illanes_foto.jpg", titular);

        // 3. Verificamos la info
        miPasaporte.mostrarInfo();
    }
}