package es.ifp.programacion.uf1.pseudocodigo;

import java.util.Scanner;

/**
 * Clase que dados dos numeros los suma.
 * 
 * @author hakuna matata
 *
 */

public class PrimerProgramaSuma {

	public static void main(String[] args) {
		
		// Bloque eclaracin de variables
		
		int num1;
		int num2;
		int result;
		Scanner sc = new Scanner(System.in);
		
		// Entrada de datos
		
		System.out.println("Introduzca el primer número:");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el segundo número:");
		num2 = Integer.parseInt(sc.nextLine());
		
		// Transformacion de datos
		
		result = num1 + num2;
		
		// Salida de datos
		
		System.out.println("Resultado de la suma: "+result);
		
		
	}

}
