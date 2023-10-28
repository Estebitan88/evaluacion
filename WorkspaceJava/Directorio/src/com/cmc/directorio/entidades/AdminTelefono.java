package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono telefono) {
		if (telefono.getOperadora().equals("movi")) {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telefono1, Telefono telefono2, Telefono telefono3) {
        int contador = 0;

        if (telefono1.getOperadora().equals("movi")) {
            contador++;
        }

        if (telefono2.getOperadora().equals("movi")) {
            contador++;
        }

        if (telefono3.getOperadora().equals("movi")) {
            contador++;
        }

        return contador;
	}
	
	public int contarClaro(Telefono telefono1, Telefono telefono2, Telefono telefono3,Telefono telefono4) {
        int contador = 0;

        if (telefono1.getOperadora().equals("claro")) {
            contador++;
        }

        if (telefono2.getOperadora().equals("claro")) {
            contador++;
        }

        if (telefono3.getOperadora().equals("claro")) {
            contador++;
        }
        
        if (telefono4.getOperadora().equals("claro")) {
            contador++;
        }
        
        return contador;
	}
	
}
