package com.krakedev.test;

import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha1 = new Fecha(2000, 12, 12);

        System.out.println(fecha1.getAnio());
        System.out.println(fecha1.getMes());
        System.out.println(fecha1.getDia());
	}

}
