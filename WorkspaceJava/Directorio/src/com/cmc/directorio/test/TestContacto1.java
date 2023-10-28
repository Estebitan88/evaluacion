package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Crear objetos Telefono
		Telefono telf1 = new Telefono("movi", "0994123412", 10);

        Telefono telf2 = new Telefono("movi", "0982342340", 20);

        Telefono telf3 = new Telefono("claro", "0987654321", 30);

        // Crear objetos Contacto utilizando los objetos Telefono
        Contacto c1 = new Contacto("Paula", "Carrillo", telf1, 60.0);
        Contacto c2 = new Contacto("Juan", "Perez", telf2, 70.0);
        Contacto c3 = new Contacto("Luis", "Gomez", telf3, 80.0);

        // Llamar al método imprimir en los objetos Contacto
        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

        // Aplicar el método compararOperadoras
        boolean mismaOperadora1y2 = AdminContactos.compararOperadoras(c1, c2);
        boolean mismaOperadora1y3 = AdminContactos.compararOperadoras(c1, c3);

        // Llamar al método activarUsuario en los objetos Contacto
        AdminContactos.activarUsuario(c1);
        AdminContactos.activarUsuario(c2);

        // Imprimir el resultado de las comparaciones
        System.out.println("¿c1 y c2 pertenecen a la misma operadora? " + mismaOperadora1y2);
        System.out.println("¿c1 y c3 pertenecen a la misma operadora? " + mismaOperadora1y3);

        // Imprimir el estado activo de los contactos
        System.out.println("\n¿El contacto c1 está activo? " + c1.isActivo()); // Debería ser activo si tiene WhatsApp
        System.out.println("¿El contacto c2 está activo? " + c2.isActivo()); // Debería ser inactivo porque no tiene WhatsApp
    }
}
