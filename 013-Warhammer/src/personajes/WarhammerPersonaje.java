package personajes;

import armas.ArmaAtaque;
import interfaces.ICombate;

import java.util.HashMap;

public abstract class WarhammerPersonaje implements ICombate {

    private String nombre;
    private int energia;

    //protected HashMap<String, Arma> armas;
    private static int contPersonajes;
    private static final int ENERGIA_MAX = 200;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
    }
    public void sumarEnergia(){

    }
    public static void toNumPersonajes(){ //Existen cargados en memoria, fuera de la instancia, sin hacer el new en main
        System.out.println("");
        //return int
    }
    public String imprimirArmas(){
        return "";
    }

    @Override
    public  void atacar(WarhammerPersonaje victima) {

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                '}';
    }
}
