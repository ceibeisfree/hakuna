package es.ifp.programacion.uf2.ejercicio1.funciones;

import java.util.Date;

/**
 * Clase con diferentes ejemplos de definicion y llamadas a funciones y procedimientos,asi
 * como llamadas ana funcion/procedimiento desde otra funcion/procedimiento 
 * 
 * 1.-Funcion con parametros
 * 2.-Funcion sin parametros
 * 3.-Procedimiento con paramertos
 * 4.-Procedimiento sin parametros
 * 
 * 
 * @author https:/github.com/ceibeisfree
 *
 */

public class funciones {

	public static void main(String[] args) {
	
		// Llamada al procedimiento escribirSeparador
		escribirSeparador();
		
		// Llamada al procedimiento escribirEnConsola
		escribirEnConsola("Inicio del programa principal");  
		
		escribirSeparador();
	
		double random;
		
		escribirTitulo("Programa principal con procedimientos.");
				
		random = dameNumeroAleatorio();
		escribirTitulo("Numero aleatorio: "+random);
		
		escribirTitulo("La fecha actual es: "+dameFechaActual());
		
		escribirTitulo("Fin del programa principal.");
		
	}
	
	/**
	 * Funcion que utilizando la clase Math, el metodo randon
	 * retorna un numero aleatorio
	 * @return un tipo double comprendido entre 0.0 y 1.0
	 */
	
	public static double dameNumeroAleatorio() {
		return Math.random();
	}
	
	/**
	 * Fncion que retorna la fecha actual
	 * @return un tippo String con la fecha actual.
	 */
	
	public static String dameFechaActual( ) {
		return new Date().toString();
	}
	
	
	/**
	 * Procedimieno que escribe en consola un separador, u titulo y otro separador
	 * @param titulo Cadena un String que ee muestra en la consola.
	 */
	
	public static void escribirTitulo(String titulo) {
		escribirSeparador();
		escribirEnConsola(titulo);
		escribirSeparador();
	}
	
	/**
	 * Procedimiento que escrbe en consola el paramero cadena
	 * @param Cadena un String que ee muestra en la consola.
	 */
	
	public static void escribirEnConsola(String cadena) {
		System.out.println(cadena);
	}

	public static void escribirSeparador( ) {
		System.out.println("=======================================");
	}
}
