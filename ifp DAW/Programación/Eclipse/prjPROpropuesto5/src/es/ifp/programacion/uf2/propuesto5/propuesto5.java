package es.ifp.programacion.uf2.propuesto5;
/**
 * Ejercicio propuesto 5: Funciones y procedimientos
 *
 * Procedimientos y funciones
 * Crea un programa en Java implementando funciones o procedimientos siguiendo los siguientes requisitos:
 * 
 * 1.- Reverso
 * La función/procedimiento recibirá una cadena y retornará la cadena en orden inverso
 *
 * 2.- Revés
 * La función/procedimiento recibirá dos cadenas y retornará una cadena concatenando ambas en orden inverso. Esto es, el segundo parámetro se mostrará al principio, separadas por un guión.
 * Por ejemplo: Se recibe: "hola" y "adios". Retornará "adios-hola"
 * 
 * 3.- Contar vocales
 * La función/procedimiento recibirá una cadena y retornará el número de vocales (a,e,i,o,u) que contiene la cadena.
 *
 * 4.- Repite
 * La función/procedimiento recibirá dos parámetros, un String y un entero. La función retornará la concatenación del primer parámetro tantas veces como se indique en el número entero.
 *
 * 5.- Es positivo
 * Dado un número entero pasado como parámetro, la función/procedimiento devolverá true si es positivo el número, false en caso contrario.
 *
 * Comportamiento del programa:
 * Crea un programa principal que ejecute por orden las cuatro funciónes/procedimientos, pidiendo al usuario la información necesaria para ejecutarlo correctamente.
 * Define adecuadamente las funciones o procedimientos, nombres, parámetros y tipos de retorno.
 *
 * No se permitirá utilizar System.out.println en la implementación de los métodos de las operaciones arriba indicadas.
 * 
 * @author https:/github.com/ceibeisfree 
 */

import java.util.Scanner;

public class propuesto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// variables
		Scanner sc = new Scanner(System.in);
		String str;
		String str2 ;
		int numVeces;
		
		// Primera funcion
		System.out.println("1.- Introduzca la cadena para calcular su reverso");
		str = sc.nextLine();
		System.out.println("El reverso es: "+reverso(str));
		
		System.out.println("==========================================================");
		
		// Segunda funcion - reves
		System.out.println("2.- Introduzca la primera cadena para el reves");
		str = sc.nextLine();
		System.out.println("Introduzca la segunda cadena para el reves");
		str2 = sc.nextLine();
		System.out.println("El resultado del reves es: "+reves(str, str2));
		
		System.out.println("==========================================================");
		
		// Tercera funcion - cuenta vocales
		System.out.println("3.- Introduzca la cadena para contar vocales");
		str = sc.nextLine();
		System.out.println("El numero de vocales es: "+cuentaVocales(str));
		
		System.out.println("==========================================================");
		
		// Cuarta funcion - repetir
		System.out.println("4.- Introduzca la cadena a repetir");
		str = sc.nextLine();
		System.out.println("Introduzca el numero de veces: ");
		numVeces = Integer.parseInt(sc.nextLine());
		System.out.println("El resultado es: "+repite(str,numVeces));

		System.out.println("==========================================================");
		
		// Quinta funcion - esPositivo
		System.out.println("5.- Introduzca un numero para saber si es positivo o no:");
		numVeces = Integer.parseInt(sc.nextLine());
		System.out.println("¿Es positivo?"+esPositivo(numVeces));

		System.out.println("==========================================================");
	}
	
	/**
	 * Funcion que dada una cadena, la retorna en orden inverso
	 * @param cadena parametro de entrada de tipo String
	 * @return el String cadena en orden inverso
	 */
	
	public static String reverso(String cadena) {
		int lon = cadena.length();
		String str="";
		for (int contador=lon-1; contador >=0; contador--) {
			str = str + cadena.charAt(contador);			
		}
		return str;
		
	}
	
	/**
	 * Funcion que dada una cadena las intercambia de orden
	 * @param str1 primera cadena de tipo String
	 * @param str2 segunda cadena de tipo String
	 * @return la concatenacion de str2 y str1 separados por un guion.
	 */
	
	public static String reves(String str1, String str2) {
		return str2+"-"+str1;
	}
	
	/**
	 * Funcion que dada una cadena cuenta sus vocales
	 * @param cadena cadena de la que se cuenta las vocales
	 * @return un int con el numero de vocales
	 */
	
	public static int cuentaVocales(String cadena) {
		int numVocales = 0;
		int lon = cadena.length();
		char c;
		for (int i=0;i<lon;i++) {
			c = cadena.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u') 
				numVocales++;
		}
		
		return numVocales;
	}
		
	/**
	 * Funcion que concatena cadena el numero de veces indicado en el segundo paramero	
	 * @param cadena String a repetir
	 * @param veces entero con el numero de veces que se concatena
	 * @return un String concatenado tantas veces como se indica en el parametro veces
	 */
		
	public static String repite(String cadena, int numeroVeces) {
		String str="";
		for (int i=1;i<=numeroVeces;i++) {
			str=str+cadena;
		}
		return str;
	}
	
	/**
	 * Funcion que retorna true si el numero pasado como parametro es positivo, false sino 
	 * @param numero el numero a evaluar
	 * @return true si es positivo, false sino
	 */
	public static boolean esPositivo(int numero) {
		if (numero >0) 
			return true;
		else 
			return false;
		
		//return (numero>0)
	}

}
