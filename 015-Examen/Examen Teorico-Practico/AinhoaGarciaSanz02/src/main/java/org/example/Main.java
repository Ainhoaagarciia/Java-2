package org.example;

import java.sql.*;
import java.util.Properties;

public class Main {

    private static Connection conn;
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
        try {
            connect();


            CursosDAO cursoDAO = new CursosDAO();
            cursoDAO.obtenerTodas();
            System.out.println();
            cursoDAO.obtenerporId(1);
            cursoDAO.obtenerPorTipo("Java");


        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
    }
}