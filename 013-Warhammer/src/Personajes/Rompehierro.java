package Personajes;

import Armas.Ataque.ArmaAtaque;
import Armas.Defensa.ArmaDefensa;

import java.util.ArrayList;

public class Rompehierro extends Enano{
    ArrayList<Enano>listaEnanos;

    public Rompehierro(String nombre, int riqueza) {
        super(nombre, riqueza);
        listaEnanos = new ArrayList<>();
    }

    public ArrayList<Enano>getListaEnanos(){
        for (Enano e: listaEnanos){
            System.out.println(e);
        }
        return listaEnanos;
    }
    public void addEnano(Enano enano){
        listaEnanos.add(enano);
        System.out.println("Se añadió: "+ enano);
    }

    public void addArmaAtaque(ArmaAtaque arma){
        super.addArmaAtaque(arma);
    }
    public void addArmaDefensa(ArmaDefensa arma){
        super.addArmaDefensa(arma);
    }
    public void sumarEnergia(){
        super.sumarEnergia();
    }



    @Override
    public void atacar(WarhammerPersonaje victima) {
        System.out.println("Atacando a "+victima);
    }

    @Override
    public void defender(ArmaAtaque arma) {

    }

    @Override
    public String toString() {
        return "Rompehierro{" +
                "armas=" + armas +
                ", nombre='" + nombre +
                ", riqueza=" + riqueza +
                '}';
    }
}
