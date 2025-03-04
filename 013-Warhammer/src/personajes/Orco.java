package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

import java.util.ArrayList;

public class Orco extends PielVerde {
    private ArrayList<Goblin> listaGoblin;

    public Orco(String nombre, String puebloNacimiento) {
        super(nombre, puebloNacimiento);
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {

    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {

    }

    public void sumarEnergia(){

    }
    public void addGoblin(Goblin goblin){

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
        return "Orco{" +
                "listaGoblin=" + listaGoblin +
                ", nivel=" + nivel +
                '}';
    }
}
