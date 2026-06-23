package Ejercicio_10;

public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getUltimaModificacion() { return ultimaModificacion; }
    public void setUltimaModificacion(String ultimaModificacion) { this.ultimaModificacion = ultimaModificacion; }
}