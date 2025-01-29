public class ListaPeliculas {
    private Pelicula[] peliculas;
    private int contador;

    // Constructor
    public ListaPeliculas(int numPeliculas) {
        peliculas = new Pelicula[numPeliculas];
        contador = 0;
    }
    //Métodos
    public void agregarPelicula(Pelicula pelicula) {
        if (contador == peliculas.length) {                                                 // Si el array está lleno, crear un nuevo array con más espacio
            Pelicula[] nuevoArray = new Pelicula[peliculas.length * 2];                     // Duplicamos el tamaño
            System.arraycopy(peliculas, 0, nuevoArray, 0, peliculas.length);  // Copiamos las películas existentes
            peliculas = nuevoArray;                                                         // Asignamos el nuevo array
        }
        peliculas[contador] = pelicula;                                                     // Agregamos la nueva película
        contador++;                                                                         // Incrementamos el contador al haber añadido una nueva pelicula
    }
    public Pelicula buscarPelicula(String titulo){
        for (int i = 0; i < contador; i++) {
            if (peliculas[i].getTitulo().equals(titulo)) {
                return peliculas[i];  // Si encontramos la película, la devolvemos
            }
        }
        System.out.println("No disponemos de esa película.");
        return null;  // Si no la encontramos, devolvemos null
    }
    public Pelicula eliminarPelicula(String titulo){
        Pelicula pelicula = buscarPelicula(titulo);  // Buscamos la película por título
        if (pelicula != null) {  // Si la película existe
            // Desplazamos las películas a la izquierda para "eliminar" la película
            for (int i = 0; i < contador; i++) {
                if (peliculas[i].getTitulo().equals(titulo)) {
                    for (int j = i; j < contador - 1; j++) {
                        peliculas[j] = peliculas[j + 1];
                    }
                    // Establecemos el último elemento como null
                    peliculas[contador - 1] = null;
                    contador--;
                    System.out.println("Película eliminada con éxito.");
                    return pelicula;
                }
            }
        } else {
            System.out.println("No se pudo eliminar la película porque no existe.");
        }
        return pelicula;
    }
    public void mostrarPeliculas() {
        for (int i = 0; i < contador; i++) {
            System.out.println(peliculas[i]);
        }
    }
}
