package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean tieneWhatsapp;
	
	//Constructor
	public Telefono(String operadora, String numero, int codigo) {
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
	}
	
	public void imprimir() {
		System.out.println("OPERADORA: "+operadora);
		System.out.println("NUMERO: "+numero);
		System.out.println("CODIGO: "+codigo);
		System.out.println("Tiene WhatsApp: " + tieneWhatsapp);
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isTieneWhatsapp() {
		return tieneWhatsapp;
	}

	public void setTieneWhatsapp(boolean tieneWhatsapp) {
		this.tieneWhatsapp = tieneWhatsapp;
	}
	
	
	
	
}
