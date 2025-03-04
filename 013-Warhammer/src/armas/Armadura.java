package armas;

import personajes.WarhammerPersonaje;

public class Armadura extends ArmaDefensa {
    private final static int VIDA_DEFENDIDA = 3;


    public Armadura(String nombre) {
        super(nombre);
    }
    public static int getVidaDefendida(){
        return VIDA_DEFENDIDA;
    }

   public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante){

   }

    @Override
    public String toString() {
        return "Armadura{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
