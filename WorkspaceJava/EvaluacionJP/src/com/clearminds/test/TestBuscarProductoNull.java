package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1"); // Línea que produce NullPointerException
		
		// La siguiente línea dará un NullPointerException si no se encuentra el producto en la celda "A1"
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		
		
		
	}
}
