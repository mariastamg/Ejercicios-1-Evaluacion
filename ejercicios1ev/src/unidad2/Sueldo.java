package unidad2;

import java.util.Scanner;

public class Sueldo {

	public static void main(String[] args) {
/*En el m�todo main de una clase Java llamada Sueldo escribe un programa que
*resuelva el problema siguiente: un vendedor recibe un sueldo base m�s un 10%
*extra por comisi�n de sus ventas; el vendedor desea saber cu�nto dinero
*obtendr� por concepto de comisiones, por las tres ventas que realiza en el mes
*y el total que recibir� en el mes, teniendo en cuenta su sueldo base y las
*comisiones. Se utilizar� el teclado para la entrada de datos y la consola para la
*salida. Para resolver este problema est� permitido utilizar la clase Scanner.
*/
int sueldo;
int venta1;
int venta2;
int venta3;

Scanner sc=new Scanner (System.in);
System.out.println("Introduzca su salario base");
sueldo=sc.nextInt();
System.out.println("Introduzca el importe de la primera venta");
venta1=sc.nextInt();
System.out.println("Introduzca el importe de la segunda venta");
venta2=sc.nextInt();
System.out.println("Introduzca el importe de la tercera venta");
venta3=sc.nextInt();

System.out.println("Su sueldo neto es de:"+(sueldo+(venta1*0.10)+(venta2*0.10)+(venta3*0.10)));



	}

}
