package com.alura.jdbc.modelo;

public class Producto {
    
    private Integer id;
    private String nombre;
    private String descripcion;
    private Integer cantidad;
    private Integer categoriaId;

    public Producto(String nombre, String descripcion, Integer cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Producto(int id, String nombre, String descripcion, Integer cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
    }

    public Producto(Integer id, String nombre, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getId(){
        return this.id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCategoriaId(Integer categoriaId) {
        this.categoriaId = categoriaId;
    }

    public int getCategoriaId() {
        return this.categoriaId;
    }

    @Override
    public String toString() {
        return String.format(
            "{id: %s, nombre: %s , descripcion: %s , cantidad: %d}",
            this.id, this.nombre, this.descripcion, this.cantidad);
    }

    
}
