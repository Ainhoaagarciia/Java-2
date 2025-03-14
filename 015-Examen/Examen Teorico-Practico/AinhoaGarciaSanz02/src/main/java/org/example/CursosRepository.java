package org.example;
import java.util.ArrayList;

public interface CursosRepository {
    ArrayList<Cursos>cursos = new ArrayList<>();
    void insertar (Cursos cursos);
    ArrayList<Cursos>obtenerTodas();
    Cursos obtenerporId(int id);
    void actualizar(Cursos cursos);
    void eliminar(int id);

}
