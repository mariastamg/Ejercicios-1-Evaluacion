package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Conversor {

	

	public static void main(String[] args) throws NumberFormatException, IOException {
/*En el m�todo main de una clase Java llamada Conversor escribe un programa
*en Java que convierta de euros a d�lares. El dato de entrada ser� un n�mero
*decimal correspondiente a la cantidad en euros, y el dato de salida ser� un
*n�mero decimal que representar� la cantidad correspondiente en d�lares con
una precisi�n de 2 decimales. Realiza el ejercicio sin utilizar la clase Scanner.*/
		
		float euros;
		float tipoCambio;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca una cantidad en euros:");
		euros=Float.parseFloat(in.readLine());
		System.out.println("Introduzca tipo de cambio:");
		tipoCambio=Float.parseFloat(in.readLine());
		
		System.out.printf("Dolares: %.2f\n", euros * tipoCambio);
		
		

	}

}
