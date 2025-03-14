package personajes;

public class Charmeleon extends PokemonFuego {

    public Charmeleon(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public Pokemon evolucionar() {
        System.out.println("Charmeleon está evolucionando");
        return new Charizard("Ahora soy un charizard", 20, 100);
    }

    @Override
    public Pokemon involucionar() {
        return super.involucionar();
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
