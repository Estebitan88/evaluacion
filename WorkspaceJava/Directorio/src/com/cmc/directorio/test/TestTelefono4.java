package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        Telefono telf1 = new Telefono("movi", "098234234", 20);
        Telefono telf2 = new Telefono("movi", "098234274", 5);
        Telefono telf3 = new Telefono("claro", "098234963", 10);        
        Telefono telf4 = new Telefono("claro", "098234234", 10);

        
        AdminTelefono at = new AdminTelefono();
        
        // Invoca al método contarMovi y almacena el resultado en una variable
        int cantidadClaro = at.contarClaro(telf1, telf2, telf3,telf4);
        // Imprime el resultado
        System.out.println("\nCantidad de teléfonos de la operadora 'claro': " + cantidadClaro);
	}

}
