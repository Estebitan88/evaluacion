package com.krakedev;

public class Producto {
	private String nombre;
    private String descripcion;
    private double precio;
    private int stockAnual;

    // Constructor con parámetros
    public Producto(String nombre, String descripcion, double precio, int stockAnual) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stockAnual = stockAnual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockAnual() {
        return stockAnual;
    }

    public void setStockAnual(int stockAnual) {
        this.stockAnual = stockAnual;
    }
	
	
}
