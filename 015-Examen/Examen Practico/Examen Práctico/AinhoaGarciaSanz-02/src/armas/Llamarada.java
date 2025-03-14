package armas;

import personajes.Pokemon;

public class Llamarada extends ArmaFuego{
    private int danyo = 50;

    public Llamarada(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Pokemon enemigo) {
        super.atacar(enemigo);
    }

    @Override
    public String toString() {
        return ": Llamarada";
    }
}
