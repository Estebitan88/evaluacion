package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

    public static void main(String[] args) {
        AdminAlarmas admin = new AdminAlarmas();

        // Agregar alarmas
        admin.agregarAlarma(new Alarma(DiasSemana.LUNES, 5, 45));
        admin.agregarAlarma(new Alarma(DiasSemana.MARTES, 6, 30));
        admin.agregarAlarma(new Alarma(DiasSemana.VIERNES, 8, 15));

        // Recuperar la lista de alarmas de AdminAlarmas
        ArrayList<Alarma> alarmasActuales = admin.getAlarmas();

        // Imprimir la información
        for (Alarma alarma : alarmasActuales) {
            System.out.println(alarma);
        }
    }
}
