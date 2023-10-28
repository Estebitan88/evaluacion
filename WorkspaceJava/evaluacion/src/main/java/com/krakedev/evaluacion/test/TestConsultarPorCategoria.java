package com.krakedev.evaluacion.test;

import java.util.ArrayList;

import com.krakedev.evaluacion.entidades.Producto;
import com.krakedev.evaluacion.servicios.ConsultarProductos;


public class TestConsultarPorCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            ArrayList<Producto> productos = ConsultarProductos.buscarPorCategoria("C001");
            System.out.println(productos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}