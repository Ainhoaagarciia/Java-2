package Armas.Defensa;

import Armas.Ataque.Arco;
import Armas.Ataque.ArmaAtaque;
import Armas.Ataque.Martillo;
import Personajes.WarhammerPersonaje;

public class Escudo extends ArmaDefensa {
    private final int VIDA_DEFENDIDA = 2;
    public Escudo(String nombre) {
        super(nombre);
    }

    public int getVIDA_DEFENDIDA() {
        return VIDA_DEFENDIDA;
    }

    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante){

    }

    @Override
    public String toString() {
        return "Escudo{" +
                "VIDA_DEFENDIDA=" + VIDA_DEFENDIDA +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
