package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        Producto producto1 = new Producto("KE34", "Papitas", 0.85);
        maquina.cargarProducto(producto1, "B1", 4);

        Producto producto2 = new Producto("D456", "Doritos", 0.70);
        maquina.cargarProducto(producto2, "A1", 6);

        Producto producto3 = new Producto("F789", "Chocolatinas", 1.20);
        maquina.cargarProducto(producto3, "A2", 3);

        Producto producto4 = new Producto("G123", "Galletas", 0.90);
        maquina.cargarProducto(producto4, "B2", 5);

        maquina.vender("A1");
        maquina.vender("B1");
        maquina.vender("A2");
        maquina.vender("B2");
        
        System.out.println("--------------------------------------------");
		
		maquina.mostrarProductos();

	}

}
