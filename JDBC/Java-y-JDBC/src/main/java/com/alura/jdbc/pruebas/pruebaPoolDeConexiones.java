package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class pruebaPoolDeConexiones {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory connectionFactory = new ConnectionFactory();

        for (int i = 0; i<20;i++){
            Connection con = connectionFactory.recuperarConnection();
            System.out.println("Abriendo la conexion de " + (i +1 ));
        }
    }
}