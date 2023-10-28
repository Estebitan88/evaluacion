package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Préstamo;
import com.cmc.evaluacion.servicios.CalculadoraAmortizacion;

public class TestCuota {
    public static void main(String[] args) {
        Préstamo préstamo = new Préstamo(5000, 12, 12);
        double cuota = CalculadoraAmortizacion.calcularCuota(préstamo);
        System.out.println("Cuota: " + cuota);
    }
}
