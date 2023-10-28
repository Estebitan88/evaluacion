package com.cmc.repaso.entidades;

public class Item {
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;
    

    public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	// Constructor que recibe el nombre y establece productosActuales en 0
    public Item(String nombre) {
        this.nombre = nombre;
        this.productosActuales = 0;
    }

    // Método para imprimir los valores de los atributos
    public void imprimir() {
        System.out.println("Nombre del Item: " + nombre);
        System.out.println("Productos Actuales: " + productosActuales);
        System.out.println("Productos Vendidos: " + productosVendidos);
        System.out.println("Productos Devueltos: " + productosDevueltos);
    }

    // Método para vender productos
    public void vender(int cantidadVendida) {
        if (cantidadVendida > 0 && cantidadVendida <= productosActuales) {
            productosVendidos += cantidadVendida;
            productosActuales -= cantidadVendida;
        } else {
            System.out.println("No se pueden vender más productos de los disponibles.");
        }
    }

    // Método para devolver productos
    public void devolver(int cantidadDevuelta) {
        if (cantidadDevuelta > 0 && cantidadDevuelta <= productosVendidos) {
            productosDevueltos += cantidadDevuelta;
            productosActuales += cantidadDevuelta;
            productosVendidos -= cantidadDevuelta;
        } else {
            System.out.println("No se pueden devolver más productos de los vendidos.");
        }
    }

    // Getter para obtener el nombre del Item
    public String getNombre() {
        return nombre;
    }

    // Getter para obtener la cantidad de productos actuales
    public int getProductosActuales() {
        return productosActuales;
    }

    // Getter para obtener la cantidad de productos devueltos
    public int getProductosDevueltos() {
        return productosDevueltos;
    }

    // Getter para obtener la cantidad de productos vendidos
    public int getProductosVendidos() {
        return productosVendidos;
    }
}

