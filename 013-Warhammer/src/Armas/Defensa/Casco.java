package Armas.Defensa;

import Armas.Arma;
import Armas.Ataque.Arco;
import Armas.Ataque.ArmaAtaque;
import Personajes.WarhammerPersonaje;

public class Casco extends ArmaDefensa {
    private final int VIDA_DEFENDIDA = 2;
    public Casco(String nombre) {
        super(nombre);
    }

    public int getVIDA_DEFENDIDA() {
        return VIDA_DEFENDIDA;
    }

    public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante){
        if (armaAtacante instanceof Arco){
            System.out.println("|SE DEFIENDE| -- La flecha impacta contra el casco y no le causara Daño → [" + defendido + "]");
        }
    }

    @Override
    public String toString() {
        return "Casco{" +
                "VIDA_DEFENDIDA=" + VIDA_DEFENDIDA +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
