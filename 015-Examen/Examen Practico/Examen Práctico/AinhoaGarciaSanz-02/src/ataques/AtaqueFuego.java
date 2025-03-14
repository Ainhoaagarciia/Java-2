package ataques;

import personajes.Pokemon;

public class AtaqueFuego implements EstrategiaAtaque {
    @Override
    public void atacar(Pokemon enemigo) {
        System.out.println("Ataque de Fuego impacta a " + enemigo.getNombre() + "!");
        enemigo.defender(25);
    }
}
