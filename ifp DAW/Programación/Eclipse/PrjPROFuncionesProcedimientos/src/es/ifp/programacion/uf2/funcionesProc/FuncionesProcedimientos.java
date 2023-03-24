package es.ifp.programacion.uf2.funcionesProc;

/**
 * Clase que en su programa principal
 * realiza llamadas funciones y procedimientos
 * 
 * @author https:/github.com/ceibeisfree
 *
 */

import java.util.Scanner;

public class FuncionesProcedimientos {

	public static void main(String[] args) {
		
		// Declaracion e iniciciacion de variables
		int num=10;
		int num2=20;
		int resultado;
		
		// Llamo a la funcion sumaDosNumers
		resultado = sumaDosNumeros(num, num2);
		
		System.out.println("El resultado de la suma  de num y num2 es "+resultado);
		
		// Llamo al procedimiento proEscribeNumero
		proEscribeNumero(num2);
		
		proEscribeHola();
		
		resultado = funRetornaNumero();
		System.out.println("El valor retornado por la funcion funRetornaNumero es "+resultado);
		
	}
	
	/**Procedimiento que escibe en consola el valor pasado como parametro o argmento
	 * @param param1 valor entero que entra en la fncion y se imprime en consola
	 */
	public static void proEscribeNumero(int param1) {
		
		System.out.println("El valor pasado a proEscrineNumero es "+param1);
	}
	
	
	public static void proEscribeHola() {
		
		System.out.println("Fin del programa");
	}
	/**
	 * Funcion que dados dos numeros realiza la suma de ellos,
	 * @return un int con la suma de los dos numeros
	 */
	
	public static int sumaDosNumeros(int param1, int param2) {
		
		int result;
		result = param1+param2;
		return result;
	}
	
	/**
	 * Funcion que retorna el valr entero 44
	 * @return un entero con el valor 44.
	 */
	
	public static int funRetornaNumero() {
		
		return 44;
	}

}
