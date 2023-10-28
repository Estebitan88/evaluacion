package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado cuadrado1 = new Cuadrado(5.0);
        Cuadrado cuadrado2 = new Cuadrado(7.5);
        Cuadrado cuadrado3 = new Cuadrado(3.0);

        double areaCuadrado1 = cuadrado1.calcularArea();
        double areaCuadrado2 = cuadrado2.calcularArea();
        double areaCuadrado3 = cuadrado3.calcularArea();

        double perimetroCuadrado1 = cuadrado1.calcularPerimetro();
        double perimetroCuadrado2 = cuadrado2.calcularPerimetro();
        double perimetroCuadrado3 = cuadrado3.calcularPerimetro();

        System.out.println("Área de cuadrado1: " + areaCuadrado1);
        System.out.println("Perímetro de cuadrado1: " + perimetroCuadrado1);

        System.out.println("-----------------------------------");

        System.out.println("Área de cuadrado2: " + areaCuadrado2);
        System.out.println("Perímetro de cuadrado2: " + perimetroCuadrado2);

        System.out.println("-----------------------------------");

        System.out.println("Área de cuadrado3: " + areaCuadrado3);
        System.out.println("Perímetro de cuadrado3: " + perimetroCuadrado3);
	}

}
