package servicios;

import entidades.Naipe;
import entidades.Carta;

import java.util.ArrayList;

public class Juego {
    private Naipe naipe;
    private ArrayList<ArrayList<Carta>> cartasJugadores;

    public Juego(ArrayList<String> nombresJugadores) {
        naipe = new Naipe();
        cartasJugadores = new ArrayList<>();

        for (int i = 0; i < nombresJugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<>());
        }
    }

    public void entregarCartas(int cartasPorJugador) {
        int naipeSize = naipe.getNumeroCartas();
        naipe.barajar();

        for (ArrayList<Carta> cartasJugador : cartasJugadores) {
            for (int i = 0; i < cartasPorJugador; i++) {
                if (naipeSize > 0) {
                    Carta carta = naipe.getCarta(naipeSize - 1);
                    cartasJugador.add(carta);
                    naipeSize--;
                }
            }
        }
    }

    public int devolverTotal(int idJugador) {
        if (idJugador < 0 || idJugador >= cartasJugadores.size()) {
            throw new IllegalArgumentException("ID de jugador no válido");
        }

        ArrayList<Carta> cartasJugador = cartasJugadores.get(idJugador);
        int total = 0;

        for (Carta carta : cartasJugador) {
            total += carta.getValor();
        }

        return total;
    }

    public String determinarGanador() {
        String idGanador = null;
        int maxPuntos = Integer.MIN_VALUE;

        for (int i = 0; i < cartasJugadores.size(); i++) {
            int total = devolverTotal(i);
            if (total > maxPuntos) {
                maxPuntos = total;
                idGanador = "jugador " + (i + 1);
            }
        }

        return idGanador;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    public void setCartasJugadores(ArrayList<ArrayList<Carta>> cartasJugadores) {
        this.cartasJugadores = cartasJugadores;
    }
}
