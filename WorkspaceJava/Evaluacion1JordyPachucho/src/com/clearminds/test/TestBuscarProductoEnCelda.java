package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoEnCelda {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A", "B", "C", "D");

        Producto productoA = new Producto("KE34", "Papitas", 0.85);
        Producto productoB = new Producto("BDCR", "Galletas", 2.54);

        maquina.cargarProducto(productoB, "D", 5);
        maquina.cargarProducto(productoA, "B", 4);

        maquina.mostrarProductos();
    }
}
