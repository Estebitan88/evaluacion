package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarCelda {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A", "B", "C", "D");

        Celda celda = maquina.buscarCelda("C");
        System.out.println("Celda Encontrada: " + celda.getCodigo());
        Celda celda2 = maquina.buscarCelda("F");
        if (celda2 == null) {
            System.out.println("No existe la celda");
        }

        // Cargar productos en las celdas
        System.out.println("--------------------------------------");
        Producto productoA = new Producto("ProductoA","KE34",  0.85);
        Producto productoD = new Producto("ProductoD","BDCR",  2.54);
        maquina.cargarProducto(productoA, "B", 4);
        maquina.cargarProducto(productoD, "D", 5);

        // Mostrar la configuración y los productos después de cargarlos
        maquina.mostrarConfiguracion();
        maquina.mostrarProductos();
    }
}
