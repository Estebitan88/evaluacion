package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestConsultarPrecio {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto1=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto1, "B1", 4);
		
		System.out.println("Precio en B1:"+maquina.consultarPrecio("B1"));
			
		System.out.println("----------------------------------------");
		
		Producto producto2=new Producto("KE34","Papitas",2.54);
		maquina.cargarProducto(producto2, "A1", 4);
		
		System.out.println("Precio:"+maquina.consultarPrecio("A1"));
		
		
		
		
	}
}
