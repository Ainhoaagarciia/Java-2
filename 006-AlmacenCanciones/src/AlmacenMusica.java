import java.util.ArrayList;

public class AlmacenMusica {

    private static ArrayList <Cancion>listaCanciones ;

    public AlmacenMusica() {
        this.listaCanciones =  new ArrayList<Cancion>();
    }

    public static void addCancion(Cancion cancion){
        listaCanciones.add(cancion);
        System.out.println("Canción añadida: " + cancion);
    }

    public static void deleteCancion(Cancion cancion){
        listaCanciones.remove(cancion);
        System.out.println("Canción borrada: " + cancion);
    }

    public static void imprimirCancion(){
        for (Cancion cancion :listaCanciones
             ) {
            System.out.println(cancion.toString());
        }
    }


    //public static void agregarSong(Song song){
    // if(primero == null){
    //      primero = song;
    // }else{
    //      Song temp = primero;
    //      while(temp.next!=null){
    //          temp = temp.next;
    //      }
    //      temp.next = song;
    // }
    //}


    //public static void imprimir(){
    //Song temp = primero;
    //while(temp!=null){
    //      System.out.println(temp.toString());
    //      temp = temp.next;
    //}
    // }
}
