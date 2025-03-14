package personajes;

public class Charizard extends PokemonFuego{
    public Charizard(String nombre, int nivel, int energia) {
        super(nombre, nivel, energia);
    }

    @Override
    public Pokemon evolucionar() {
        return null;
    }

    @Override
    public Pokemon involucionar() {
        System.out.println("Charizard está involucionando");
        return new Charmeleon("Ahora soy un charmeleon", 20, 100);
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
