package Personajes;

import Armas.Ataque.ArmaAtaque;
import Armas.Defensa.ArmaDefensa;

import java.util.ArrayList;

public class Goblin extends PielVerde {

    ArrayList<Goblin>listaGoblin;

    public Goblin(String nombre, String puebloNacimiento, int nivel) {
        super(nombre, puebloNacimiento);
        super.nivel = nivel;
        listaGoblin = new ArrayList<>();
    }

    public ArrayList<Goblin>getListaGoblin(){
        for (Goblin goblin: listaGoblin){
            System.out.println(goblin);
        }
        return listaGoblin;
    }

    public void addGoblin(Goblin goblin){
        listaGoblin.add(goblin);
        System.out.println("Se añadió: "+ goblin);
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
        System.out.println("Atacando a "+ victima);
    }

    @Override
    public void defender(ArmaAtaque arma) {

    }


    @Override
    public String toString() {
        return "Goblin{" +
                "armas=" + armas + '\'' +
                ", nombre='" + nombre +
                ", nivel=" + nivel +
                ", puebloNacimiento='" + puebloNacimiento + '\'' +
                '}';
    }
}
