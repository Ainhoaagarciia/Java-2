import armas.HidroBomba;
import armas.Llamarada;
import personajes.Charmander;
import personajes.Pokemon;
import personajes.Squirtle;


public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Charmander("Charmander", 5, 100);
        Pokemon squirtle = new Squirtle("Squirtle", 8, 120);
        // Equipar armas y atacar
        charmander.equiparArma(new Llamarada(Llamarada.nombre)); // Charmander usa arma de fuego
        charmander.atacar(squirtle);
        squirtle.equiparArma(new HidroBomba(HidroBomba.nombre)); // Squirtle usa arma de agua
        squirtle.atacar(charmander);

    }
}