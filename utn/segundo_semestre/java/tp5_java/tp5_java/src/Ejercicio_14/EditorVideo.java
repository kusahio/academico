package Ejercicio_14;

public class EditorVideo {

    public void exportar(String formato, Proyecto proyecto) {
        if (proyecto != null && formato != null && !formato.isEmpty()) {

            Render renderResultado = new Render(formato, proyecto);

            System.out.println("Enlazando pistas multimedia...");
            System.out.println("-> Archivo final compilado en formato: ." + renderResultado.getFormato());
            System.out.println("-> Proveniente del Proyecto: " + renderResultado.getProyecto().getNombre());
            System.out.println("-> Duración del video original: " + renderResultado.getProyecto().getDuracionMin() + " min.");
            System.out.println("-> Estado: Exportación de contenedor multimedia finalizada.");

        } else {
            System.out.println("Parámetros inválidos. No se puede exportar");
        }
    }
}