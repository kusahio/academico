package Ejercicio_13;

public class GeneradorQR {

    public void generar(String valor, Usuario usuario) {
        if (usuario != null && valor != null && !valor.isEmpty()) {


            CodigoQR qrTemporal = new CodigoQR(valor, usuario);

            System.out.println(" Generando matriz de puntos...");
            System.out.println("-> Código QR creado con éxito para: " + qrTemporal.getUsuario().getNombre());
            System.out.println("-> Destino codificado: " + qrTemporal.getValor());
            System.out.println("-> Estado: Listo para descargar.");

        } else {
            System.out.println("Parámetros inválidos para la creación del QR");
        }
    }
}