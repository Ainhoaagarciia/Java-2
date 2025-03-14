package personajes;


public class Charizard extends PokemonFuego{
    public Charizard(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }


    @Override
    public String toString() {
        return "Charizard{" +
                "nombre='" + super.getNombre()+ '\'' +
                ", nivel=" + super.getNivel() +
                ", energia=" + super.getEnergia() +
                '}';
    }
}
