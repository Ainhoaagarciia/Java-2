package org.example;

import pojo.Toy;
import pojo.Woody;
import pojo.Woody1;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Toy toy1 = new Toy("buzz");
        // nunca nunca NUNCA podemos instanciar una clase abstracta
        //Toy woody1 = new Woody1("Woody1");
        Toy woody1 = FactoryToys.getInstance(FactoryToys.WOODY);
        Toy woody2 = new Woody1("Woody2");
        woody1.imprimirAtributos();
        woody2.imprimirAtributos();
        ArrayList<Toy> lstToys = new ArrayList<>();
        lstToys.add(woody1);
        lstToys.add(woody2);
        //vinculacion dinamica,
        //Polimorfismo
        }
    }

