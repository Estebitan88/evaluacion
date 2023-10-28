package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Préstamo;
import com.cmc.evaluacion.entidades.Cuota;

public class CalculadoraAmortizacion {
    public static double calcularCuota(Préstamo préstamo) {
        double monto = préstamo.getMonto();
        double interesMensual = (préstamo.getInteres() / 12) / 100; // Tasa de interés mensual
        int plazo = préstamo.getPlazo();

        double cuota = monto * (interesMensual / (1 - Math.pow(1 + interesMensual, -plazo)));
        return cuota;
    }

    public static void generarTabla(Préstamo préstamo) {
        double cuota = calcularCuota(préstamo);
        for (int i = 0; i < préstamo.getPlazo() - 1; i++) { // Ajuste en el bucle
            Cuota cuotaActual = new Cuota(i + 1);
            cuotaActual.setCuota(cuota);

            if (i == 0) {
                cuotaActual.setInicio(préstamo.getMonto());
            } else {
                double saldoAnterior = préstamo.getCuotas()[i - 1].getSaldo();
                cuotaActual.setInicio(saldoAnterior);
            }

            calcularValoresCuota(préstamo.getInteres() / 12 / 100, cuotaActual, préstamo.getCuotas()[i + 1]);

            préstamo.getCuotas()[i] = cuotaActual;
        }

        // Ajuste para la última cuota
        Cuota ultimaCuota = préstamo.getCuotas()[préstamo.getPlazo() - 1];
        if (ultimaCuota != null) {
            double saldoAnterior = ultimaCuota.getSaldo();
            ultimaCuota.setCuota(ultimaCuota.getCuota() + saldoAnterior);
            ultimaCuota.setAbonoCapital(ultimaCuota.getAbonoCapital() + saldoAnterior);
            ultimaCuota.setSaldo(0);
        }
    }

    public static void mostrarTabla(Préstamo préstamo) {
        for (Cuota cuota : préstamo.getCuotas()) {
            if (cuota != null) {
                System.out.println(cuota.mostrarCuota());
            }
        }
    }

    private static void calcularValoresCuota(double interesMensual, Cuota cuotaActual, Cuota siguienteCuota) {
        double interes = cuotaActual.getInicio() * interesMensual;
        double abonoCapital = cuotaActual.getCuota() - interes;
        double saldo = cuotaActual.getInicio() - abonoCapital;

        cuotaActual.setInteres(interes);
        cuotaActual.setAbonoCapital(abonoCapital);
        cuotaActual.setSaldo(saldo);

        if (siguienteCuota != null) {
            siguienteCuota.setInicio(saldo);
        }
    }
}
