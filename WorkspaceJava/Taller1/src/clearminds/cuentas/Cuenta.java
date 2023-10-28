package clearminds.cuentas;

public class Cuenta {
	private String id;
    private String tipo;
    private double saldo;

    // Constructor que recibe el id de cuenta y establece el tipo por defecto a "A"
    public Cuenta(String id, String tipo, double saldo) {
        this.id = id;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    // Getter para el atributo id (No se proporciona setter para mantenerlo inmutable)
    public String getId() {
        return id;
    }

    // Getter y Setter para el atributo tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter y Setter para el atributo saldo
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para imprimir los datos de la cuenta en un formato específico
    public void imprimir() {
        System.out.println("******************");
        System.out.println("CUENTA");
        System.out.println("Número de Cuenta: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Saldo: USD " + saldo);
        System.out.println("******************");
    }

    // Método para imprimir los datos de la cuenta en un formato personalizado
    public void imprimirConMiEstilo() {
        System.out.println("===============");
        System.out.println("DETALLES DE LA CUENTA");
        System.out.println("ID de Cuenta: " + id);
        System.out.println("Tipo de Cuenta: " + tipo);
        System.out.println("Saldo Actual: USD " + saldo);
        System.out.println("===============");
}
}
