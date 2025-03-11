package org.example;

import java.sql.*;

public class PeliculaDAO implements DAO{

    @Override
    public void add(Pelicula pelicula)  {
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();

            String sql = "INSERT INTO PELICULAS1 (titulo, descripcion, anio, genero_id) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, pelicula.getTitulo());
            pst.setString(2, pelicula.getDescripcion());
            pst.setInt(3, pelicula.getAnio());
            pst.setInt(4, pelicula.getGenero().getId());  // Se usa el ID del género

            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("✅ Película añadida con éxito: " + pelicula.getTitulo() + " | " + pelicula.getDescripcion() + " | " + pelicula.getAnio()  );
            } else {
                System.out.println("No se pudo añadir la película.");
            }

            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException("❌ Error al insertar la película", e);
        }
    }

    @Override
    public void delete(int id) {
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();

            String sql = "DELETE FROM PELICULAS1 WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);

            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Película eliminada con éxito (ID: " + id + ")");
            } else {
                System.out.println("No se encontró una película con ID: " + id);
            }

            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException("❌ Error al eliminar la película", e);
        }
    }


    @Override
    public void delete(String titulo) {
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();

            String sql = "DELETE FROM PELICULAS1 WHERE titulo = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, titulo);

            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Película eliminada con éxito (ID: " + titulo + ")");
            } else {
                System.out.println("No se encontró una película con ID: " + titulo);
            }

            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException("❌ Error al eliminar la película", e);
        }

    }


    @Override
    public void update(Pelicula pelicula) {
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();

            String sql = "UPDATE PELICULAS1 SET titulo = ?, descripcion = ?, anio = ?, genero_id = ? WHERE id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, pelicula.getTitulo());
            pst.setString(2, pelicula.getDescripcion());
            pst.setInt(3, pelicula.getAnio());
            pst.setInt(4, pelicula.getGenero().getId());
            pst.setInt(5, pelicula.getId());

            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Película actualizada con éxito: " + pelicula.getTitulo());
            } else {
                System.out.println("No se encontró una película con ID: " + pelicula.getId());
            }

            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException("❌ Error al actualizar la película", e);
        }

    }

    @Override
    public void find(int id)  {
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();
            Statement st = conn.createStatement();
            ResultSet lstDatos = st.executeQuery("SELECT * FROM PELICULAS1 WHERE id = " + id);

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
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();

            String sql = "SELECT p.id, p.titulo, p.descripcion, p.anio, g.id AS genero_id, g.titulo AS genero_titulo " +
                    "FROM PELICULAS1 p " +
                    "INNER JOIN GENERO1 g ON p.genero_id = g.id";

            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            System.out.println("\n📜 Lista de todas las películas:");

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String descripcion = rs.getString("descripcion");
                int anio = rs.getInt("anio");
                int generoId = rs.getInt("genero_id");
                String generoTitulo = rs.getString("genero_titulo");

                Genero genero = new Genero(generoId, generoTitulo);
                Pelicula pelicula = new Pelicula(id, titulo, descripcion, anio, genero);

                System.out.println(pelicula);
            }

            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException("❌ Error al obtener todas las películas", e);
        }

    }
}
