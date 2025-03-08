package Personajes;

import Armas.Ataque.ArmaAtaque;
import Armas.Defensa.ArmaDefensa;

import java.util.ArrayList;

public class Martillador extends Enano{

    ArrayList<Martillador>listaMartilladores;

    public Martillador(String nombre, int riqueza) {
        super(nombre, riqueza);
        listaMartilladores = new ArrayList<>();
    }

    public ArrayList<Martillador> getListaMartilladores() {
        for (Martillador martillador: listaMartilladores){
            System.out.println(martillador);
        }
        return listaMartilladores;
    }

    public void addMartillador(Martillador martillador){
        listaMartilladores.add(martillador);
        System.out.println("Se añadió: "+ martillador);
    }

    public void sumarEnergia(){
        super.sumarEnergia();
    }
    public void addArmaAtaque(ArmaAtaque arma){
        super.addArmaAtaque(arma);
    }
    public void addArmaDefensa(ArmaDefensa arma){
        super.addArmaDefensa(arma);
    }

    @Override
    public void atacar(WarhammerPersonaje victima) {
        System.out.println("Atacando a "+victima);
    }
    public void atacar(PielVerde victima){
        System.out.println("Atacando a "+victima);

    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    @Override
    public String toString() {
        return "Martillador{" +
                "armas=" + armas +
                ", nombre='" + nombre +
                ", riqueza=" + riqueza +
                '}';
    }
}
