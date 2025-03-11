package org.example;

import java.sql.SQLException;

public interface DAO {
    void add(Pelicula pelicula) throws SQLException;
    void delete(int id);
    void delete(String titulo);
    void update(Pelicula pelicula);
    void find(int id) throws SQLException;
    void findAll();

}
