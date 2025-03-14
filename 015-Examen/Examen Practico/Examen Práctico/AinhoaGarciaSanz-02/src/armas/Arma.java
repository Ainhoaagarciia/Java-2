package armas;

import personajes.Pokemon;

public interface Arma {
    void atacar(Pokemon enemigo);
    String getNombre();

}
