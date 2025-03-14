package personajes;

public class Charmeleon extends PokemonFuego {

    public Charmeleon(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }


    @Override
    public String toString() {
        return "Charmeleon{" +
                "nombre='" + getNombre() + '\'' +
                ", nivel=" + getNivel() +
                ", energia=" + getEnergia() +
                '}';
    }
}
