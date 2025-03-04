package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public abstract class Enano extends WarhammerPersonaje{
    //private String nombre;
    private int riqueza;
    protected int nivel;
    private static int contEnanos;

    public Enano(String nombre, int riqueza) {
        super(nombre);
        this.riqueza= riqueza;
    }

    public static int getContPielesVerdes() {
        return 0;
    }
    public void addArmaAtaque(ArmaAtaque arma){

    }
    public void addArmaDefensa(ArmaDefensa arma){

    }
    public String imprimirArmas(){
        //Recorrer HASH MAP, y preparar cadena
        return "";
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void defender(ArmaAtaque arma) {
        super.defender(arma);
    }

    @Override
    public String toString() {
        return "Enano{" +
                "riqueza=" + riqueza +
                ", nivel=" + nivel +
                '}';
    }
}
