package personajes;


public class Squirtle extends PokemonAgua {
    public Squirtle(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public void atacar(Pokemon pokemonEnemigo) {
        System.out.println("Usando HidroBomba! Un chorro de agua golpea a Charmander");
        System.out.println("Charmander recibe 25 de daño!");
        System.out.println("Energía restante "+getEnergia());
    }

    @Override
    public void defender(int daño) {
        super.defender(daño);
    }





}
