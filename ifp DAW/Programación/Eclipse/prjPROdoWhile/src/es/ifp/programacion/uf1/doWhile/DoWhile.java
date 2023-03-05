package es.ifp.programacion.uf1.doWhile;

import java.util.Scanner;

/**
 * El usuario introducira un numero para adivinar el que propone la maquina
 * Hasta que no se acierte no se acabara la ejecucion del programa
 * 
 * @author hakuna matata
 *
 */

public class DoWhile {

	public static void main(String[] args) {
		
	
		int num=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un numero: ");
			num = Integer.parseInt(sc.nextLine());
		
			
		} while (num!=100);
		
		System.out.println("Sale del bucle, continua la ejecucion...");

		
	}

}
