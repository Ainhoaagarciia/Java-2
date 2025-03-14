package org.example;

public class Singleton {
    private static ConexionPostGre instance;

    private Singleton() {}

    public static ConexionPostGre getInstance() {
        if (instance == null) {
            instance = new ConexionPostGre();
        }
        return instance;
    }
}
