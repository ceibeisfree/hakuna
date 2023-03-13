package es.ifp.programacion.funciones;

import java.util.Date;

/**
 * Clase con diferentes ejemplos de definición y llamadas a funciones y procedimientos, así
 * como llamadas a una función/procedimiento desde otra función/procedimiento.
 * 
 * 1.- Función con parámetros.
 * 2.- Función sin parámetros.
 * 3.- Procedimiento con parámetros.
 * 4.- Procedimiento sin parámetros.
 * 
 * 
 * 
 * @author juan
 *
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double random;
		
		
		escribirTitulo("Programa principal con procedimientos.");
		
		random = dameNumeroAleatorio();
		escribirTitulo("Número aleatorio: "+random);
		
		
		escribirTitulo("La fecha actual es:"+dameFechaActual());
		
		
		escribirTitulo("Fin del programa principal");
	}
	
	
	/**
	 * Función que utilizando la clase Math, el método random
	 * retorna un número aleatorio
	 * @return un tipo double comprendido entre 0.0 y 1.0
	 */
	public static double dameNumeroAleatorio() {
		return Math.random();
		
	}
	
	
	/**
	 * Función que retorna la fecha actual
	 * @return un tipo String con la fecha actual.
	 */
	public static String dameFechaActual() {
		return new Date().toString();
	}
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * Procedimiento que escribe en consola un separador, un título y otro separador
	 * @param titulo Cadena (String) que se imprime en consola.
	 */
	public static void escribirTitulo(String titulo) {
		escribirSeparador();
		escribirEnConsola(titulo);
		escribirSeparador();
		
	}
	
	
	/**
	 * Procedimiento que escribe en consola el parámetro cadena
	 * @param cadena un String que se muestra en la consola.
	 */
	public static void escribirEnConsola(String cadena) {
		System.out.println(cadena);
	}
	
	
	/**
	 * Procedimiento que escribe en consola un separador
	 */
	public static void escribirSeparador() {
		System.out.println("=======================================");
	}

}
