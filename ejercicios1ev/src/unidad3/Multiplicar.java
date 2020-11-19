package unidad3;

import java.util.Scanner;

public class Multiplicar {

	public static void main(String[] args) {
/*En el método main de una clase llamada Multiplicar escribe un programa que
*ayude al aprendizaje de las tablas de multiplicar. El programa preguntará qué
*tabla se desea repasar (número entre 1 y 9). A continuación, preguntará el
*resultado de cada multiplicación de la tabla elegida, contabilizando cada fallo y
*mostrando la respuesta correcta. Al completar la tabla, el programa le dirá al
*usuario si ha aprobado (menos de 2 fallos) o ha suspendido (2 o más fallos).
*Después finalizar el repaso de cada tabla, se dará la opción de repasar otra o
*salir del programa.
*/
		int num;
		int resultado;
		int contador=0;
		String repeticion;
		Scanner sc=new Scanner(System.in);
		
		do {
		
		System.out.println("Introduzca el número de tabla que desea repasar");
		num=sc.nextInt();
		
		System.out.println("¿Cuanto es 1*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==1*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 2*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==2*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 3*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==3*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 4*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==4*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 5*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==5*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 6*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==6*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 7*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==7*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 8*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==8*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 9*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==9*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		System.out.println("¿Cuanto es 10*" +num+ "?");
		resultado=sc.nextInt();
		if(resultado==10*num) {
			System.out.println("El resultado es correcto");}
		else {System.out.println("El resultado es incorrecto");
		contador++;}
		
		if(contador<2) 
			System.out.println("Ha aprobado");
		else 
			System.out.println("Tiene "+contador+ " fallos. Ha suspendido");
	
		System.out.println("¿Desea repasar otra vez?");
		repeticion=sc.next();
		
		}while (repeticion.equalsIgnoreCase("si"));
		
			System.out.println("El repaso ha terminado");
		
		}
			

	}


