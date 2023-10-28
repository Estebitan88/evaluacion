package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestBuscarCeldaProducto {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A", "B", "C", "D");
        Producto producto = new Producto("BDCR", "Producto de Prueba", 2.54);
        maquina.cargarProducto(producto, "D", 5);
        maquina.mostrarProductoCelda("D");

        System.out.println("--------------------------------------");
        Producto productoA = new Producto("KE34", "Papitas", 0.85);
        Producto productoD = new Producto("BDCR", "Doritos", 2.54);
        maquina.cargarProducto(productoA, "D", 5);
        maquina.mostrarProductoCelda("D");
        maquina.mostrarProductoCelda("B");

        // Mostrar información de la celda "D"
        System.out.println("--------------------------------------");
        Celda celdaD = maquina.buscarCelda("D");
        if (celdaD != null) {
            System.out.println("Celda: " + celdaD.getCodigo() + " Stock: " + celdaD.getStock());
        } else {
            System.out.println("Celda no encontrada.");
        }
    }
}
