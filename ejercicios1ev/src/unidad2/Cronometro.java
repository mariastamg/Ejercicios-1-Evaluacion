package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;

public class Cronometro {

	public static void main(String[] args) throws IOException {
/*En el método main de una clase Java llamada Cronometro escribe un programa
*que pida al usuario que introduzca mediante el teclado su nombre y a
*continuación muestre en la consola un mensaje que incluya un número real que
*represente los segundos y milisegundos que ha tardado en contestar, con un
*formato de salida que emplee exactamente 3 dígitos en la parte decimal.
 Realiza el ejercicio sin utilizar la clase Scanner.*/
		
		String nombre;
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Introduzca su nombre:");
		long inicio=System.currentTimeMillis();
		nombre=in.readLine();
		long fin=System.currentTimeMillis();
		System.out.printf(nombre+" has tardado %.3f segundos en escribir tu nombre.",(fin-inicio ) / 1000d);
		
		
	}

}
