package personajes;


public class Charmander extends PokemonFuego {
    public Charmander(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public void atacar(Pokemon pokemonEnemigo) {
        System.out.println("Llamarada golpea a Squirtle con una gran llamarada");
        System.out.println("Squirtle recibe 50 resiste al ataque");
        System.out.println("Energía restante "+getEnergia());
        if(super.arma!=null){
            super.atacar(pokemonEnemigo);
        }
    }



    @Override
    public void defender(int daño) {
        super.defender(daño);
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
