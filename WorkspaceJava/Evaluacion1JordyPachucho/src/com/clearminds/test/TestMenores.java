package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;
import java.util.ArrayList;

public class TestMenores {

    public static void main(String[] args) {
        // Crear una instancia de MaquinaDulces
        MaquinaDulces maquina = new MaquinaDulces();

        // Configurar la máquina con algunas celdas y productos
        maquina.configurarMaquina("A1", "A2", "B1", "B2", "C1", "C2");

        // Agregar productos a las celdas
     // Agregar productos a las celdas con nombres de productos reales y códigos
        maquina.cargarProducto(new Producto("A1P1", "Chocolate Hershey's",  1.0), "A1", 5);
        maquina.cargarProducto(new Producto("A2P2", "Galletas Oreo",  2.0), "A2", 3);
        maquina.cargarProducto(new Producto( "B1P3","Chips Ahoy", 3.0), "B1", 7);
        maquina.cargarProducto(new Producto( "B2P4", "Coca-Cola", 4.0), "B2", 2);
        maquina.cargarProducto(new Producto( "C1P5","Doritos", 5.0), "C1", 4);
        maquina.cargarProducto(new Producto( "C2P6","Pepsi", 6.0), "C2", 6);


        // Llamar al método buscarMenores con un límite de precio y almacenar los resultados en una lista
        double limite = 3.0; // Puedes cambiar este límite según tus necesidades
        ArrayList<Producto> productosMenores = maquina.buscarMenores(limite);

        // Imprimir la lista de productos encontrados
        System.out.println("Productos cuyo precio es menor o igual a " + limite + ":");
        for (Producto producto : productosMenores) {
            System.out.println(producto.getNombre() + " - Precio: " + producto.getPrecio());
        }
    }
}
