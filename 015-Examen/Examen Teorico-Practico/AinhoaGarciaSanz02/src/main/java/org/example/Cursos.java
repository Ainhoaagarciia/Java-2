package org.example;

import java.util.ArrayList;

public class Cursos {
    private int id;
    private String titulo;
    private String descripcion;
    private Tipos tipo;

    protected ArrayList<Cursos> cursos = new ArrayList<>();

    public Cursos(int id, String titulo, String descripcion, Tipos tipo) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tipos getTipo() {
        return tipo;
    }

    public void setTipo(Tipos tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "🎬 ID: " + id + " | 🎥 " + titulo + " | 🎬 " + descripcion + " | "+ tipo.getTitulo() + " | ";
    }
}



