package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Persona personas = AdminPersonas.buscarPorCedula("1716231312");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
