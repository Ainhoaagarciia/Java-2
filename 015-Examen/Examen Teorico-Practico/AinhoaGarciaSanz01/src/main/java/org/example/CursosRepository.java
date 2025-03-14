package org.example;
import java.util.ArrayList;

public interface CursosRepository {
    ArrayList<Cursos>cursos = new ArrayList<>();
    void insertar (Cursos cursos);
    ArrayList<Cursos>obtenerTodas();
    ArrayList<Cursos> obtenerPorTipo(String title);
}
