package com.krakedev.evaluacion;

public class Telefono {
	private String número;
	private String tipo;
	private String estado;
	
	
    public Telefono(String numero, String tipo) {
        this.número = numero;
        this.tipo = tipo;
        this.estado = validarTeléfono(numero, tipo);
    }
	
	private String validarTeléfono(String numero, String tipo) {
        if (numero == null || tipo == null) {
            return "E";
        }

        if (tipo.equals("Movil")) {
            if (numero.length() == 10) {
                return "C";
            } else {
                return "E";
            }
        } else if (tipo.equals("Convencional")) {
            if (numero.length() == 7) {
                return "C";
            } else {
                return "E";
            }
        } else {
            return "E"; // Tipo de teléfono no válido
        }
    }
	
	public String getNúmero() {
		return número;
	}

	public void setNúmero(String número) {
		this.número = número;
	}

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
