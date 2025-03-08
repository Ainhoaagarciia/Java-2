package Armas.Ataque;

import Armas.Arma;
import Armas.Defensa.Casco;
import Personajes.WarhammerPersonaje;

import java.util.Random;

public class Arco extends ArmaAtaque{
    private final int VIDA_CONSUMIDA = 3;
    public Arco(String nombre) {
        super(nombre);
    }

    public int getVIDA_CONSUMIDA() {
        return VIDA_CONSUMIDA;
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        super.atacar(victima);

        Random aleatorio = new Random();
        int ale = aleatorio.nextInt(2);
        if (ale==1){
            if (victima.armas.containsKey("Defensa")){
                Arma armaDefensa = victima.armas.get("Defensa");
                if (armaDefensa instanceof Casco) {
                    System.out.println("|SE DEFIENDE| -- La flecha impacta contra el casco y no le causara Daño → [" + victima + "]");
                }else {
                    System.out.println("La flecha ha acertado");
                }
            }else {
                System.out.println("La flecha ha acertado");
            }
        }else {
            System.out.println("La flecha ha fallado");
        }
    }

    @Override
    public void atacar(WarhammerPersonaje victima, boolean esAtaqueEmperador) {
        super.atacar(victima, esAtaqueEmperador);
    }

    @Override
    public String toString() {
        return "Arco{" +
                "VIDA_CONSUMIDA=" + VIDA_CONSUMIDA +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
