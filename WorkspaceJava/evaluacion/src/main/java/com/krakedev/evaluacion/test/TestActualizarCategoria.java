package com.krakedev.evaluacion.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;
import com.krakedev.evaluacion.utils.Convertidor;


public class TestActualizarCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Categoria cat = new Categoria("C4", "Gomitas");
		try {
			cat.setNombre("Pal");
			ServiciosCategoria.actualizar(cat);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}
	}
}
