package com.krakedev.evaluacion.test;

import java.math.BigDecimal;

import com.krakedev.evaluacion.entidades.Producto;
import com.krakedev.evaluacion.servicios.ServiciosProductos;

public class TestInsertarProducto {

	public static void main(String[] args) {
		Producto pro = new Producto("P6", "Papa frita", "C1");
		try {

			
			pro.setPrecioVenta(new BigDecimal(2.00));
			pro.setPrecioCompra(new BigDecimal(2.50));

		ServiciosProductos.insertar(pro);
		} catch (Exception e) {

			System.out.println("error en el sistema: " + e.getMessage());
		}

	}

}
