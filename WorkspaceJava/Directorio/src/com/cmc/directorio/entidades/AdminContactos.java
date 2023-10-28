package com.cmc.directorio.entidades;

public class AdminContactos {
	 // Método para comparar el peso de dos contactos y retornar el más pesado
    public Contacto buscarMasPesado(Contacto contacto1, Contacto contacto2) {
        if (contacto1.getPeso() > contacto2.getPeso()) {
            return contacto1;
        } else {
            return contacto2;
        }
    }
    
 // Método para comparar las operadoras de dos contactos y retornar true si son iguales, false si son diferentes
    public static boolean compararOperadoras(Contacto contacto1, Contacto contacto2) {
        String operadora1 = contacto1.getTelefono().getOperadora();
        String operadora2 = contacto2.getTelefono().getOperadora();

        if (operadora1.equals(operadora2)) {
            return true;
        } else {
            return false;
        }
    }
    
 // Método para activar usuario si tiene WhatsApp
    public static void activarUsuario(Contacto contacto1) {
        if (contacto1.getTelefono() != null && contacto1.getTelefono().isTieneWhatsapp()) {
            contacto1.setActivo(true);
        }
    }
}
