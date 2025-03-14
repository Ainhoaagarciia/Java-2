package org.example;

import java.util.ArrayList;

public interface CursosAdapter extends CursosRepository{
    ArrayList<Cursos> obtenerPorTipo(String title);
}
