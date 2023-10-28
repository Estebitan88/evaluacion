package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestIncrementarProductos {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		maquina.mostrarProductos();

		maquina.incrementarProductos("KE34", 8);

		System.out.println("------------LUEGO DEL INCREMENTO-------------");

		maquina.mostrarProductos();
		
		
		System.out.println("----------------------------------------------");
		
		MaquinaDulces maquina1 = new MaquinaDulces();
		maquina1.configurarMaquina("A", "B", "C", "D");
		
		Producto producto1 = new Producto("KE34", "Papitas", 0.85);
		maquina1.cargarProducto(producto1, "B", 4); 
		
		Producto producto2 = new Producto("KE34", "Gatorade", 2.54);
		maquina1.cargarProducto(producto2, "D", 5); 


		maquina1.mostrarProductos();

		maquina1.incrementarProductos("KE34", 6);

		System.out.println("------------LUEGO DEL INCREMENTO-------------");

		maquina1.mostrarProductos();

	}
}
