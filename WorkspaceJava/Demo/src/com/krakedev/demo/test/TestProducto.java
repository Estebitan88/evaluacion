package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciar un objeto Producto usando el constructor que recibe el codigo y nombre
		Producto p=new Producto(50,"Coca-Cola");
		
		//Mostrar valores en pantalla antes de modificar 
		System.out.println("CODIGO: "+p.getCodigo());
		System.out.println("NOMBRE: "+p.getNombre());
		System.out.println("DESCRIPCION: "+p.getDescripcion());
		System.out.println("PESO: "+p.getPeso());
		
		System.out.println("---------------------");
		
		//Modificar descripcion y peso
		p.setDescripcion("Producto de buena calidad");
		p.setPeso(2.5);
		
		//Mostrar los valores en pantalla modificados
		System.out.println("CODIGO: "+p.getCodigo());
		System.out.println("NOMBRE: "+p.getNombre());
		System.out.println("DESCRIPCION: "+p.getDescripcion());
		System.out.println("PESO: "+p.getPeso());
	}

}
