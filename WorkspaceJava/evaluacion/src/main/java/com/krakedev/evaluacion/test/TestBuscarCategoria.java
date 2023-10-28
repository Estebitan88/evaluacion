package com.krakedev.evaluacion.test;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.servicios.ServiciosCategoria;

public class TestBuscarCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Categoria categorias = ServiciosCategoria.buscarPorId("C001");
			System.out.println(categorias);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	}

