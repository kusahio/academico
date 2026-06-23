abstract class MaterialBiblioteca {
    private String titulo;
    private int stock;

    public MaterialBiblioteca(String titulo){
        this.titulo = titulo;
        this.stock = 0;
    }

    //setter
    public void setTitulo(String titulo){
        if (titulo != null && !titulo.isBlank()){
            this.titulo = titulo;
        } else {

        }
    }
}
