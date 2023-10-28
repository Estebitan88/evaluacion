package entidades;

public class Random {
	
    public static int obtenerPosicion() {
        return (int)(Math.random() * 52); // Genera un número aleatorio entre 0 y 51 (inclusive)
    }
}
