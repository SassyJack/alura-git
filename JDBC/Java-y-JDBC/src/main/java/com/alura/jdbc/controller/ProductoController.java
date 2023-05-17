package com.alura.jdbc.controller;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import com.alura.jdbc.dao.ProductoDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Producto;

public class ProductoController {

	private Statement Statement;
	private ResultSet Result;
	private ProductoDAO productoDAO;

	public ProductoController(){
		var factory = new ConnectionFactory();
		this.productoDAO = new ProductoDAO(factory.recuperarConnection());
	}
	
	public int modificar(String nombre, String descripcion, Integer cantidad, Integer id) {
		return productoDAO.modificar(nombre, descripcion, cantidad, id);
		
}
	public int eliminar(Integer id) {
		return productoDAO.eliminar(id);	
}

	public List<Producto> listar() {
		return productoDAO.listar();
}

    public void guardar(Producto producto) {
		productoDAO.guardar(producto);		
	}

}
