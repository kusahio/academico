package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsoTryWithResources {
    public static void main(String[] args) {
        String ruta = "datos_sistema.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            System.out.println("--- Contenido del archivo ---");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Capturado en Try-With-Resources: Error al procesar '" + ruta + "'. Motivo: " + e.getMessage());
        }
    }
}