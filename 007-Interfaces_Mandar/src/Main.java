import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        AlmacenMusica almacenMusica = new AlmacenMusica();
        Cancion cancion1 = new Cancion(1,"Lala");
        Cancion cancion2 = new Cancion(2,"Espresso Martini");
        Cancion cancion3 = new Cancion(3, "Nueva Yol");
        Cancion cancion4 = new Cancion(4, "Baile Inolvidable");
        Cancion cancion5 = new Cancion(5, "Memorias");

        //Añadir Canciones
            almacenMusica.addCancion(cancion1);
            almacenMusica.addCancion(cancion2);
            almacenMusica.addCancion(cancion3);
            almacenMusica.addCancion(cancion4);
            almacenMusica.addCancion(cancion5);
            //UPDATE: YA TENGO EL ID EN BD
            //PRIMARY KEY = 13
            System.out.println();
            System.out.println("Actualizamos una canción:");
                //USUARIO
                cancion1.setTitulo("Baby Hello");
                //LO GRABAMOS DESDE BD
                cancion1.setId(6);

            System.out.println("Dame el nuevo titulo");
            String titleUsuario = leer.nextLine();
            System.out.println("Dime el ID de la canción a updatear");
            int idUsuario = leer.nextInt();


            Cancion cancionUsuario = new Cancion(idUsuario,titleUsuario);
            almacenMusica.updateCancion(cancionUsuario);

            System.out.println();
            System.out.println("Eliminamos una canción:");
            almacenMusica.deleteCancion(cancion5);

            System.out.println();
            System.out.println("Imprimimos las canciones:");
            almacenMusica.imprimir();
    }
}