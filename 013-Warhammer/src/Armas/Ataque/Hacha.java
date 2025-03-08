package Armas.Ataque;

import Armas.Arma;
import Armas.Defensa.Escudo;
import Personajes.WarhammerPersonaje;

public class Hacha extends ArmaAtaque{
    private final int VIDA_CONSUMIDA = 5;
    public Hacha(String nombre) {
        super(nombre);
    }

    public int getVIDA_CONSUMIDA() {
        return VIDA_CONSUMIDA;
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);
        if (victima.armas.containsKey("Defensa")) {
            Arma armaDefensa = victima.armas.get("Defensa");
            if (armaDefensa instanceof Escudo) {
                System.out.println("|SE DEFIENDE| porque tiene un escudo → [" + victima + "]");
            }
        }
    }

    @Override
    public String toString() {
        return "Hacha{" +
                "VIDA_CONSUMIDA=" + VIDA_CONSUMIDA +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
