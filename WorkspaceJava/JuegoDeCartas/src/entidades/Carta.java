package entidades;

public class Carta {
    Numero numero;
    private String palo;
    private String estado; // Atributo para el estado de la carta

    public Carta(Numero numero, String palo) {
        this.numero = numero;
        this.palo = palo;
        this.estado = "N"; // Establece el estado inicial como "N" (no barajado)
    }

    public String mostrarCarta() {
        return numero.getNumeroCarta() + "-" + palo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

	public int getValor() {
		// TODO Auto-generated method stub
		return 0;
	}
}
