package com.krakedev.evaluacion.entidades;

import java.util.Date;

public class HistorialMovimiento {
	private int id;
	private int cantidad;
	private Date fechaMovimiento;
	private int idProducto;
	
	public HistorialMovimiento() {
		
	}
	
	public HistorialMovimiento(int id, int cantidad, Date fechaMovimiento, int idProducto) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.fechaMovimiento = fechaMovimiento;
		this.idProducto = idProducto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}
	public void setFechaMovimiento(Date fechaMovimiento) {
		this.fechaMovimiento = fechaMovimiento;
	}
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	@Override
	public String toString() {
		return "HistorialMovimiento [id=" + id + ", cantidad=" + cantidad + ", fechaMovimiento=" + fechaMovimiento
				+ ", idProducto=" + idProducto + "]";
	}
	
	
	
	
}
