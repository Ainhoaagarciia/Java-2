import ataques.AtaqueAgua;
import ataques.AtaqueFuego;
import personajes.*;

public class Main {
    public static void main(String[] args) {
        Pokemon charmander = new Charmander("Charmander", 5, 100);
        System.out.println(charmander);
        System.out.println("\n¡ Pokémon!\n");

        // Evolucionar, fíjate en la herencia
        Charmeleon charmeleon = (Charmeleon) charmander.evolucionar(); // Charmander -> Charmeleon
        System.out.println("Después de evolucionar:" + charmeleon.toString());
        Charizard charizard = (Charizard) charmeleon.evolucionar();

        //Charmeleon -> Charizard
        System.out.println("Después de evolucionar:" + charizard.toString());
        // Involucionar polimorfismo
        Charmeleon charmeleon1 = (Charmeleon) charizard.involucionar();
        // Charizard Charmeleon
        System.out.println("Después de involucionar: " + charmeleon1.toString());

        System.out.println();
        System.out.println("Pokemon SOLID");
        // Crear Pokémon
        Pokemon charmander2 = new Charmander("CHARMANDER",50,500);
        Pokemon squirtle = new Squirtle("SQUIRTLE", 20, 400);

        charmander2.setEstrategiaAtaque(new AtaqueFuego());
        charmander2.atacar(squirtle);
        squirtle.setEstrategiaAtaque(new AtaqueAgua());
        squirtle.atacar(charmander);
    }

}