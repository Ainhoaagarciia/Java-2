package armas;

import personajes.WarhammerPersonaje;

public class Casco extends ArmaDefensa {
    private final static int VIDA_DEFENDIDA = 2;


    public Casco(String nombre) {
        super(nombre);
    }
    public static int getVidaDefendida(){
        return VIDA_DEFENDIDA;
    }

   public void defender(WarhammerPersonaje defendido, ArmaAtaque armaAtacante){

   }

    @Override
    public String toString() {
        return "Casco{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
