package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion=direccion;
		this.telefonos = new ArrayList<>();
	}
	
	public void imprimir() {
		/*System.out.println("Cédula: "+getCedula());
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellido: "+getApellido());
		System.out.println("Dirección: ");
		System.out.println("  "+"Calle Principal: "+direccion.getCallePrincipal());
		System.out.println("  "+"Calle Secundaria: "+direccion.getCalleSecundaria());*/
		
		/*System.out.println("***" + getNombre() + " " + getApellido() + "***");

	    if (direccion != null) {
	        System.out.println("Dirección: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
	    } else {
	        System.out.println("No tiene asociada una dirección");
	    }*/
		
		System.out.println("Informacion del contacto: ");
		System.out.println("Cédula: "+getCedula());
		System.out.println("Nombre: "+getNombre()+" "+getApellido());
		System.out.println("Dirección: ");
		System.out.println("  "+"Calle Principal: "+direccion.getCallePrincipal());
		System.out.println("  "+"Calle Secundaria: "+direccion.getCalleSecundaria());
	}
	
	public void agregarTelefono(Telefono telefono) {
		this.telefonos.add(telefono);
	}
	
	public void mostrarTelefonos() {
	    if (telefonos != null) {
	        System.out.println("Teléfonos con estado 'C':");
	        for (Telefono telefono : telefonos) {
	            if ("C".equals(telefono.getEstado())) {
	                System.out.println("Número: " + telefono.getNúmero() + ", Tipo: " + telefono.getTipo());
	            }
	        }
	    }
	}
	
	
	public ArrayList<Telefono> recuperarIncorrectos() {
        ArrayList<Telefono> telefonosIncorrectos = new ArrayList<>();
        if (telefonos != null) {
            for (Telefono telefono : telefonos) {
                if ("E".equals(telefono.getEstado())) {
                    telefonosIncorrectos.add(telefono);
                }
            }
        }
        return telefonosIncorrectos;
    }


	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	
	
	
	
}
