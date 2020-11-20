package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*
		 * En el m�todo main de una clase llamada Calculadora escribe un programa que
		 * funcione como una calculadora. El usuario tendr� que elegir con el teclado la
		 * operaci�n que desea realizar (suma, resta, multiplicaci�n o divisi�n) o salir
		 * del programa. Si elige una operaci�n, se pedir�n por teclado dos n�meros y a
		 * continuaci�n se mostrar� el resultado de la operaci�n con el formato n�mero1
		 * op n�mero2 = resultado, donde op ser� el s�mbolo que corresponda: +, -, x, /.
		 * Cada vez que se muestre resultado, el usuario podr� volver a elegir otra
		 * operaci�n o salir.
		 */

	String operacion,suma = null, resta, multiplicaci�n, division, respuesta;
		float num1 = 0, num2 = 0;
		Scanner sc=new Scanner (System.in);
		
		do {
	System.out.println("Introduzca la operaci�n a realizar");
	operacion=sc.next();
	
	
	switch (operacion.toLowerCase()) {
	case "suma":
		System.out.println("Introduzca el primer numero");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo n�mero");
		num2=sc.nextFloat();
		System.out.printf("%.1f + %.1f =" + (num1+num2), num1, num2);
		break;
	case "resta":
		System.out.println("Introduzca el primer numero");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo n�mero");
		num2=sc.nextFloat();
		System.out.printf("%.1f - %.1f =" + (num1-num2), num1, num2);
	    break;
	case "multiplicacion":
		System.out.println("Introduzca el primer numero");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo n�mero");
		num2=sc.nextFloat();
		System.out.printf("%.1f * %.1f =" + (num1*num2), num1, num2);
		break;
	case "division":
		System.out.println("Introduzca el primer numero");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo n�mero");
		num2=sc.nextFloat();
		System.out.printf("%.1f / %.1f =" + (num1/num2), num1, num2);
		break;
	}
	System.out.println("");
	System.out.println("�Quiere realizar otra operaci�n?");
	respuesta=sc.next();
	}while (respuesta.equalsIgnoreCase("si"));
	System.out.println("El programa ha terminado");
	}

}
