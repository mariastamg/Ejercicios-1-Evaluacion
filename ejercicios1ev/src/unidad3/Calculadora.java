package unidad3;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*
		 * En el método main de una clase llamada Calculadora escribe un programa que
		 * funcione como una calculadora. El usuario tendrá que elegir con el teclado la
		 * operación que desea realizar (suma, resta, multiplicación o división) o salir
		 * del programa. Si elige una operación, se pedirán por teclado dos números y a
		 * continuación se mostrará el resultado de la operación con el formato número1
		 * op número2 = resultado, donde op será el símbolo que corresponda: +, -, x, /.
		 * Cada vez que se muestre resultado, el usuario podrá volver a elegir otra
		 * operación o salir.
		 */

	String operacion,suma = null, resta, multiplicación, division, respuesta;
		float num1 = 0, num2 = 0;
		Scanner sc=new Scanner (System.in);
		
		do {
	System.out.println("Introduzca la operación a realizar");
	operacion=sc.next();
	
	
	switch (operacion.toLowerCase()) {
	case "suma":
		System.out.println("Introduzca el primer numero");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo número");
		num2=sc.nextFloat();
		System.out.printf("%.1f + %.1f =" + (num1+num2), num1, num2);
		break;
	case "resta":
		System.out.println("Introduzca el primer numero");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo número");
		num2=sc.nextFloat();
		System.out.printf("%.1f - %.1f =" + (num1-num2), num1, num2);
	    break;
	case "multiplicacion":
		System.out.println("Introduzca el primer numero");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo número");
		num2=sc.nextFloat();
		System.out.printf("%.1f * %.1f =" + (num1*num2), num1, num2);
		break;
	case "division":
		System.out.println("Introduzca el primer numero");
		num1=sc.nextFloat();
		System.out.println("Introduzca el segundo número");
		num2=sc.nextFloat();
		System.out.printf("%.1f / %.1f =" + (num1/num2), num1, num2);
		break;
	}
	System.out.println("");
	System.out.println("¿Quiere realizar otra operación?");
	respuesta=sc.next();
	}while (respuesta.equalsIgnoreCase("si"));
	System.out.println("El programa ha terminado");
	}

}
