package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

	public static void main(String[] args) {
		/*
		 * En el método main de una clase llamada AdivinaNumero escribe un programa para
		 * jugar a un juego de adivinación. El juego consiste en que el ordenador genera
		 * un número aleatorio entre 1 y N, ambos incluidos, siendo N un número entero
		 * mayor o igual que 1.000 y menor o igual que 100.000, que también elegirá de
		 * forma aleatoria. Una vez elegidos, el ordenador mostrará el mensaje “He
		 * pensado un número entre 1 y N, adivina cuál es: “. El usuario tendrá que
		 * introducir números hasta que acierte el que ha pensado el ordenador. Cada vez
		 * que introduzca un número y no acierte el ordenador le dirá si es mayor o
		 * menor que el que ha pensado y le volverá a preguntar.
		 * 
		 */

		Random rnd = new Random();
		int nLimit;// Es el limite superior rango (1-N) >=1000 y <=100000
		int nMaquina;// Es el numero que piensa la maquina
		Scanner sc = new Scanner(System.in);
		int nUsuario;// Son los numeros que va introduciendo el usuario

		// Vamos a calcular N que es el limite superior del rango.

		

			nLimit = rnd.nextInt(100000 - 1000 + 1);
			nMaquina = rnd.nextInt(nLimit - 1 + 1);
			do {
			System.out.println("He pensado un numero entre 1 y " + nLimit + " adivina cual es");

			nUsuario = sc.nextInt();

			if (nUsuario > nMaquina) {
				System.out.println("El numero que he pensado es menor");
			} else if (nUsuario < nMaquina) {
				System.out.println("El numero que he pensado es mayor");

			}
		} while (nUsuario != nMaquina);

		if (nUsuario == nMaquina) {
			System.out.println("Enhorabuena, ha acertado");
		}

	}

}
