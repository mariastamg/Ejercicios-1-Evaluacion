package unidad3;

import java.util.Scanner;

public class Hora {

	public static void main(String[] args) {
/*En el método main de una clase llamada Hora escribe un programa que lea una
*hora (horas, minutos y segundos) desde el teclado y muestre en la pantalla la
*hora correspondiente al segundo siguiente. Realiza la lectura de los datos de
*entrada como estimes oportuno.*/
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca la hora:");
		int hora=sc.nextInt();
		System.out.println("Introduzca los minutos:");
		int minutos=sc.nextInt();
		System.out.println("Introduzca los segundos:");
		int segundos=sc.nextInt();
		segundos++;
		
		if(segundos>59) {
			segundos=0;
			segundos++;
			if(minutos>59){
				minutos=0;
				minutos++;
				if(hora>23){
					hora=0;}
			}
		}
		System.out.println("La hora introducida más un segundo es: "+hora+":"+minutos+":"+segundos);
				}
		
	
		

	}


