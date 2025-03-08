package Personajes;

import Armas.Ataque.ArmaAtaque;
import Armas.Defensa.ArmaDefensa;

import java.util.ArrayList;

public class Orco extends PielVerde {

    private final ArrayList<PielVerde>listaPielVerde;

    public Orco(String nombre, String puebloNacimiento, int nivel) {
        super(nombre, puebloNacimiento);
        this.nivel = nivel;
        listaPielVerde = new ArrayList<>();
    }
    public ArrayList<PielVerde>getListaPielVerde(){
        for (PielVerde pielVerde: listaPielVerde){
            System.out.println(pielVerde);
        }
        return listaPielVerde;
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
    public void addPielVerde(PielVerde pielVerde){
        listaPielVerde.add(pielVerde);
        System.out.println("Se añadió: "+pielVerde);
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
        return "Orco{" +
                "armas=" + armas + '\'' +
                ", nombre='" + nombre +
                ", nivel=" + nivel +
                ", puebloNacimiento='" + puebloNacimiento + '\'' +
                '}';
    }
}
