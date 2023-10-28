package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Telefono telf1 = new Telefono("movi", "098234234", 20);
        Telefono telf2 = new Telefono("movi", "098234274", 5);
        Telefono telf3 = new Telefono("movi", "098234963", 10);
        
        AdminTelefono at = new AdminTelefono();
        
        // Invoca al método contarMovi y almacena el resultado en una variable
        int cantidadMovi = at.contarMovi(telf1, telf2, telf3);

        // Imprime el resultado
        System.out.println("\nCantidad de teléfonos de la operadora 'movi': " + cantidadMovi);
        
	}

}
