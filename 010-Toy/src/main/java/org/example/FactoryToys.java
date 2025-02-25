package org.example;

import pojo.Toy;
import pojo.Woody1;

public class FactoryToys {
    public static final String WOODY = "WOODY";
    public static final String BUZZ = "BUZZ";
    public static Toy getInstance(String tipoObjeto){
        switch (tipoObjeto){
            case WOODY:
                return new Woody1();
            case BUZZ:
                return new Woody1();
        }
        return null;
    }
}
