package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monto1 = 10;
        int monto2 = -5;

        boolean resultado1 = validarMonto(monto1);
        boolean resultado2 = validarMonto(monto2);

        System.out.println("El monto 1 es válido: " + resultado1);
        System.out.println("El monto 2 es válido: " + resultado2);
    }

    public static boolean validarMonto(int monto) {
        return monto > 0;
	}

}
