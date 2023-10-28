package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creo el objeto Cuenta y lo referencio con cuenta1
        Cuenta cuenta1 = new Cuenta("03476", "A", 0.0);

        // Coloco un valor de saldo en la cuenta1
        cuenta1.setSaldo(675);

        // Creo el objeto Cuenta y lo referencio con cuenta2
        Cuenta cuenta2 = new Cuenta("03476", "C", 98.0);

        // Creo el objeto Cuenta y lo referencio con cuenta3
        Cuenta cuenta3 = new Cuenta("03476", "C", 0.0);

        // Imprimo cuenta1, cuenta2 y cuenta3 (Valores iniciales)
        System.out.println("-- Valores Iniciales --");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        System.out.println("-----------------------");

        // Modificar el saldo de la cuenta1 a 444
        cuenta1.setSaldo(444);

        // Modificar el saldo de la cuenta3 a 567
        cuenta3.setSaldo(567);

        // Modificar el tipo de la cuenta2 a D
        cuenta2.setTipo("D");

        // Imprimir los nuevos valores de cuenta1, cuenta2 y cuenta3
        System.out.println("-- Valores Modificados --");
        cuenta1.imprimir();
        cuenta2.imprimir();
        cuenta3.imprimir();
        System.out.println("-------------------------");

        // Crear una cuenta4 utilizando el constructor que recibe el Id de cuenta
        // y modificar los atributos si es necesario.
        Cuenta cuenta4 = new Cuenta("0987", "A", 10.0);

        // Crear una cuenta5 utilizando el constructor que recibe los tres parámetros
        // y modificar los atributos si es necesario.
        Cuenta cuenta5 = new Cuenta("0557", "C", 10.0);

        // Crear una cuenta6 utilizando cualquier constructor y modificar los atributos
        // de ser necesario.
        Cuenta cuenta6 = new Cuenta("0666", "A", 0.0);

        // Modificar atributos de cuenta6
        cuenta6.setTipo("A");

        // Imprimir los valores de cuenta4, cuenta5 y cuenta6 utilizando el método imprimirConMiEstilo.
        System.out.println("-- Valores de cuenta4 --");
        cuenta4.imprimirConMiEstilo();

        System.out.println("-- Valores de cuenta5 --");
        cuenta5.imprimirConMiEstilo();

        System.out.println("-- Valores de cuenta6 --");
        cuenta6.imprimirConMiEstilo();
	}

}

