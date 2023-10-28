package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA = new Producto("Paracetamol", "Medicamento para el dolor", 5.99, 100);

        System.out.println("nombre:" + productoA.getNombre());
        System.out.println("descripcion:" + productoA.getDescripcion());
        System.out.println("precio:" + productoA.getPrecio());
        System.out.println("stockAnual:" + productoA.getStockAnual());

        System.out.println("---------------------------------");

        Producto productoB = new Producto("Aspirina", "Antiinflamatorio y analgésico", 3.49, 80);

        System.out.println("nombre:" + productoB.getNombre());
        System.out.println("descripcion:" + productoB.getDescripcion());
        System.out.println("precio:" + productoB.getPrecio());
        System.out.println("stockAnual:" + productoB.getStockAnual());

        System.out.println("---------------------------------");

        Producto productoC = new Producto("Vitamina C", "Suplemento vitamínico", 8.99, 50);

        System.out.println("nombre:" + productoC.getNombre());
        System.out.println("descripcion:" + productoC.getDescripcion());
        System.out.println("precio:" + productoC.getPrecio());
        System.out.println("stockAnual:" + productoC.getStockAnual());
	}

}
