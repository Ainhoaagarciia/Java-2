package org.example;

import java.util.ArrayList;

public class Genero {

    private int idGenero;
    private String titulo;
    ArrayList<Pelicula> lsGeneros;

    public Genero(int idGenero, String titulo) {
        this.idGenero = idGenero;
        this.titulo = titulo;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Pelicula> getLsGeneros() {
        return lsGeneros;
    }

    public void setLsGeneros(ArrayList<Pelicula> lsGeneros) {
        this.lsGeneros = lsGeneros;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + idGenero +
                ", titulo='" + titulo + '\'' +
                ", lsGeneros=" + lsGeneros +
                '}';
    }
}
