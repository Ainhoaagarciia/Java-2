package armas;

import personajes.Pokemon;

public class ArmaFuego implements Arma {
    public static  String nombre;

    public ArmaFuego(String nombre) {
        this.nombre = nombre;
    }
    public String ArmaFuego(String nombre){
        return nombre;
    }

    @Override
    public void atacar(Pokemon enemigo) {

    }

    public String getNombre() {
        return nombre;
    }

}
