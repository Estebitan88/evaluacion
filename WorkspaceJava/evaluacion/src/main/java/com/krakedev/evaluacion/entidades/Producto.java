package com.krakedev.evaluacion.entidades;

import java.math.BigDecimal;

public class Producto {
	private int id;
	private String nombre;
	private BigDecimal precioVenta;
	private BigDecimal precioCompra;
	private int idCategoria;
	
	public Producto() {
		
	}
	
	public Producto(int id, String nombre, BigDecimal precioVenta, BigDecimal precioCompra, int idCategoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.precioCompra = precioCompra;
		this.idCategoria = idCategoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}
	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}
	public int getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precioVenta=" + precioVenta + ", precioCompra="
				+ precioCompra + ", idCategoria=" + idCategoria + "]";
	}
	
	
	
}
