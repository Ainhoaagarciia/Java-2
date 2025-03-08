package Armas.Defensa;

import Armas.Ataque.ArmaAtaque;
import Personajes.WarhammerPersonaje;

public interface IArmamentoDefensa {
    void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante);
}
