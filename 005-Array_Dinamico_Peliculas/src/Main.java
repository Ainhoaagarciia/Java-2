
public class Main {
    public static void main(String[] args) {

        Pelicula pelicula1= new Pelicula("Del Revés","Robert",2010);
        Pelicula pelicula2= new Pelicula("La Luna","Juan",2002);
        Pelicula pelicula3= new Pelicula("Mascotas","Pepe",2008);
        Pelicula pelicula4= new Pelicula("LA LA LAND","Juanito Juan",2000);
        Pelicula pelicula5= new Pelicula("Ole ole", "Joseph",2010);

        ListaPeliculas lista = new ListaPeliculas(5);
        lista.agregarPelicula(pelicula1);
        lista.agregarPelicula(pelicula2);
        lista.agregarPelicula(pelicula3);
        lista.agregarPelicula(pelicula4);
        lista.agregarPelicula(pelicula5);

        // Mostrar todas las películas que haya en la lista
        System.out.println("Lista de películas:");
        lista.mostrarPeliculas();
    }
}