package es.ifp.programacion.uf2.recursividad;

import java.util.Scanner;

/**
 * Clase que utilizando una funcin recursiva obtiene
 * el actorial de n numero.
 * @author https:/github.com/ceibeisfree
 *
 */

public class recursividad {

	public static void main(String[] args) {
		
		//Bloque de definicion de variables
		
		int num;
		int result;
		Scanner sc = new Scanner(System.in);
	
		do {
			
		System.out.println("Introduzca un numero para calcular su factorial: ");
		num = Integer.parseInt(sc.nextLine());
		
		result = factorial (num);
		
		System.out.println("El factorial de "+num+" es: "+result);
		
		}while (num!=0);
				
	}
	
	/**
	 * Funcion recusiva que calcula el factorial del nmero entero pasado como parametro
	 * @param n numero enter del que se calcula el factorial 
	 * @returnel factorial del numero pasao com parametro
	 * 
	 * fac(n) = n * fact(n-1)
	 * condicion salida n==1
	 */
	
	public static int factorial(int n) {
		
		if (n<=1)
			return 1;
		else
			return n * factorial(n-1);
		
	}

}
