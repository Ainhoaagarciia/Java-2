package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionPostGre {
    private final Connection conn;

    private static final String URL = "jdbc:postgresql://netflix-1.cknylvg9zp2l.us-east-1.rds.amazonaws.com/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "12345678";

    public ConexionPostGre() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión establecida a PostgreSQL.");
        } catch (SQLException e) {
            throw new RuntimeException("❌ Error de conexión", e);
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
