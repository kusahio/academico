

import dominio.Categoria;
import dominio.Pedido;
import dominio.Producto;
import enumerables.Estado;
import enumerables.FormaPago;
import interfaces.Calculable;

public class Main {

    // Códigos ANSI para colores en consola
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {

        double puntajeTotal = 0.0;

        System.out.println(ANSI_CYAN + "==================================================");
        System.out.println("🚀 INICIANDO SCRIPT DE CORRECCIÓN AUTOMÁTICA");
        System.out.println("==================================================" + ANSI_RESET);

        // =================================================================
        // V1. CREACIÓN Y ASOCIACIÓN DE CATEGORÍAS Y PRODUCTOS (10 pts)
        // =================================================================
        System.out.println(ANSI_YELLOW + "\n[V1] Validando Asociación Bidireccional Categoría <-> Producto..." + ANSI_RESET);

        Categoria catLacteos = new Categoria("Lácteos", "Productos derivados de la leche");
        Categoria catPanaderia = new Categoria("Panadería", "Panes, facturas y galletas");

        Producto p1 = new Producto("Leche Entera 1L", 1500.0, "Leche de vaca", 50, "leche.png", catLacteos);
        Producto p2 = new Producto("Queso Cremoso", 4500.0, "Queso por kg", 10, "queso.png", catLacteos);
        Producto p3 = new Producto("Pan Francés", 2000.0, "Pan del día por kg", 30, "pan.png", catPanaderia);
        Producto p4 = new Producto("Medialunas x12", 3500.0, "Docena de manteca", 2, "medialunas.png", catPanaderia);

        boolean v1_1 = p1.getCategoria() != null && p1.getCategoria().equals(catLacteos);
        boolean v1_2 = catLacteos.getProducto().contains(p1);

        puntajeTotal += evaluar("Asociación bidireccional Producto-Categoría correcta.", v1_1 && v1_2, 10.0);

        // =================================================================
        // V2. VALIDACIÓN DE EQUALS EN ENTIDADES (10 pts)
        // =================================================================
        System.out.println(ANSI_YELLOW + "\n[V2] Validando método equals() obligatorio según UML..." + ANSI_RESET);

        Categoria catClon = new Categoria("Lácteos", "Otra descripción distinta");
        boolean v2_1 = catLacteos.equals(catClon);

        puntajeTotal += evaluar("El método equals() de Categoría compara correctamente por nombre.", v2_1, 10.0);

        // =================================================================
        // V3. CREACIÓN DEL PEDIDO INICIAL (10 pts)
        // =================================================================
        System.out.println(ANSI_YELLOW + "\n[V3] Validando instanciación inicial del Pedido..." + ANSI_RESET);

        Pedido pedido = new Pedido(FormaPago.EFECTIVO);

        boolean v3_1 = pedido.getEstado() == Estado.INVALIDO && pedido.getTotal() == 0.0;
        puntajeTotal += evaluar("El pedido nace en estado INVALIDO y total $0.0.", v3_1, 10.0);

        // =================================================================
        // V4. PRUEBA: VENTA EXCEDIENDO STOCK (15 pts)
        // =================================================================
        System.out.println(ANSI_YELLOW + "\n[V4] Validando rechazo al exceder stock (Detalle Inválido)..." + ANSI_RESET);

        pedido.addDetallePedido(15, p2); // Queso Cremoso tiene 10

        boolean v4_1 = pedido.getDetallesPedido().isEmpty() && pedido.getTotal() == 0.0 && p2.getStock() == 10;
        puntajeTotal += evaluar("Rechazo correcto: No altera pedido ni descuenta producto.", v4_1, 15.0);

        // =================================================================
        // V5. PRUEBA: VENTA AGOTANDO STOCK (20 pts)
        // =================================================================
        System.out.println(ANSI_YELLOW + "\n[V5] Validando descuento exacto y agotamiento de stock..." + ANSI_RESET);

        pedido.addDetallePedido(2, p4); // Medialunas tiene 2

        boolean v5_1 = p4.getStock() == 0 && !p4.getDisponible();
        boolean v5_2 = pedido.getDetallesPedido().size() == 1 && pedido.getEstado() == Estado.PENDIENTE && pedido.getTotal() == 7000.0;

        puntajeTotal += evaluar("El stock llega a 0 y 'disponible' pasa a false automáticamente.", v5_1, 10.0);
        puntajeTotal += evaluar("Pedido actualizado: PENDIENTE y total calculado correctamente.", v5_2, 10.0);

        // =================================================================
        // V6. PRUEBA: EVITAR DUPLICADOS (10 pts)
        // =================================================================
        System.out.println(ANSI_YELLOW + "\n[V6] Validando prevención de productos duplicados..." + ANSI_RESET);

        pedido.addDetallePedido(1, p4); // Intentamos agregar Medialunas otra vez

        boolean v6_1 = pedido.getDetallesPedido().size() == 1 && pedido.getTotal() == 7000.0;
        puntajeTotal += evaluar("El pedido detectó el duplicado y no lo agregó a la lista.", v6_1, 10.0);

        // =================================================================
        // V7. PRUEBA: ELIMINACIÓN Y RECÁLCULO (15 pts)
        // =================================================================
        System.out.println(ANSI_YELLOW + "\n[V7] Validando eliminación de detalles y recálculo inverso..." + ANSI_RESET);

        // Eliminamos el único detalle que tiene el pedido
        pedido.deleteDetallePedidoByProducto(p4);

        boolean v7_1 = pedido.getDetallesPedido().isEmpty();
        boolean v7_2 = pedido.getTotal() == 0.0;
        boolean v7_3 = pedido.getEstado() == Estado.INVALIDO;

        puntajeTotal += evaluar("El detalle fue eliminado correctamente de la lista.", v7_1, 5.0);
        puntajeTotal += evaluar("El total del pedido volvió a recalcularse a $0.0.", v7_2, 5.0);
        puntajeTotal += evaluar("El estado del pedido volvió a INVALIDO al quedar vacío.", v7_3, 5.0);

        // =================================================================
        // V8. INTERFACES Y POLIMORFISMO (10 pts)
        // =================================================================
        System.out.println(ANSI_YELLOW + "\n[V8] Validando Interfaces y Polimorfismo..." + ANSI_RESET);

        // Verifica si el alumno le puso "implements Calculable" a la clase Pedido
        boolean v8_1 = pedido instanceof Calculable;
        // Verifica que hayan sobrescrito toString() (no debería imprimir la referencia de memoria '@')
        boolean v8_2 = !pedido.toString().contains("@") && pedido.toString().contains("Pedido{");

        puntajeTotal += evaluar("La clase Pedido implementa la interfaz Calculable.", v8_1, 5.0);
        puntajeTotal += evaluar("Polimorfismo: toString() sobrescrito correctamente.", v8_2, 5.0);


        // =================================================================
        // REPORTE FINAL
        // =================================================================
        System.out.println("\n" + ANSI_CYAN + "==================================================");
        System.out.println("📊 REPORTE FINAL DE EVALUACIÓN");
        System.out.println("==================================================" + ANSI_RESET);
        System.out.println("Puntaje Obtenido: " + puntajeTotal + " / 100.0 puntos\n");

        if (puntajeTotal == 100.0) {
            System.out.println(ANSI_GREEN + "¡EXCELENTE! La implementación cumple con todas las reglas de negocio evaluadas." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "[!] HAY ERRORES. Revisa las validaciones fallidas (marcadas con ✘) y corrige tu lógica." + ANSI_RESET);
        }
    }

    /**
     * Método auxiliar para imprimir los resultados de las validaciones con colores y puntajes.
     */
    private static double evaluar(String descripcion, boolean pasoPrueba, double puntosAsignados) {
        if (pasoPrueba) {
            System.out.println(ANSI_GREEN + "  [✔ PASS] " + ANSI_RESET + descripcion + ANSI_GREEN + " (+" + puntosAsignados + " pts)" + ANSI_RESET);
            return puntosAsignados;
        } else {
            System.out.println(ANSI_RED + "  [✘ FAIL] " + ANSI_RESET + descripcion + ANSI_RED + " (+0.0 pts)" + ANSI_RESET);
            return 0.0;
        }
    }
}