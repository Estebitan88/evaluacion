package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigo;
	
	// Constructor
	public Producto(String codigo, String nombre,double precio) {
	    this.codigo = codigo;
		this.nombre = nombre;
	    this.precio = precio;
	}
	
	// Método incrementar precio
	public void incrementarPrecio(int porcentajeDeIncremento) {
	    double precioFinal = this.precio + (this.precio * porcentajeDeIncremento / 100.0);
	    this.precio = precioFinal;
	}

	// Método disminuir precio
	public void disminuirPrecio(double descuento) {
	    double precioFinal = this.precio - descuento;
	    this.precio = precioFinal;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	
}
