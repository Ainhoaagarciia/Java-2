package org.example;

import java.util.ArrayList;

public class Genero {

    private int idGenero;
    private String titulo;
    ArrayList<Pelicula> lsGeneros;

    public Genero(int idGenero, String titulo) {
        this.idGenero = idGenero;
        this.titulo = titulo;
        lsGeneros = new ArrayList<>();
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

    //AGREGAR, ELIMINAR Y LISTAR PELICULAS DESDE JAVA, NO DESDE LA BD

    public void agregarPelicula(Pelicula pelicula) {
        if (pelicula != null) {
            lsGeneros.add(pelicula);
        }
    }

    public void eliminarPelicula(Pelicula pelicula) {
        lsGeneros.remove(pelicula);
    }

    public void mostrarPeliculas() {
        System.out.println("Películas de género: " + this.titulo);
        if (lsGeneros != null ) {
            for (Pelicula pelicula : lsGeneros) {
                System.out.println(pelicula);
            }
        } else {
            System.out.println("No hay películas en este género.");
        }
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