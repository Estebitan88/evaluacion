package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;

public class TestMaquinaDulces {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A", "B", "C", "D");
        maquina.mostrarConfiguracion();
    }
}
