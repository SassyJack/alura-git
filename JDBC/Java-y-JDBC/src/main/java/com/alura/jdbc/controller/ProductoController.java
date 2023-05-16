package com.alura.jdbc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

public class ProductoController {

	private Statement Statement;
	private ResultSet Result;

	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) throws SQLException {
		
		final Connection con =  new ConnectionFactory().recuperarConnection();
		try (con){
		final PreparedStatement statement = con.prepareStatement("UPDATE PRODUCTO SET "
		+ " NOMBRE = ?" + ", DESCRIPCION = ?"
		+ ", CANTIDAD = ?" 
		+ " WHERE ID = ?");
		try(statement){
		statement.setString(1, nombre);
		statement.setString(2, descripcion);
		statement.setInt(3, cantidad);
		statement.setInt(4, id);
		statement.execute();
	
		int updateCount = statement.getUpdateCount();
	
		return updateCount;
		
		}
	}
}
	public int eliminar(Integer id) throws SQLException {
		final Connection con = new ConnectionFactory().recuperarConnection();
		try (con){
			final PreparedStatement statement = con.prepareStatement("DELETE FROM PRODUCTO WHERE ID=?");
				try (statement){
				statement.setInt(1, id);
				statement.execute();
				return statement.getUpdateCount();
		}
	}
}

	public List<Map<String, String>> listar() throws SQLException {
			final Connection con = new ConnectionFactory().recuperarConnection();
			try(con){
            final PreparedStatement statement = con.prepareStatement("SELECT ID, NOMBRE, DESCRIPCION, CANTIDAD FROM PRODUCTO");
                statement.execute();
				try(statement){
				ResultSet resultSet = statement.getResultSet();
				List<Map<String, String>> resultado = new ArrayList<>();
				while (resultSet.next()){
					Map<String, String> fila = new HashMap<>();
					fila.put("ID", String.valueOf(resultSet.getInt("ID")));
					fila.put("NOMBRE", resultSet.getString("NOMBRE"));
					fila.put("DESCRIPCION", resultSet.getString("DESCRIPCION"));
					fila.put("CANTIDAD", String.valueOf(resultSet.getInt("CANTIDAD")));

					resultado.add(fila);
				}
			return resultado;
		}
	}
}

    public void guardar(Producto producto) throws SQLException {
		String nombre = producto.getNombre();
		String descripcion = producto.getDescripcion();
		Integer cantidad = producto.getCantidad();
		final Connection con = new ConnectionFactory().recuperarConnection();
		try (con) {
			con.setAutoCommit(false);

			final PreparedStatement statement = con.prepareStatement("INSERT INTO PRODUCTO(nombre, descripcion, cantidad)" +
			"VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
			try (statement){
					ejecutarRegistro(producto, statement);
				con.commit();
			} catch (Exception e) {
				con.rollback();
			}
		}		
	}


	private void ejecutarRegistro(Producto producto, PreparedStatement statement)
			throws SQLException {
		statement.setString(1, producto.getNombre());
		statement.setString(2, producto.getDescripcion());
		statement.setInt(3, producto.getCantidad());
		statement.execute();
		
		final ResultSet resultSet = statement.getGeneratedKeys();
		try(resultSet){
		while (resultSet.next()){
			producto.setId(resultSet.getInt(1));
			System.out.println(String.format("Fue insertado el producto %s", producto));
			}
		}
	}
}
