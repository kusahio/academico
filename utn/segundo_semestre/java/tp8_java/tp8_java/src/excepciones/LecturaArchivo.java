package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LecturaArchivo {
    public static void main(String[] args) {
        String ruta = "archivo_prueba.txt";
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo '" + ruta + "' no pudo ser encontrado.");
        } catch (IOException e) {
            System.out.println("Error de lectura/escritura: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("Flujo de archivo cerrado de forma segura mediante 'finally'.");
                }
            } catch (IOException ex) {
                System.out.println("Error al cerrar el reader: " + ex.getMessage());
            }
        }
    }
}