package Personajes;

import Armas.Ataque.ArmaAtaque;

public interface ICombate {
    void atacar(WarhammerPersonaje victima);
    void defender(ArmaAtaque arma);
}
