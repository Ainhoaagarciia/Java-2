package personajes;

import armas.ArmaAtaque;
import armas.ArmaDefensa;

public class Martillador extends Enano{
    public Martillador(String nombre, int riqueza) {
        super(nombre, riqueza);
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
    }
    public void atacar(PielVerde victima){

    }

    @Override
    public void defender(ArmaAtaque armaAtacante) {
        super.defender(armaAtacante);
    }

    @Override
    public void addArmaAtaque(ArmaAtaque arma) {

    }

    @Override
    public void addArmaDefensa(ArmaDefensa arma) {

    }

    @Override
    public void sumarEnergia() {

    }

    @Override
    public String toString() {
        return "Martillador{" +
                "nivel=" + nivel +
                '}';
    }
}
