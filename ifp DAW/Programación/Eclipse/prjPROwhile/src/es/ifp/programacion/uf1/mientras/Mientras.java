package es.ifp.programacion.uf1.mientras;

import java.util.Scanner;

/**
 * Programa que dado un numero por parte del usuario
 * imprime todos los numeros empezando por el cero y terminando
 * por el numero que ha introducido el usuario
 * @author hakuna matata
 *
 */
public class Mientras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// definir variables
		int num;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Intoduce un numero");
		num = Integer.parseInt(sc.nextLine());
		
		while (contador <= num) {
			System.out.println(contador);
			contador++; //contador = contador +1;
			
		}
		
		System.out.println("Sale del bucle");
				

	}

}
