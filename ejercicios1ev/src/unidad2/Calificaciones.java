package unidad2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calificaciones {

	public static void main(String[] args) throws IOException {
/*En el método main de una clase Java llamada Calificaciones escribe un
*programa que resuelva el problema siguiente: un estudiante desea saber cuál
*será su promedio general en las tres materias que cursa y cuál será el promedio
*que obtendrá en cada una de ellas. Los criterios de calificación se establecen en
*la tabla siguiente:
*Los datos de entrada (calificación del examen y calificaciones de cada una de
*las tareas realizadas) se introducirán por teclado y los datos de salida (los
*promedios de cada asignatura y el promedio de las tres) se mostrarán en la
*consola con una precisión de dos decimales. Resolver el problema sin utilizar la
*clase Scanner.
*/
		double notaMatematicas;
		double notaFisica;
		double notaQuimica;
		double notaMedia;
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Introduzca su nota del examen de matematicas:");
		double examenMate=Double.parseDouble(in.readLine());
		System.out.println("Introduzca su nota de la practica 1 de matematicas:");
		double practicaMate1=Double.parseDouble(in.readLine());
		System.out.println("Introduzca su nota de la practica 2 de matematicas:");
		double practicaMate2=Double.parseDouble(in.readLine());
		System.out.println("Introduzca su nota de la practica 3 de matematicas:");
		double practicaMate3=Double.parseDouble(in.readLine());
		
		System.out.println("Introduzca su nota del examen de fisica:");
		double examenFisica=Double.parseDouble(in.readLine());
		System.out.println("Introduzca su nota de la practica 1 de fisica:");
		double practicaFisica1=Double.parseDouble(in.readLine());
		System.out.println("Introduzca su nota de la practica 2 de fisica:");
		double practicaFisica2=Double.parseDouble(in.readLine());
		
		System.out.println("Introduzca su nota del examen de quimica:");
		double examenQuimica=Double.parseDouble(in.readLine());
		System.out.println("Introduzca su nota de la practica 1 de quimica:");
		double practicaQuimica1=Double.parseDouble(in.readLine());
		System.out.println("Introduzca su nota de la practica 2 de quimica:");
		double practicaQuimica2=Double.parseDouble(in.readLine());
		System.out.println("Introduzca su nota de la practica 3 de quimica:");
		double practicaQuimica3=Double.parseDouble(in.readLine());
		
		notaMatematicas=(examenMate*0.90+((practicaMate1+practicaMate2+practicaMate3)/3)*0.10);
		System.out.printf("Su nota de matematicas es %.2f \n",notaMatematicas);
		notaFisica=(examenFisica*0.80+((practicaFisica1+practicaFisica2)/2)*0.20);
		System.out.printf("Su nota de fisica es %.2f \n",notaFisica);
		notaQuimica=(examenQuimica*0.85+((practicaQuimica1+practicaQuimica2+practicaQuimica3)/3)*0.15);
		System.out.printf("Su nota de quimica es %.2f \n",notaQuimica);
	    notaMedia=(notaMatematicas+notaFisica+notaQuimica)/3;
	    System.out.printf("Su nota media de las 3 asignaturas es %.2f \n",notaMedia);
	    
		
	}

}
