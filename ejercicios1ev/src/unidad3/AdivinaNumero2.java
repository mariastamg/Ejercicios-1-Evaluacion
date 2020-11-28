package unidad3;

import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero2 {
	
	static Scanner sc = new Scanner(System.in);
	static int nLimitSup;
	static int nLimitInf;
	
	
	public static int aleatorio(int min, int max) {
		Random rnd = new Random();
		int num=rnd.nextInt(max + 1-min)+min;
		return num;
		
		
	}
	
	public static void adivinacion(int maquina) {
		String respuestaUsuario="";
		
		
		while (!respuestaUsuario.equalsIgnoreCase("acierto")) {
			System.out.println("El numero que he pensado es: " + maquina + "¿he acertado?");
			 respuestaUsuario=sc.nextLine();
			 if(!respuestaUsuario.equalsIgnoreCase("acierto")
					 && nLimitInf == nLimitSup) {
				 System.out.println("Has mentido en algun momento");
				 break;
			 }
			 else if(respuestaUsuario.equalsIgnoreCase("mayor")) {
				 nLimitInf=maquina +1;
				 maquina=aleatorio(nLimitInf, nLimitSup);
			 }
			 else if(respuestaUsuario.equalsIgnoreCase("menor")) {
				 nLimitSup=maquina-1;
				 maquina=aleatorio(nLimitInf, nLimitSup);
			 }
			 
		}
		//System.out.println("He acertado el: " + maquina);
		
		
	}
	
	public static void main(String[] args) {
		/*
		 * En el método main de una clase llamada AdivinoNumero escribe un programa para
		 * jugar al mismo juego del ejercicio 4, pero haciendo que el ordenador sea el
		 * adivino. En este caso el ordenador preguntará cual es el valor del límite
		 * superior y comenzará a adivinar eligiendo un número dentro del intervalo en
		 * base a alguna estrategia de búsqueda. Una vez elegido lo mostrará por
		 * pantalla preguntándole al usuario si ha acertado. El usuario le responderá
		 * acierto, mayor, menor. Si la respuesta es mayor o menor, el ordenador
		 * continuará con la búsqueda. Se ha de contemplar la posibilidad de que el
		 * usuario no responda la verdad cuando el ordenador pregunte si ha acertado.
		 */
		
		int nMaquina;
		
		
		//Limite
		System.out.println("¿Cual es el limite superior?");
		nLimitSup = sc.nextInt();
		sc.nextLine();
		nLimitInf =1;
		nMaquina = aleatorio(nLimitInf,nLimitSup);
		adivinacion(nMaquina);
		
		
		
		/*if((nMaquina==nPensado)&&(respuestaUsuario.equals("acierto")))
			System.out.println("Has acertado, dejamos de jugar");
			else if (nMaquina>nPensado) 
				System.out.println("Menor");
				else if(nMaquina<nPensado)
					System.out.println("Mayor");
				else if ((nMaquina==nPensado)&&(!respuestaUsuario.equals("acierto")))
				System.out.println("No es el numero, pero puedo estar mintiendo");*/
			}
		
		
	}
