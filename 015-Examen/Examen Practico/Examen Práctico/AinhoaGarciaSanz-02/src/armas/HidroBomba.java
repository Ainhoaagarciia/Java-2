package armas;

import personajes.Pokemon;

public class HidroBomba extends ArmaFuego {
    private int danyo = 50;

    public HidroBomba(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Pokemon enemigo) {
        super.atacar(enemigo);
    }
    @Override
    public String toString() {
        return ": HidroBomba";
    }
}
