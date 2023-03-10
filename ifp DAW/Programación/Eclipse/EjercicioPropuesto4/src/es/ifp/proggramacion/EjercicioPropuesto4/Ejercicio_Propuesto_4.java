package es.ifp.proggramacion.EjercicioPropuesto4;

import java.util.Scanner;

/**
	Ejercicio propuesto 4:
	Operaciones con cadenas
	Crea un programa en Java que reciba por parte del usuario (a través de teclado) 
	cinco palabras y genere una salida en consola con los siguientes resultados:
	- Concatenación, en el mismo orden de entrada, de las cinco palabras separadas por un espacio en blanco.
	- Concatenación, en orden inverso a su entrada, de las cinco palabras separadas por el caracter '-'.
	
	
	Nota: No se podrá imprimir directamente las palabras introducidas a través de la salida estándar. 
	Deberá almacenarse en alguna variable temporal.
	
 * @author hakuna matata
 *
 */

public class Ejercicio_Propuesto_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// a. Declaracion de variables:
		
		String palabra1;
		String palabra2;
		String palabra3;
		String palabra4;
		String palabra5;
		
		Scanner sc = new Scanner(System.in);
		
		String tmp1;
		String tmp2;
		
		// b. Instrucciones
		
		// b.1 Entrada de datos
		
		System.out.println("Introduce la primera palabra:");
		palabra1 = sc.nextLine();
		
		System.out.println("Introduce la segunda palabra:");
		palabra2 = sc.nextLine();
		
		System.out.println("Introduce la tercera palabra:");
		palabra3 = sc.nextLine();
		
		System.out.println("Introduce la cuarta palabra:");
		palabra4 = sc.nextLine();
		
		System.out.println("Introduce la quinta palabra:");
		palabra5 = sc.nextLine();


		// b.2 Transformacion
		
		tmp1 = palabra1+", "+palabra2+", "+palabra3+", "+palabra4+", "+palabra5;
		
		tmp2 = palabra5+", "+palabra4+", "+palabra3+", "+palabra2+", "+palabra1;
		
		// b.3 Salida de datos
		
		System.out.println("Concatenación, en el mismo orden de entrada: "+tmp1);
		tmp1 = sc.nextLine();
		
		System.out.println("Concatenación, en orden inverso a su entrada: "+tmp2);
		tmp2 = sc.nextLine();
		
	}

}
