package Personajes;

import Armas.Ataque.ArmaAtaque;
import Armas.Defensa.ArmaDefensa;

public abstract class Enano extends WarhammerPersonaje{

    protected int riqueza;
    protected int nivel;
    private static int contEnanos;

    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza = riqueza;
        contEnanos++;
    }
    public static int getContEnanos(){
        return contEnanos;
    }
    public void addArmaAtaque(ArmaAtaque arma){
        armas.put("Ataque",arma);
    }
    public void addArmaDefensa(ArmaDefensa arma){
        armas.put("Defensa",arma);
    }
    public String imprimirArmas(){
        return "";
    }

    @Override
    public String toString() {
        return "Enano{" +
                "nombre='" + nombre + '\'' +
                ", riqueza=" + riqueza +
                ", nivel=" + nivel +
                ", armas=" + armas +
                '}';
    }
}
