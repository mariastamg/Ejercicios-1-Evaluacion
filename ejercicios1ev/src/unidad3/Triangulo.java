package unidad3;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		/*
		 * En el m�todo main de una clase llamada Tri�ngulo escribe un programa que
		 * determine si tres n�meros reales que se introducen por teclado pueden ser las
		 * longitudes de los lados de un tri�ngulo. Si la respuesta es afirmativa,
		 * tendr� que responder a las preguntas siguientes: � �Es escaleno? � �Es
		 * equil�tero? � �Es is�sceles?
		 */
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el primer numero");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		num2 = sc.nextInt();
		System.out.println("Introduzca el tercer numero");
		num3 = sc.nextInt();

		if ((num1 == num2) && (num2 == num3)) {
			System.out.println("El triangulo es equilatero");
		} else if ((num1 == num2) || (num2 == num3) || (num3 == num1)) {
			System.out.println("El triangulo es isosceles");
		} else if ((num1 != num2) && (num2 != num3) && (num3 != num1)) {
			System.out.println("El triangulo es escaleno");
		}

	}

}
