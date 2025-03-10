package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Main
{
    private static Connection conn;
    private static Statement st;

    public static final String URLPostgre = "jdbc:postgresql://netflix-1.cknylvg9zp2l.us-east-1.rds.amazonaws.com/postgres";
    public static final String USERPostgre= "postgres";
    public static final String PASSPostgre = "12345678";

    public static void connect() {
        Properties properties = new Properties();
        properties.setProperty("url", URLPostgre);
        properties.setProperty("user", USERPostgre);
        properties.setProperty("password", PASSPostgre);
        properties.setProperty("ssl", "false");
        try{
            conn = DriverManager.getConnection(URLPostgre,properties);
            if(conn != null){
                System.out.println("Conectado a base de datos");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
    public static void main( String[] args ) {

        // 📌 Lista donde guardaremos las películas con sus géneros
        ArrayList<Pelicula> peliculas = new ArrayList<>();
        try {
            // 🔗 Conectar a MySQL y hacer el JOIN
            connect();
            System.out.println("✅ Conexión exitosa a MySQL!");

            st = conn.createStatement();

            // 📌 Consulta con JOIN entre películas y género
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

            // 📌 Procesar los resultados
            while (rs.next()) {
                int id = rs.getInt("pelicula_id");
                String titulo = rs.getString("pelicula_titulo");
                String descripcion = rs.getString("pelicula_descripcion");
                int anio = rs.getInt("pelicula_anio");
                int idGenero = rs.getInt("genero_id");
                String tituloGenero = rs.getString("genero_titulo");

                Genero genero = new Genero(idGenero, tituloGenero);

                // 📌 Crear el objeto Pelicula y agregarlo a la lista
                Pelicula pelicula = new Pelicula(id, titulo, descripcion, anio, genero);
                peliculas.add(pelicula);
            }
            // 📌 Mostrar los resultados almacenados en el ArrayList
            System.out.println("\n🎬 Lista de Películas con Géneros:");
            for (Pelicula p : peliculas) {
                System.out.println(p);
            }

            System.out.println();
            //FILTRAR POR GENERO DESDE JAVA
            System.out.println("Para hacer un filtrar por genero pero desde java");

            // Crear géneros
            Genero accion = new Genero(1, "Acción");
            Genero comedia = new Genero(2, "Comedia");

            // Crear películas
            Pelicula peli1 = new Pelicula(101, "Mad Max: Fury Road", "George Miller", 2015, accion);
            Pelicula peli2 = new Pelicula(102, "Deadpool", "Tim Miller", 2016, comedia);

            accion.eliminarPelicula(peli1);

            // Agregar películas a su género correspondiente
            accion.agregarPelicula(peli1);
            comedia.agregarPelicula(peli2);

            // Imprimir resultados
            System.out.println(accion);
            System.out.println(comedia);
            accion.mostrarPeliculas();
            System.out.println();

            //FILTRAR POR GENERO DESDE BD
            System.out.println("Para filtrar desde la BD Postgre");

            String generoBuscado = "Comedia";  // Cambia este valor para buscar otro género
            System.out.println("\n🎬 Lista de Películas del género '" + generoBuscado + "':");
            for (Pelicula p : peliculas) {
                if (p.getGenero().getTitulo().equals(generoBuscado)) {
                    System.out.println(p);
                }
            }

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}