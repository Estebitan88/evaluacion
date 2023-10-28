package com.krakedev.herencia;

public class Gato extends Animal {
	
	public Gato () {
		super();
		System.out.println("Ejecuta constructor de Gato");
	}
	
	public void maullar () {
		System.out.println("Gato maullando");
	}
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("Gato durmiendo en la sala");
	}
}
