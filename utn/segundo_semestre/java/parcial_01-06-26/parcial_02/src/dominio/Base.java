package dominio;

import java.time.LocalDateTime;

public abstract class Base {
    private static Long contadorId = 1L;

    private Long id;
    private boolean eliminado;
    private LocalDateTime createAt;

    public Base() {
        this.id = generarId();
        this.eliminado = false;
        this.createAt = LocalDateTime.now();
    }

    private synchronized Long generarId() {
        return contadorId++;
    }

    public Long getId() { return id; }
    public boolean isEliminado() { return eliminado; }
    public void setEliminado(boolean eliminado) { this.eliminado = eliminado; }
    public LocalDateTime getCreateAt() { return createAt; }
}