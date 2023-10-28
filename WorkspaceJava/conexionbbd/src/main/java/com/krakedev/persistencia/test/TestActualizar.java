package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizar {

    public static void main(String[] args) {
            EstadoCivil ec = new EstadoCivil("U", "Union Libre");
            Persona persona = new Persona("1716231312", "Julio", "Jaramillo", ec);
            try {
                Date fechaNac = Convertidor.convertirFecha("2020/12/23");
                Date horaNac = Convertidor.convertirHora("12:23");
                persona.setFechaNacimiento(fechaNac);
                persona.setHoraNacimiento(horaNac);
                persona.setCantidadAhorrada(new BigDecimal(1230.45));
                persona.setNumeroHijos(50);
                persona.setEstatura(1.65);
                AdminPersonas.actualizar(persona);
            } catch (Exception e) {
                System.out.println("Error en el sistema: " + e.getMessage());
            }
        }
    }
