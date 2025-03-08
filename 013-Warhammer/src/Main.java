import Armas.Ataque.Arco;
import Armas.Ataque.Hacha;
import Armas.Ataque.Martillo;
import Armas.Ataque.Rebanadora;
import Armas.Defensa.Armadura;
import Armas.Defensa.Casco;
import Armas.Defensa.Escudo;
import Personajes.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Creamos 2 goblins y 2 martilladores
        Goblin goblin1 = new Goblin("Ñoñin", "Arbol",20);
        Goblin goblin2 = new Goblin("Ñoño", "Tierra",20);

        Martillador martillador1 = new Martillador("Sanchopanza",1000);
        Martillador martillador2 = new Martillador("Cervantes",1000);

        //Los añadimos a su arraylist
        goblin1.addGoblin(goblin1);
        goblin2.addGoblin(goblin2);

        martillador1.addMartillador(martillador1);
        martillador2.addMartillador(martillador2);

        //Añadir 2 armas a Goblin
        System.out.println();
        System.out.println("Añadiendo armas a personajes:");
        Random aleatorio = new Random();
        int aleArma= aleatorio.nextInt(2);
        if (aleArma==1){
            Arco arco1 = new Arco("Arco Legendario");
            goblin1.addArmaAtaque(arco1);
            goblin2.addArmaAtaque(arco1);
        }else {
            Rebanadora rebanadora1 = new Rebanadora("Rebañadora");
            goblin1.addArmaAtaque(rebanadora1);
            goblin2.addArmaAtaque(rebanadora1);
        }

        if (aleArma==1){
            Armadura armadura1 = new Armadura("Armadura de oro");
            goblin1.addArmaDefensa(armadura1);
            goblin2.addArmaDefensa(armadura1);
        }else {
            Escudo escudo1 = new Escudo("Escudo de plata");
            goblin1.addArmaDefensa(escudo1);
            goblin2.addArmaDefensa(escudo1);
        }

        //Añadir 2 armas a Martillador
        int aleArmaMart = aleatorio.nextInt(2);
        if (aleArmaMart==1){
            Hacha hacha1 = new Hacha("Hacha Legendario");
            martillador1.addArmaAtaque(hacha1);
            martillador2.addArmaAtaque(hacha1);
        }else {
            Martillo martillo1 = new Martillo("Martillo de piedra");
            martillador1.addArmaAtaque(martillo1);
            martillador2.addArmaAtaque(martillo1);
        }

        if (aleArmaMart==1){
            Casco casco1 = new Casco("Casco de bronce");
            martillador1.addArmaDefensa(casco1);
            martillador2.addArmaDefensa(casco1);
        }else {
            Armadura armadura1= new Armadura("Armadura de acero");
            martillador1.addArmaDefensa(armadura1);
            martillador2.addArmaDefensa(armadura1);
        }

        //Imprimimos la lista
        goblin1.getListaGoblin();
        goblin2.getListaGoblin();
        martillador1.getListaMartilladores();
        martillador2.getListaMartilladores();

        System.out.println();

        //Nº de personajes
        WarhammerPersonaje.toNumPersonajes();


        /*--------------------------NOTA 3 A 5:----------------------*/
        System.out.println();
        //Creamos 2 Orcos y 2 Rompehierros
        Orco orco1 = new Orco("Shrek", "Cueva",40);
        Orco orco2 = new Orco("Duki", "Belchite",40);

        Rompehierro rompehierro1 = new Rompehierro("Destrozapelotas",2000);
        Rompehierro rompehierro2 = new Rompehierro("Destrozamongolos",2000);

        //Los añadimos a su arraylist
        orco1.addPielVerde(orco1);
        orco1.addPielVerde(orco2);

        rompehierro1.addEnano(rompehierro1);
        rompehierro2.addEnano(rompehierro2);

        //Añadir 2 armas a Orco
        System.out.println();
        System.out.println("Añadiendo armas a personajes:");

        int aleArmaOrco= aleatorio.nextInt(2);
        if (aleArmaOrco==1){
            Arco arco2 = new Arco("Arco Deforme");
            orco1.addArmaAtaque(arco2);
            orco2.addArmaAtaque(arco2);
        }else {
            Rebanadora rebanadora2 = new Rebanadora("Rebanadora cutre");
            orco1.addArmaAtaque(rebanadora2);
            orco2.addArmaAtaque(rebanadora2);
        }

        if (aleArmaOrco==1){
            Armadura armadura2 = new Armadura("Armadura de plastico");
            orco1.addArmaDefensa(armadura2);
            orco2.addArmaDefensa(armadura2);
        }else {
            Escudo escudo2 = new Escudo("Escudo de oro");
            orco1.addArmaDefensa(escudo2);
            orco2.addArmaDefensa(escudo2);
        }

        //Añadir 2 armas a Rompehierro
        int aleArmaRompehierro = aleatorio.nextInt(2);
        if (aleArmaRompehierro==1){
            Hacha hacha2 = new Hacha("Hacha Oxidada");
            rompehierro1.addArmaAtaque(hacha2);
            rompehierro2.addArmaAtaque(hacha2);
        }else {
            Martillo martillo2 = new Martillo("Martillo de papel");
            rompehierro1.addArmaAtaque(martillo2);
            rompehierro2.addArmaAtaque(martillo2);
        }

        if (aleArmaRompehierro==1){
            Casco casco2 = new Casco("Casco de plastico");
            rompehierro1.addArmaDefensa(casco2);
            rompehierro2.addArmaDefensa(casco2);
        }else {
            Armadura armadura3= new Armadura("Armadura de plata");
            rompehierro1.addArmaDefensa(armadura3);
            rompehierro2.addArmaDefensa(armadura3);
        }

        orco1.getListaPielVerde();
        orco2.getListaPielVerde();
        rompehierro1.getListaEnanos();
        rompehierro2.getListaEnanos();

        System.out.println();

        Arco arco4 = new Arco("Arco Pro Max");
        Martillo martillo3 = new Martillo("Martillo bueno");
        Casco casco3 = new Casco("Casco cutre");
        Escudo escudo3 = new Escudo("Escudo decente");
        Armadura armadura3 = new Armadura("Armadura de cristal");
        Hacha hacha3 = new Hacha("Hacha reluciente");

        //Rompehierros ataca a goblin
        rompehierro1.addArmaAtaque(martillo3);
        martillo3.atacar(goblin1);
        System.out.println();

        //Ataque con arco varias veces

        orco1.addArmaAtaque(arco4);
        arco4.atacar(martillador1);
        arco4.atacar(martillador1);
        martillador1.defender(arco4);
        System.out.println();

        //Ataque con arco a alguien que tenga casco
        goblin2.addArmaAtaque(arco4);
        rompehierro1.addArmaDefensa(casco3);
        arco4.atacar(rompehierro1);
        rompehierro1.defender(arco4);
        System.out.println();

        //Ataque con martillo a alguien que tenga Escudo

        martillador2.addArmaAtaque(martillo3);
        orco2.addArmaDefensa(escudo3);
        martillo3.atacar(orco2);
        orco2.defender(martillo3);
        System.out.println();

        //Dos ataques (uno con cada arma) contra alguien que tenga armadura
        orco1.addArmaAtaque(arco4);
        martillador2.addArmaAtaque(martillo3);
        rompehierro1.addArmaDefensa(armadura3);
        arco4.atacar(rompehierro1);
        martillo3.atacar(rompehierro1);
        rompehierro1.defender(arco4);
        rompehierro1.defender(martillo3);

        System.out.println();
        goblin1.addArmaDefensa(escudo3);
        hacha3.atacar(goblin1);
        
        System.out.println();
        //Nº de personajes
        WarhammerPersonaje.toNumPersonajes();
    }
}