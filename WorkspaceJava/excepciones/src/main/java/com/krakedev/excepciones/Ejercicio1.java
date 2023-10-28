package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicio");
		String a = "ddddd";
		try {
			System.out.println("ABRE LA CONEXION BDD");
			a.substring(3);
			System.out.println("fin");
		}catch (Exception ex) {
			System.out.println("entra al catch");
		}finally {
			System.out.println("ingreso al finally");
			System.out.println("CIERRA LA CONEXION BDD");
		}
			System.out.println("fuera al catch");

	}

}
