package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

    public static void main(String[] args) {
        Telefono telf = new Telefono("movi", "098234234", 20);
        AdminTelefono at = new AdminTelefono();

        // Imprimir los datos del teléfono antes de activar la mensajería
        System.out.println("Datos del teléfono antes de activar la mensajería:");
        telf.imprimir();

        at.activarMensajeria(telf);

        // Imprimir los datos del teléfono después de activar la mensajería
        System.out.println("\nDatos del teléfono después de activar la mensajería:");
        telf.imprimir();
    }
}