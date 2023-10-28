package entidades;

import java.util.ArrayList;

public class Naipe {
    private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;

    public Naipe() {
        numerosPosibles = new ArrayList<>();
        cartas = new ArrayList<>();

        // Agregar los 13 números posibles con sus valores
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));

        // Combinar los números con cada palo y agregarlos a las cartas
        for (Numero numero : numerosPosibles) {
            cartas.add(new Carta(numero, "CR")); // Corazón rojo
            cartas.add(new Carta(numero, "CN")); // Corazón negro
            cartas.add(new Carta(numero, "DI")); // Diamante
            cartas.add(new Carta(numero, "TR")); // Trébol
        }
    }

    public ArrayList<Carta> barajar() {
        ArrayList<Carta> cartasBarajadas = new ArrayList<>();
        ArrayList<Carta> auxiliar = new ArrayList<>(cartas);
        
        for (int i = 0; i < 100; i++) {
            int posicion = obtenerPosicion();
            if (posicion >= 0 && posicion < auxiliar.size()) {
                Carta carta = auxiliar.get(posicion);
                if (carta.getEstado().equals("N")) {
                    cartasBarajadas.add(carta);
                    carta.setEstado("C");
                }
            }
        }
        
        for (Carta carta : auxiliar) {
            if (carta.getEstado().equals("N")) {
                cartasBarajadas.add(carta);
                carta.setEstado("C");
            }
        }

        return cartasBarajadas;
    }
    

    private int obtenerPosicion() {
        return (int)(Math.random() * cartas.size());
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

	public int getNumeroCartas() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ArrayList<Numero> getNumerosPosibles() {
		return numerosPosibles;
	}

	public void setNumerosPosibles(ArrayList<Numero> numerosPosibles) {
		this.numerosPosibles = numerosPosibles;
	}

	public void setCartas(ArrayList<Carta> cartas) {
		this.cartas = cartas;
	}

	public Carta getCarta(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
