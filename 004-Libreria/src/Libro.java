public class Libro {
    // ATRIBUTOS - VARIABLES PERMANENTES
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;
    public static int contadorLibros = 0;

    //CONSTRUCTOR - VARIABLES TEMPORALES ENTRE LOS CORCHETES, PASAN A SER PERMANENTES
    //ALT + INSERT

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
        this.contadorLibros++;
    }


    public Libro(){}
    //MÉTODOS
    // GETTER/SETTER

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", disponible=" + disponible +
                '}';
    }
}
