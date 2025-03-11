package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class Main {

    private static Connection conn;
    private static Statement st;

    public static final String URLPostgre = "jdbc:postgresql://netflix-1.cknylvg9zp2l.us-east-1.rds.amazonaws.com/postgres";
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
            System.out.println("Peliculas filtradas por genero: "+generoBuscado);
            for (Pelicula p: peliculas){
                if (p.getGenero().getTitulo().equals(generoBuscado)){
                    System.out.println(p);
                }
            }

            String tituloBuscado = "Matrix";
            System.out.println("Busqueda por titulo: "+tituloBuscado);
            for (Pelicula p: peliculas){
                if (p.getTitulo().equals(tituloBuscado)){
                    System.out.println(p);
                }
            }

            //Buscar pelicula por ID
            PeliculaDAO peliculaDAO = new PeliculaDAO();
            System.out.println();
            System.out.println("Buscando película con ID 2...");
            peliculaDAO.find(4);

            //Añadir peliculas desde BD
            System.out.println();
            System.out.println("Añadiendo peliculas desde BD:");

            Genero generoAccion = new Genero(1, "Acción");  // Asumiendo que el género ya existe en la BD
            Pelicula nuevaPelicula = new Pelicula(0, "John Wick", "Chad Stahelski", 2014, generoAccion);
            Pelicula nuevaPelicula1 = new Pelicula(1, "Pepe Perez", "Interesante", 2012, generoAccion);
            Pelicula nuevaPelicula2 = new Pelicula(2, "La La Land", "Interesante", 2012, generoAccion);

            if (!peliculaDAO.equals(nuevaPelicula)) {
                peliculaDAO.add(nuevaPelicula2);
            } else {
                System.out.println("la pelicula ya existe");
            }

            System.out.println();
            System.out.println("Eliminando pelicula desde BD por titulo:");
            //Eliminar una pelicula:
            peliculaDAO.delete("John Wick");  // Elimina la película con ese titulo
            peliculaDAO.delete("Pepe Perez");

            //Eliminar pelicula por id:
            System.out.println("Eliminando pelicula desde BD por id");
            peliculaDAO.delete(1000);

            System.out.println();
            System.out.println("Actualizando pelicula desde BD:");
            //Actualizar una pelicula:
            Genero nuevoGenero = new Genero(2, "Ciencia Ficción");  // Género debe existir en la BD
            Pelicula peliculaActualizada = new Pelicula(1, "Interestelar", "Christopher Nolan", 2014, nuevoGenero);

            peliculaDAO.update(peliculaActualizada);

            //Listar Peliculas
            peliculaDAO.findAll();

        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}