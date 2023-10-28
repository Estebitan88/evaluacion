package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Crear un objeto Telefono sin WhatsApp
        Telefono telfSinWhatsApp = new Telefono("claro", "0999999999", 40);

        // Crear un contacto con el objeto Telefono sin WhatsApp
        Contacto contactoSinWhatsApp = new Contacto("Carlos", "Rodriguez", telfSinWhatsApp, 75.0);

        // Imprimir los datos del contacto antes de activarlo
        System.out.println("Datos del contacto antes de activarlo:");
        contactoSinWhatsApp.imprimir();

        // Invocar el método activarUsuario y pasarle el contacto
        AdminContactos.activarUsuario(contactoSinWhatsApp);

        // Imprimir los datos del contacto después de activarlo
        System.out.println("\nDatos del contacto después de activarlo:");
        contactoSinWhatsApp.imprimir();
	}

}
