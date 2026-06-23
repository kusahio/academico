package Ejercicio_11;

public class Reproductor {


    public void reproducir(Cancion cancion) {
        if (cancion != null) {
            System.out.println("🎶 [AUDIO] Sonando: \"" + cancion.getTitulo() + "\""
                    + " por " + cancion.getArtista().getNombre()
                    + " (" + cancion.getArtista().getGenero() + ")");
        } else {
            System.out.println("No hay ninguna canción cargada en el lector");
        }
    }
}