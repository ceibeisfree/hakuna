package es.ifp.programacion.estructura.segun;

import java.util.Scanner;

/**
 * Ejemplo de uso de switch en Java
 * (segun en PSeInt)
 * 
 * El usuario introduce un numero y si es 1, 2 o 3 se muestra un mensaje personalizado.
 * En otro caso se muestra un mensaje general
 * 
 * @author hakuna matata
 *
 */

public class EstructuraSwitch {

	public static void main(String[] args) {

		int num=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		num = Integer.parseInt(sc.nextLine());
		
		switch(num) {
		
			case 1:
				System.out.println("El numero es 1");
				break;
				
			case 2:
				System.out.println("El numero es 2");
				break;
				
			case 3:
				System.out.println("El numero es 3");
				break;
				
			default:
				System.out.println("El numero no es 1, 2 ni 3");

		}
		
		System.out.println("Continua la ejecucion del programa");
		
	}

}
