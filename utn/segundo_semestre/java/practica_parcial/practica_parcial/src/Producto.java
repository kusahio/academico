public class Producto {
    private final int codigo;
    private String descripcion;
    private String categoria;
    private int cantidadStock;
    private double precioUnitario;
    private static int totalProductos = 0;
    private static final String[] CATEGORIAS_PERMITIDAS = {"Electrónica", "Librería","Indumentaria", "Hogar"};

    public Producto(int codigo, String descripcion, String categoria, int cantidadStock, double precioUnitario){
        totalProductos++;
        if (codigo > 0){
            this.codigo = codigo;
        } else {
            System.out.println("Error: Código inválido. Se asignará un código automático.");
            this.codigo = totalProductos;
        }
        setDescripcion(descripcion);
        setCategoria(categoria);
        setCantidadStock(cantidadStock);
        setPrecioUnitario(precioUnitario);
    }

    public Producto(String descripcion, String categoria, int cantidadStock){
        this(++totalProductos, descripcion, categoria, cantidadStock, 50.00);
    }

    //setters
    public void setDescripcion(String descripcion){
        if (descripcion != null && !descripcion.isBlank()){
            this.descripcion = descripcion;
        } else {
            System.out.println("Error: La descripción no puede estar vacía");
        }
    }

    public void setCategoria(String categoria){
        boolean esValida = false;
        if (categoria != null && !categoria.isBlank()){
            for (String categoriaPermitida : CATEGORIAS_PERMITIDAS){
                if (categoriaPermitida.equalsIgnoreCase(categoria)){
                    this.categoria = categoriaPermitida;
                    esValida = true;
                    break;
                }
            }
        }
        else if (!esValida) {
            this.categoria = "Indumentaria";
            System.out.println("Error: La categoría ingresada no está permitida, se asignará 'Indumentaria'");
        }
        else {
            System.out.println("Error: La categoría no puede estar vacía");
        }


    }

    public void setCantidadStock(int cantidadStock){
        if (cantidadStock >= 0){
            this.cantidadStock = cantidadStock;
        } else {
            System.out.println("Error: el stock no puede ser menor a 0");
        }
    }

    public void setPrecioUnitario(double precioUnitario){
        if (precioUnitario > 0){
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("Error: El precio debe ser mayor a 0");
        }
    }

    //getters
    public String getDescripcion(){ return descripcion; }
    public String getCategoria(){ return categoria; }
    public int getCantidadStock() { return cantidadStock; }
    public double getPrecioUnitario(){ return precioUnitario; }

    public void aplicarDescuento(double porcentaje){
        if (porcentaje > 0 && porcentaje <= 100) {
            double nuevoPrecio = precioUnitario * (1 - (porcentaje / 100.0));
            if (nuevoPrecio > 0) {
                this.precioUnitario = nuevoPrecio;
            } else {
                System.out.println("Error: El descuento es demasiado alto y el precio quedaría en 0 o menos.");
            }
        } else {
            System.out.println("Error: El porcentaje debe ser mayor a 0 y menor o igual a 100");
        }
    }

    public void aplicarDescuento(int descuentoFijo){
        boolean validaDescuento = precioUnitario - descuentoFijo > 0;
        if (descuentoFijo > 0 && validaDescuento){
            this.precioUnitario -= descuentoFijo;
        } else {
            System.out.println("Error: El descuento debe ser mayor a 0");
        }
    }

    public static void mostrarTotalProductos(){
        System.out.println("Total de productos:"+ totalProductos);
    }

    public static void mostrarCategorias(){
        System.out.println("Categorías Permitidas");
        for (String categoria : CATEGORIAS_PERMITIDAS){
            System.out.println(categoria);
        }
    }

    @Override
    public String toString() {
        return "Producto:" +
                "\nCodigo =" + codigo +
                "\nDescripcion ='" + descripcion +
                "\nCategoria='" + categoria +
                "\nCantidadStock=" + cantidadStock +
                "\nPrecioUnitario=" + precioUnitario;
    }
}
