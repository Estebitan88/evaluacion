package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto2 {

	public static void main(String[] args) {
	    // Crear una instancia de Direccion
        Direccion direccion = new Direccion("Av. siempre Viva", "Calle 4");

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Rosa", "Chavez", direccion);

        // Mostrar información usando el método imprimir
        contacto.imprimir();
        
        Direccion direccion2 = null;
        Contacto contacto2 = new Contacto("9876543210", "Ernesto", "Montoya", direccion2);
        contacto2.imprimir();
    }
	}

