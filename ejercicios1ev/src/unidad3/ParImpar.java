package unidad3;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
/*En el método main de una clase llamada ParImpar escribe un programa que
*diga si un número introducido por teclado es par o impar.
*/
		Scanner sc=new Scanner(System.in);
		int numero;
		
		System.out.println("Por favor, introduzca un numero:");
		numero=sc.nextInt();
		
		if(numero%2==0)
				System.out.println("El número " +numero+ " es par.");
		else
			   System.out.println("El número " +numero+ " es impar");
		

	}

}
