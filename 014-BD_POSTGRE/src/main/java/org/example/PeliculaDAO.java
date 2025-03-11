package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PeliculaDAO implements DAO{


    @Override
    public void add(Pelicula pelicula) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Pelicula pelicula) {

    }

    @Override
    public void find(int id) throws SQLException {
        ConexionPostGre conex = Singleton.getInstance();
        Connection conn = conex.getConnection();
        Statement st = null;
        ResultSet lstDatos = null;

        try {
            st = conn.createStatement();
            String query = "SELECT * FROM PELICULAS1 WHERE id = " + id;
            lstDatos = st.executeQuery(query);

            if (lstDatos.next()) {
                System.out.println("Película encontrada: " + lstDatos.getString("titulo"));
            } else {
                System.out.println("Película no encontrada con id: " + id);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void findAll() {

    }
}
