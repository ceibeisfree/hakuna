package es.ifp.programacion.uf2.propuesto4;

import java.util.Scanner;

/**
 * Enuciado ejercicio propuesto 4:
 * Crea un programa en Java en el que modularices lo maximo la resolucion de los difernes problema que se pantean:
 * 
 * El programa mostrara el siguiente menu:
 * 1.-Mayusculas
 * 2.-Longitud de una cadena
 * 3.-Numero aleatorio
 * 4.-Salir
 * 
 * Comprtamiento del programa:
 * El Programa mostrara inicialmente este menu.
 * Si el usuario selecciona la opcion 1, se pedira al usuario una cadena. El programa retornara el numero de caracteres de dicha cadena
 * Si el usuario selecciona la opcion 2, s imprimira la longitud de una cadena que el ususario introducira por teclado
 * la opcion 3, mostrara un numero aleatorio entre 0.0 y 1.0
 * Si pulsa la opcion 4, el programa finalizara
 * 
 * No se permitira utilizar System.println en la implementacion de los metodos de las operaciones arriba indicadas
 * @author https:/github.com/ceibeisfree
 *
 */

public class propuesto4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaracion variables 
		
		String opcion;
		Scanner sc = new Scanner(System.in);
		String str;
		int lon;
		
		do {
			
			muestraMenu();
			System.out.println("Introduce Opcion: ");
			opcion = sc.nextLine();
			
			switch(opcion) {
			
			case "1":
				System.out.println("Introduce la cadena a pasar a Mayusculas: ");
				str = sc.nextLine();
				str = mayusculas(str);
				System.out.println("La cadena en mayusculas es: "+str);
				break;
				
			case "2":
				System.out.println("Introduce la cadena a para calcular su longitud: ");
				str = sc.nextLine();
				lon = longitudCadena(str);
				System.out.println("La longitud de la cadena es: "+lon);
				break;
				
			case "3":
				System.out.println("El numero aleatorio es: "+numeroAleatorio());
				break;
				
			case "4":
				break;
			default:
				System.out.println("Opcion incorrecta");
			
			}

		} while(!opcion.equals("4")); // el buclle se ejecuta siempre opcion != 4
	
	}
	
	/**
	 * Prcedimieno que muestra en consola el menu
	 */
	
	public static void muestraMenu( ) {
		//ojo falta implementacion
		
		System.out.println("====================================");
		System.out.println("Ejercicio propuesto 4");
		System.out.println("====================================");
		System.out.println("1.-Mayusculas");
		System.out.println("2.-Longitud de una cadena");
		System.out.println("3.-Numero aleatorio");
		System.out.println("4.-Salir");
		
	}
	
	/**
	 * Funcion que dada una cadena pasada como parametro, la reorna en matusculas
	 * @param cadena El String original
	 * @return Un String convertido a Mayusculas
	 */
	
	public static String mayusculas(String cadena) {
		return cadena.toUpperCase();
	}
	
	/**
	 * Funcion que calcula la longitud de la cadena pasada como arametro
	 * @param cadena String para el que se va a calcular su longitud
	 * @return un int con la longitud de la cadena
	 */
	public static int longitudCadena(String cadena) {
		return cadena.length();
	}
	
	/**
	 * Funcion que utilizando la fumcion random retorna un numro aleatrio
	 * @return u double aleatorio comprendido entre 0.0 y 1.0
	 */
	public static double numeroAleatorio() {
		return Math.random();
	}

}
