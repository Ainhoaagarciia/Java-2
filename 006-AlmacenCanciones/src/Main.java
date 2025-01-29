public class Main {
    public static void main(String[] args) {

        AlmacenMusica almacenMusica1= new AlmacenMusica();
        Cancion cancion1 = new Cancion(1,"Lala");
        Cancion cancion2 = new Cancion(2,"Pepe");
        Cancion cancion3 = new Cancion(3,"Juan Juanito Juan");

        AlmacenMusica.addCancion(cancion1);
        AlmacenMusica.addCancion(cancion2);
        AlmacenMusica.addCancion(cancion3);

        System.out.println();
        AlmacenMusica.deleteCancion(cancion1);

        System.out.println();
        AlmacenMusica.imprimirCancion();

    }
}