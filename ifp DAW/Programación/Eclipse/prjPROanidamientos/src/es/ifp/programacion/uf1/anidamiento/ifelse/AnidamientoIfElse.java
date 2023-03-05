package es.ifp.programacion.uf1.anidamiento.ifelse;

import java.util.Scanner;

/**
 * Escribir un programa que dada una nota academica
 * muestro en pantalla si es suspenso, aprobado, bien. notable o sobresaliente
 * @author hakuna matata
 *
 */

public class AnidamientoIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Definicion de variables
		
		int nota=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la nota del alumno");
		nota = Integer.parseInt(sc.nextLine());
		
		if (nota>=9)
			System.out.println("Sobrsaliente");
		
		else {
			
			if (nota>=7)
				System.out.println("Notable");
			
			else {
				
				if (nota>=6)
					System.out.println("Bien");
				
				else {
					
					if (nota>=5)
						System.out.println("Aprobado");
					
					else
						System.out.println("Suspnso");
					
				}
			}
		}
		
		System.out.println("El programa continua...");
		
	}

}
