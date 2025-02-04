import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class AlmacenMusica implements IEstanteria{

    // Referencia al primer elemento de la lista enlazada

    ArrayList<Cancion> lstCanciones;
    HashMap<Integer,Cancion> hashMapCanciones;

    private Random aleatorio;

    /* public AlmacenMusica(ArrayList<Cancion> lstCanciones){
       this.lstCanciones = lstCanciones;
     } */

    public AlmacenMusica(){
        this.lstCanciones = new ArrayList<Cancion>();
        this.hashMapCanciones = new HashMap<>();
        this.aleatorio = new Random();
    }

    @Override
    public void addCancion(Cancion c) {
        if (c!=null){
            c.setId(aleatorio.nextInt(100)+1); //Simulando que es el ID AUTONUMÉRICO DE BD
            this.lstCanciones.add(c);
        }
    }

    @Override
    public void updateCancion(Cancion c) {
        if (c != null) { // Si la lista no está vacía
            int id = c.getId();
            for (Cancion cancion:this.lstCanciones
                 ) {
                if (cancion.getId() == id){
                    cancion.setTitulo(c.getTitulo());
                }
            }
        }
        else {
            System.out.println("La lista está vacía");
        }
    }

    public void addCancionHashmap(Cancion c){
        if (c!= null){
            c.setId(aleatorio.nextInt(100)+1);
            //ID AUTONUMÉRICO DE BD
            this.hashMapCanciones.
                    put(aleatorio.nextInt(100)+1,c);
        }
    }

    public Cancion getCancion(Cancion cancion){
        this.hashMapCanciones.get(cancion.getId());
        for (Cancion cancionTemporal:this.lstCanciones
             ) {
            if (cancion.getId() == cancionTemporal.getId()){
                System.out.println("ENCONTRADO");
                break;
            }
        }
        return cancion;
    }

    @Override
    public void deleteCancion(Cancion c) {
        lstCanciones.remove(c);
        System.out.println("Canción borrada: " + c);
    }

    @Override
    public void imprimir() {
        for (Cancion cancion:this.lstCanciones
             ) {
            System.out.println(cancion.toString());
        }
    }
}
