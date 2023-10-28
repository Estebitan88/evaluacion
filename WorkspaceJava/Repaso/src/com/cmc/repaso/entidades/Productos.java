package com.cmc.repaso.entidades;

public class Productos {
	private double precio;
	private String nombre;
	
	//Constructor
	public void Producto(String nombre, double precio) {
	    this.nombre = nombre;
	    this.precio=precio; // Usar el método setPrecio para validar el precio
	}

	
	public double getPrecio() {
        return precio;
    }

    // Método para establecer el precio con validación
    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = precio * -1; // Si es negativo, convertirlo a positivo
        } else {
            this.precio = precio;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para calcular el precio con descuento
    public double calcularPrecioPromo(double descuentoPorcentaje) {
        double descuento = (descuentoPorcentaje / 100) * precio;
        return precio - descuento;
    }
}
