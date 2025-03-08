package Armas.Defensa;

import Armas.Ataque.*;
import Personajes.WarhammerPersonaje;

public class Armadura extends ArmaDefensa {
    private final int VIDA_DEFENDIDA = 3;
    public Armadura(String nombre) {
        super(nombre);
    }

    public int getVIDA_DEFENDIDA() {
        return VIDA_DEFENDIDA;
    }

    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante){
        if (armaAtacante instanceof Arco || armaAtacante instanceof Hacha || armaAtacante instanceof Rebanadora || armaAtacante instanceof Martillo){
            System.out.println("|SE DEFIENDE| → [" + defendido + "]");
        }
    }

    @Override
    public String toString() {
        return "Armadura{" +
                "VIDA_DEFENDIDA=" + VIDA_DEFENDIDA +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
