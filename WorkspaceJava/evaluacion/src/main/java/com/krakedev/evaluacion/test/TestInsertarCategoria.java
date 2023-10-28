package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestInsertarCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria cat = new Categoria();
		cat.setId("C004");
		cat.setNombre("Paletas");
		try {
			ServiciosCategoria.insertar(cat);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}

}
