package org.example;

import java.sql.*;
import java.util.ArrayList;

public class CursosDAO implements CursosRepository{
    @Override
    public void insertar(Cursos cursos) {
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();

            String sql = "INSERT INTO CURSOS (titulo, descripcion, id_tipo) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, cursos.getTitulo());
            pst.setString(2, cursos.getDescripcion());
            pst.setInt(3, cursos.getTipo().getId());

            int filasAfectadas = pst.executeUpdate();

            if (filasAfectadas > 0) {
                System.out.println("Curso añadido con éxito: " + cursos.getTitulo() + " | " + cursos.getDescripcion() + " | " + cursos.getTipo()  );
            } else {
                System.out.println("No se pudo añadir el curso");
            }

            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al insertar el curso", e);
        }

    }

    @Override
    public ArrayList<Cursos> obtenerTodas() {
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();

            String query = "SELECT \n" +
                    "    c.id AS curso_id,\n" +
                    "    c.titulo AS curso_titulo,\n" +
                    "    c.descripcion AS curso_descripcion,\n" +
                    "    t.id AS tipo_id,\n" +
                    "    t.titulo AS tipo_titulo\n" +
                    "FROM \n" +
                    "    cursos c\n" +
                    "INNER JOIN \n" +
                    "    tipos t\n" +
                    "ON \n" +
                    "    c.id_tipo = t.id;";

            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();

            System.out.println("\n Lista de todos los cursos:");

            while (rs.next()) {
                int id = rs.getInt("curso_id");
                String titulo = rs.getString("curso_titulo");
                String descripcion = rs.getString("curso_descripcion");
                int idTipo = rs.getInt("tipo_id");
                String tituloTipo = rs.getString("tipo_titulo");

                Tipos tipo = new Tipos(idTipo,tituloTipo);
                Cursos curso = new Cursos(id, titulo, descripcion, tipo);

                System.out.println(curso);
            }
            pst.close();
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener todas las películas", e);
        }
        return cursos;
    }

    @Override
    public ArrayList<Cursos> obtenerPorTipo(String titulo) {
        try {
            ConexionPostGre conex = Singleton.getInstance();
            Connection conn = conex.getConnection();
            Statement st = conn.createStatement();
            ResultSet lstDatos = st.executeQuery("SELECT * FROM CURSOS WHERE id_tipo LIKE " + titulo);

            if (lstDatos.next()) {
                System.out.println("Curso encontrado: " + lstDatos.getString("tipo_id"));
            } else {
                System.out.println("Curso no encontrado con titulo: " + titulo);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return cursos;
    }
}
