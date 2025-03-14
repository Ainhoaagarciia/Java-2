package personajes;

import ataques.AtaqueFuego;
import ataques.EstrategiaAtaque;

public class Charmander extends PokemonFuego {
    public Charmander(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public void atacar(Pokemon pokemonEnemigo) {
        System.out.println("Ataque de fuego impacta a SQUIRTLE!");
        System.out.println("SQUIRTLE recibe 25 resiste al ataque");
        System.out.println("Energía restante "+getEnergia());
        super.estrategiaAtaque.atacar(pokemonEnemigo);
    }

    @Override
    public void setEstrategiaAtaque(EstrategiaAtaque estrategia) {
        if (estrategia instanceof AtaqueFuego){
            System.out.println("CHARMANDER usa su estrategia de ataque contra SQUIRTLE" );
        }
    }

    @Override
    public void defender(int daño) {
        super.defender(daño);
    }

    @Override
    public Pokemon evolucionar() {
        System.out.println("Charmander está evolucionando");
        return new Charmeleon("Ahora soy un charmeleon" , 20, 100);
    }

    @Override
    public Pokemon involucionar() {
        return new Charmander("Ahora soy un charmander otra vez", 20, 100);
    }
    @Override
    public String toString() {
        return "Charmander{" +
                "nombre='" + super.getNombre() + '\'' +
                ", nivel=" + super.getNivel() +
                ", energia=" + super.getEnergia()+
                '}';
    }

}
