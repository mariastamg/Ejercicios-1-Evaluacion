package unidad3;

import java.util.Scanner;

public class TrianguloFloyd {

	static Scanner sc = new Scanner(System.in);

	public static int leer_entero(String cadena) {
		int n;
		System.out.print(cadena);
		n = sc.nextInt();
		return n;
	}

	public static void pintar(int alt) {
		int fila = 0;
		int colum = 0;
		int i=1;//contador
		for (fila = 0; fila < alt; fila++) {
			for (colum = 0; colum < alt; colum++) {
				if (colum <= fila)
					System.out.print(i++);
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		/*
		 * En el método main de una clase llamada TrianguloFloyd escribe un programa que
		 * genere él triangulo de Floyd para un número de filas que introduciremos por
		 * teclado y lo muestre por pantalla. Por ejemplo, si el número de filas es 4 el
		 * triángulo de Floyd será: 1 2 3 4 5 6 7 8 9 10
		 * 
		 */
		int a = leer_entero("Introduzca la altura de la piramide: ");
		pintar(a);
	}

}
