package com.cmc.evaluacion.entidades;

public class Préstamo {
    private double monto;
    private double interes;
    private int plazo;
    private Cuota[] cuotas;

    public Préstamo(double monto, double interes, int plazo) {
        this.monto = monto;
        this.interes = interes;
        this.plazo = plazo;
        this.cuotas = new Cuota[plazo];
    }
    
    public void mostrarPréstamo() {
        System.out.println(" [monto=" + monto + ", interes=" + interes + ", plazo=" + plazo + "]");
    }

    public Cuota[] getCuotas() {
        return cuotas;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

	public void setCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	public Object getCliente() {
		// TODO Auto-generated method stub
		return null;
	}
}