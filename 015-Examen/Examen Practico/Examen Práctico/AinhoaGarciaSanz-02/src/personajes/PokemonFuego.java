package personajes;

public abstract class PokemonFuego extends Pokemon{
    private String tipo = "Fuego";
    public PokemonFuego(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public String toString() {
        return "PokemonFuego{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
