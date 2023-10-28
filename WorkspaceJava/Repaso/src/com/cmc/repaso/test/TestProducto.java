package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Productos;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear un objeto Producto
        Productos producto1 = new Productos();
        Productos producto2 = new Productos();
        
        producto1.setNombre("Pan");
        producto1.setPrecio(0.15);
        
        producto2.setNombre("Camiseta");
        producto2.setPrecio(-20);
        
     // Calcular el precio con descuento
        double descuentoPorcentaje1 = 10.0; // 10% de descuento
        double descuentoPorcentaje2 = 5.0; // 10% de descuento
        double precioConDescuento1 = producto1.calcularPrecioPromo(descuentoPorcentaje1);
        double precioConDescuento2 = producto2.calcularPrecioPromo(descuentoPorcentaje2);

        // Mostrar la información en la consola
        System.out.println("Nombre del producto: " +producto1.getNombre());
        System.out.println("Precio del producto:" +producto1.getPrecio());
        System.out.println("Precio con descuento del " + descuentoPorcentaje1 + "%: " + precioConDescuento1);
        
        System.out.println("----------------------");
        
        System.out.println("Nombre del producto: " +producto2.getNombre());
        System.out.println("Precio del producto:" +producto2.getPrecio());
        System.out.println("Precio con descuento del " + descuentoPorcentaje2 + "%: " + precioConDescuento2);



        
	}

}
