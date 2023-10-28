package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
    private ArrayList<Contacto> contactos;
    private Date fechaModificacion;
    private ArrayList<Contacto> correctos;
    private ArrayList<Contacto> incorrectos;

    public Directorio() {
        this.contactos = new ArrayList<>();
        this.fechaModificacion = new Date();
    }

    public boolean agregarContacto(Contacto contacto) {
        // Verificar si el contacto ya existe en la lista
        if (buscarPorCedula(contacto.getCedula()) != null) {
            return false; // El contacto ya existe, no se puede agregar
        }

        // Si el contacto no existe, se agrega a la lista
        contactos.add(contacto);
        fechaModificacion = new Date(); // Actualizar la fecha de modificación
        return true; // Se pudo agregar el contacto
    }

    public Contacto buscarPorCedula(String cedula) {
        for (Contacto contacto : contactos) {
            if (contacto.getCedula().equals(cedula)) {
                return contacto; // Retorna el contacto si se encuentra
            }
        }
        return null; // Retorna null si no se encuentra el contacto
    }

    public String consultarUltimaModificacion() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return dateFormat.format(fechaModificacion);
    }
    
    public int contarPerdidos() {
        int contador = 0;
        for (Contacto contacto : contactos) {
            if (contacto.getDireccion() == null) {
                contador++;
            }
        }
        return contador;
    }
    
    public int contarFijos() {
        int contador = 0;
        for (Contacto contacto : contactos) {
            if (contacto.getTelefonos() != null) {
                for (Telefono telefono : contacto.getTelefonos()) {
                    if (telefono.getTipo().equals("Convencional") && telefono.getEstado().equals("C")) {
                        contador++;
                        break; // Si encuentra un teléfono que cumple las condiciones, pasa al siguiente contacto
                    }
                }
            }
        }
        return contador;
    }
    
    public void depurar() {
        correctos = new ArrayList<>();
        incorrectos = new ArrayList<>();

        for (Contacto contacto : contactos) {
            if (contacto.getDireccion() != null) {
                correctos.add(contacto); // Si tiene dirección, agregar a la lista de correctos
            } else {
                incorrectos.add(contacto); // Si no tiene dirección, agregar a la lista de incorrectos
            }
        }
    }

    

    public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}

