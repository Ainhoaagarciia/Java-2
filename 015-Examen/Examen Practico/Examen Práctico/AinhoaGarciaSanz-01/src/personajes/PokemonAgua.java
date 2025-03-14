package personajes;

public abstract class PokemonAgua extends Pokemon {
    private String tipo = "Agua";
    public PokemonAgua(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }
    @Override
    public String toString() {
        return "PokemonAgua{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
