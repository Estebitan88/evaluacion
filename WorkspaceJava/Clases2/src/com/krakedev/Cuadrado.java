package com.krakedev;

public class Cuadrado {
	private double lado;

    // Constructor que acepta el lado del cuadrado
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Métodos para calcular el área y el perímetro (modificados a public)
    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
}
