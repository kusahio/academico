package personaje;

public class Personaje{
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean isDerrotado;
    private int id;

    private static int totalPersonajes = 0;

    private int generarId() {
        totalPersonajes++;
        return totalPersonajes;
    }

    public String getNombre(){ return nombre; }
    public int getNivel(){ return nivel; }
    public int getPuntosVida(){ return puntosVida; }
    public boolean getIsDerrotado(){ return isDerrotado; }
    public int getId(){ return id; }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public void setNivel(int nivel){
        if (nivel >= 1 && nivel <= 100){
            this.nivel = nivel;
        } else {
            System.out.println("Error: El nivel debe estar entre 1 y 100. Se mantiene en el nivel actual.");
        }
    }

    public void setPuntosVida(int puntosVida){
        if (puntosVida >= 50 && puntosVida <= 100){
            this.puntosVida = puntosVida;
        } else {
            System.out.println("La vida no puede ser menor a 50 y mayor a 100");
        }
    }

    public Personaje(String nombre){
        this(nombre, 1, 100);
    }

    public Personaje(String nombre, int nivel, int puntosVida){
        this.id = generarId();
        this.isDerrotado = false;
        this.setNombre(nombre);
        this.setNivel(nivel);
        this.setPuntosVida(puntosVida);
    }

    public void recibirDanio(){}
}
