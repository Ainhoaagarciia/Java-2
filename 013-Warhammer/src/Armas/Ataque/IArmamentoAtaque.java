package Armas.Ataque;

import Personajes.WarhammerPersonaje;

public interface IArmamentoAtaque {
    void atacar(WarhammerPersonaje victima);
    void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador);
}
