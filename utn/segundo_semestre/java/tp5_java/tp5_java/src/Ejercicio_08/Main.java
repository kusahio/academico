package Ejercicio_08;

public class Main {
    public static void main(String[] args) {
        Usuario autor = new Usuario("Maria Graciela", "mary.grazzzz@correo.com");

        Documento contrato = new Documento(
                "Contrato",
                "Por la presente se establece que...",
                "SEA256-9a8bvse564sd5e4f3g2h1",
                "19/12/2026",
                autor
        );

        System.out.println("Documento: " + contrato.getTitulo());
        System.out.println("Contenido: " + contrato.getContenido());

        System.out.println("Código Hash de Firma: " + contrato.getFirmaDigital().getCodigoHash());
        System.out.println("Fecha de Firma: " + contrato.getFirmaDigital().getFecha());
        System.out.println("Firmado por: " + contrato.getFirmaDigital().getUsuario().getNombre());
        System.out.println("Email del Firmante: " + contrato.getFirmaDigital().getUsuario().getEmail());
    }
}