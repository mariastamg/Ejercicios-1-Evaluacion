package unidad2;

import java.util.Scanner;

public class Sueldo2 {

	public static void main(String[] args) {
/*En el método main de una clase Java llamada Sueldo escribe un programa que
*permita convertir las componentes de un color en el espacio RGB en sus
*componentes en el espacio YIQ, según las expresiones matemáticas siguientes:
*y=0,299r+0,587 g+0,114 b
*i=0,596 r−0,275 g−0,321b
*q=0,212 r−0,528 g+0,311b
*Se le pedirá al usuario que introduzca por teclado las componentes rgb (rojo,
*verde y azul).
*/
int r;
int g;
int b;

Scanner sc=new Scanner (System.in);
System.out.println("Introduzca un valor para r:");
r=sc.nextInt();
System.out.println("Introduzca un valor para g:");
g=sc.nextInt();
System.out.println("Introduzca un valor para b:");
b=sc.nextInt();

System.out.println("El valor de y es:"+((r*0.299)+(g*0.587)+(b*0.114)));
System.out.println("El valor de i es:"+((r*0.596)-(g*0.275)-(b*0.321)));
System.out.println("El valor de q es:"+((r*0.212)-(g*0.528)+(b*0.311)));


	}

}
