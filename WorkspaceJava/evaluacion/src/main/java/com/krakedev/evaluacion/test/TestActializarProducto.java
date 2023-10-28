package com.krakedev.evaluacion.test;

import java.math.BigDecimal;

import com.krakedev.evaluacion.entidades.Producto;
import com.krakedev.evaluacion.servicios.ServiciosProductos;

public class TestActializarProducto {

	public static void main(String[] args) {
		Producto pro = new Producto("P1", "Lolipop", "C1");
		try {

			pro.setPrecioVenta(new BigDecimal(1.00));
			pro.setPrecioCompra(new BigDecimal(1.50));

			ServiciosProductos.actualizar(pro);
		} catch (Exception e) {

			System.out.println("error en el sistema: " + e.getMessage());
		}

	}

}
