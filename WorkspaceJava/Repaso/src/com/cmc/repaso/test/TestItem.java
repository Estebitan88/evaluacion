package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
    public static void main(String[] args) {
    	// Crear un objeto Item
        Item item1 = new Item("Producto A");
        item1.setProductosActuales(20);

        // Imprimir valores iniciales
        System.out.println("-----------Valores iniciales del Item 1-----------");
        item1.imprimir();
        

        
        // Probar los métodos
        item1.vender(5); // Vender 5 productos
        item1.devolver(2); // Devolver 2 productos

        // Imprimir valores después de las operaciones
        System.out.println("-----------Valores después de las operaciones del Item 1-----------");
        item1.imprimir();
        
        // Crear otro objeto Item
        Item item2 = new Item("Producto B");
        item2.setProductosActuales(15);

        // Imprimir valores iniciales
        System.out.println("-----------Valores iniciales del Item 2-----------");
        item2.imprimir();

        // Probar los métodos
        item2.vender(10); // Vender 10 productos
        item2.devolver(5); // Devolver 5 productos

        // Imprimir valores después de las operaciones
        System.out.println("-----------Valores después de las operaciones del Item 2----------");
        item2.imprimir();
    }
}

