package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {
    public static void main(String[] args) {
        try {
            AdminPersonas.eliminar("1716231321"); // Reemplaza con la cédula de la persona que deseas eliminar
            System.out.println("Persona eliminada exitosamente");
        } catch (Exception e) {
            System.err.println("Error al eliminar: " + e.getMessage());
        }
    }
}
