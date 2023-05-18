package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaConexion {

    public static void main(String[] args) throws SQLException {
        Connection con = new ConnectionFactory().recuperarConnection();

        System.out.println("Cerrando la conexión");

        con.close();
    }

}
