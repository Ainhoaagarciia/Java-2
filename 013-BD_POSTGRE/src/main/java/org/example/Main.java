package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Main {

    private static Connection conn;
    private static Statement st;

    public static final String URLPostgre = "jdbc:postgresql://127.0.0.1:5432/postgres";
    public static final String USERPostgre = "postgres";
    public static final String PSSWORDPostgre = "12345678";

    public static void connect(){
        Properties properties = new Properties();
        properties.setProperty("url",URLPostgre);
        properties.setProperty("user",USERPostgre);
        properties.setProperty("password",PSSWORDPostgre);
        properties.setProperty("ssl","false");
        try {
            conn = DriverManager.getConnection(URLPostgre,properties);
            if (conn!=null){
                System.out.println("Conectado a BD");
            }else {
                System.out.println("No conectado a BD");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {
        ArrayList<Pelicula>peliculas = new ArrayList<>();
        try {
            connect();
            st= conn.createStatement();
            String query = "SELECT \n" +
                    "    p.id AS pelicula_id,\n" +
                    "    p.titulo AS pelicula_titulo,\n" +
                    "    p.descripcion AS pelicula_descripcion,\n" +
                    "    p.anio AS pelicula_anio,\n" +
                    "    g.id AS genero_id,\n" +
                    "    g.titulo AS genero_titulo\n" +  // Traemos id y titulo del genero
                    "FROM \n" +
                    "    peliculas1 p\n" +
                    "INNER JOIN \n" +
                    "    genero1 g\n" +
                    "ON \n" +
                    "    p.genero_id = g.id;";

            ResultSet rs = st.executeQuery(query);
            while (rs.next()){

                int id = rs.getInt("pelicula_id");
                String titulo = rs.getString("pelicula_titulo");
                String descripcion = rs.getString("pelicula_descripcion");
                int anio = rs.getInt("pelicula_anio");
                int idGenero = rs.getInt("genero_id");
                String tituloGenero = rs.getString("genero_titulo");

                Genero genero = new Genero(idGenero, tituloGenero);
                Pelicula pelicula = new Pelicula(id, titulo, descripcion, anio, genero);
                peliculas.add(pelicula);
            }
            System.out.println("Lista de peliculas:");
            for (Pelicula p: peliculas) {
                System.out.println(p);
            }
            System.out.println();

            //Para filtrar desde la BD Postgre
            String generoBuscado = "Comedia";
            System.out.println("Peliculas con genero: "+generoBuscado);
            for (Pelicula p: peliculas){
                if (p.getGenero().getTitulo().equals(generoBuscado)){
                    System.out.println(p);
                }
            }

            String tituloBuscado = "Matrix";
            System.out.println("Buscamos por titulo: "+tituloBuscado);
            for (Pelicula p: peliculas){
                if (p.getTitulo().equals(tituloBuscado)){
                    System.out.println(p);
                }
            }

            PeliculaDAO peliculaDAO = new PeliculaDAO();
            System.out.println();
            try {
                System.out.println("Buscando película con ID 1...");
                peliculaDAO.find(1);
            } catch (SQLException ex) {
                System.out.println("Error en la base de datos: " + ex.getMessage());
            }

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}