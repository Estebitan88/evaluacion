package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Préstamo;
import com.cmc.evaluacion.servicios.CalculadoraAmortizacion;

public class TestCalculadora2 {
																																																																																			
	    public static void main(String[] args) {
	        Préstamo prestamo = new Préstamo(5000, 12, 15);

	        CalculadoraAmortizacion.generarTabla(prestamo);
	        CalculadoraAmortizacion.mostrarTabla(prestamo);
	    }
	}