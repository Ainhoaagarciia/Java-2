package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

import java.util.ArrayList;

public class Rompehierro extends Enano{
    private ArrayList<Enano> listaEnanos;
    public Rompehierro(String nombre, int riqueza) {
        super(nombre, riqueza);
    }

    public ArrayList<Enano> getListaEnanos() {
        return listaEnanos;
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {

    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {

    }

    public void sumarEnergia(){

    }
    public void addEnano(Enano enano){

    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }

    @Override
    public void defender(ArmaAtaque armaAtacante) {
        super.defender(armaAtacante);
    }

    @Override
    public String toString() {
        return "Rompehierro{" +
                "listaEnanos=" + listaEnanos +
                ", nivel=" + nivel +
                '}';
    }
}
