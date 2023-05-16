package com.alura.jdbc.factory;
import java.sql.Connection;
import java.sql.SQLException;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    private ComboPooledDataSource dataSource;
    public ConnectionFactory(){
        var pooledDataSource =  new ComboPooledDataSource();
        pooledDataSource.setJdbcUrl(
            "jdbc:mysql://localhost/control_de_stock?useTimeZone=true&serverTimeZone=UTC");
        pooledDataSource.setUser("root");
        pooledDataSource.setPassword("SassyJ*1806");
        pooledDataSource.setMaxPoolSize(10);
        this.dataSource = pooledDataSource;
    }
    public Connection recuperarConnection() throws SQLException{
        return this.dataSource.getConnection();
    }
}
