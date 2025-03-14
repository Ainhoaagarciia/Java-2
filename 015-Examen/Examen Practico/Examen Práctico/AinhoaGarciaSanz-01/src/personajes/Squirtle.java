package personajes;

import ataques.AtaqueAgua;
import ataques.AtaqueFuego;
import ataques.EstrategiaAtaque;

public class Squirtle extends PokemonAgua {
    public Squirtle(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public void atacar(Pokemon pokemonEnemigo) {
        System.out.println("Ataque de Agua golpea a CHARMANDER!" );
        System.out.println("CHARMANDER recibe 30 de daño!");
        System.out.println("Energía restante "+getEnergia());
    }

    @Override
    public void defender(int daño) {
        super.defender(daño);
    }

    @Override
    public void setEstrategiaAtaque(EstrategiaAtaque estrategia) {
        if (estrategia instanceof AtaqueAgua){
            System.out.println("SQUIRTLE usa Pistola de Agua contra CHARMANDER" );

        }
    }

    @Override
    public Pokemon evolucionar() {
        return super.evolucionar();
    }

    @Override
    public Pokemon involucionar() {
        return super.involucionar();
    }

}
