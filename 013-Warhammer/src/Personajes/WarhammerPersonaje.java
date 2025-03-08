package Personajes;

import Armas.Arma;

import java.util.HashMap;


public abstract class WarhammerPersonaje implements ICombate {
    protected String nombre;
    private int energia;
    public HashMap<String, Arma> armas;
    private static int contPersonajes;
    private final int ENERGIA_MAX = 200;

    public WarhammerPersonaje(String nombre) {
        this.nombre = nombre;
        contPersonajes++;
        this.armas = new HashMap<>();
    }
    public void sumarEnergia(){
        if (energia<ENERGIA_MAX){
            energia+=10;
            System.out.println("Energía añadida"+energia);
        }else {
            System.out.println("La energía supera la energía Max: "+ ENERGIA_MAX);
        }
    }
    public static void toNumPersonajes(){
        System.out.println("Has creado "+ contPersonajes+" personajes");
    }
    public String imprimirArmas(){
        String resultado = "";
        for (String tipo : armas.keySet()) {
            Arma arma = armas.get(tipo);
            resultado += tipo + ": " + arma + ": " + "\n";
        }
        return resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public HashMap<String, Arma> getArmas() {
        return armas;
    }

    public static int getContPersonajes() {
        return contPersonajes;
    }

    public static void setContPersonajes(int contPersonajes) {
        WarhammerPersonaje.contPersonajes = contPersonajes;
    }

    public int getENERGIA_MAX() {
        return ENERGIA_MAX;
    }

    @Override
    public String toString() {
        return "WarhammerPersonaje{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", armas=" + armas +
                ", ENERGIA_MAX=" + ENERGIA_MAX +
                '}';
    }
}
