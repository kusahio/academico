package Ejercicio_12;

public class Calculadora {

    public void calcular(Impuesto impuesto) {
        if (impuesto != null) {
            double montoFinal = impuesto.getMonto() * 1.21;

            System.out.println("PROCESANDO LIQUIDACIÓN FISCAL");
            System.out.println("Contribuyente: " + impuesto.getContribuyente().getNombre()
                    + " (CUIL: " + impuesto.getContribuyente().getCuil() + ")");
            System.out.println("Monto imponible base: $" + impuesto.getMonto());
            System.out.println("Total a liquidar (con recargo estimado): $" + montoFinal);
        } else {
            System.out.println("Error: No se puede calcular un impuesto inexistente.");
        }
    }
}
