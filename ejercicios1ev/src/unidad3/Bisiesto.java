package unidad3;

import java.util.Scanner;

public class Bisiesto {

	public static void main(String[] args) {
/*En el m�todo main de una clase llamada Bisiesto escribe un programa que
*utilizando una �nica expresi�n l�gica determine si un a�o es o no es bisiesto. El
*a�o se introducir� por teclado y el resultado lo mostrar� en la pantalla. Un a�o
*es bisiesto si es m�ltiplo de 4. Los a�os m�ltiplos de 100 no son bisiestos, salvo
*si son m�ltiplos de 400.
*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca un a�o para comprobar si es bisiesto:");
		int a�o=sc.nextInt();
		if((a�o%4==0)&&(a�o%100!=0)||(a�o%400==0)) {
			System.out.println("El a�o introducido es bisiesto");
		}else {System.out.println("El a�o introducido no es bisiesto");
		
		}
		
		

	}

}
