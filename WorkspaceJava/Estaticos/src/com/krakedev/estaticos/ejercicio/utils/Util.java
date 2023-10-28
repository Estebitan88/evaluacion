package com.krakedev.estaticos.ejercicio.utils;

public class Util {
    public static String formatearHora(int numero) {
        if (numero < 10) {
            return "0" + numero;
        } else {
            return String.valueOf(numero);
        }
    }

    public static String formatearDia(int numero) {
        String[] diasSemana = {
            "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        };

        if (numero >= 0 && numero < diasSemana.length) {
            return diasSemana[numero];
        } else {
            return "Día no válido";
        }
    }
}
