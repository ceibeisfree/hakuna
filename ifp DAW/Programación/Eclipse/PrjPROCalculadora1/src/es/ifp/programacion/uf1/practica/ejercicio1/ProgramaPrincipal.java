/** Parte 1: Utilizando estructuras básicas de control.
	
	Realizar una calculadora en el lenguaje de programación Java.
	
	Esta calculadora no tendrá interfaz gráfica, sino que será de tipo textual (la información al usuario
	se le pedirá y se mostrará por la consola).
	
	El enunciado es el siguiente:
	
	Una empresa de gestión de aguas (dedicada al control de pérdidas) desea implementar una
	calculadora para poder ejecutar en un sistema Linux que no dispone de interfaz gráfica.
	Tras la reunión entre el cliente y el analista informático se establecen los siguientes requisitos que
	se envían al programador: 

	1. El nombre del Proyecto debe ser 
	
							PrjPROCalculadora1.
								
	2. Debe poseer una clase llamada 
	
						   	 ProgramaPrincipal 
								
	ubicada en el paquete 
				
				es.ifp.programacion.uf1.practica.ejercicio1.
				
				 
	Esta clase contendrá el método main (punto de inicio de ejecución) */

package es.ifp.programacion.uf1.practica.ejercicio1;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		// A. Declaracion de variables
		
		/** 3. La calculadora solo funcionará con números decimales. */
		
		float num1=0.0f;
		float num2=0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		int sign=0;
		
		// B. Instrucciones
		
		/** 4. La primera línea deberá mostrar una cabecera como sigue:
	
	    ============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============ */
		
		System.out.println("");
		System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
		System.out.println("");
		
				// B.1 Entradada de datos
		
		
		/** 5. Tras la primera línea del apartado anterior, se mostrará un menú hasta que el usuario
			pulse la opción Salir. El menú se mostrará tal y como sigue:
			Introduzca una opción del menú:
			1. Sumar (+)
			2. Restar (-)
			3. Multiplicar (*)
			4. Dividir (/)
			5. Resto. (%)
			0. Salir (S o s)
			Introduzca una opción:
			6. El usuario podrá introducir un número del 0 al 5 o bien el operador correspondiente que
			se encuentra entre paréntesis.
			Por ejemplo, si un usuario introduce un “1” o bien un “+”, se ejecutará la operación de s
			suma. */
		
		System.out.println("");
		System.out.println("Introduzca una opción del menú:");
		
		System.out.println("");
		System.out.println("1. Sumar (+)");				   
		System.out.println("2. Restar (-)");
		System.out.println("3. Multiplicar (*)");
		System.out.println("4. Dividir (/)");
		System.out.println("5. Resto. (%)");
		System.out.println("0. Salir (S o s)");
		
		System.out.println("");
		System.out.println("Introduzca una opción:");
		sign = Integer.parseInt(sc.nextLine());
		
		
		
		System.out.println("");
		System.out.println("Introduzca el primer número:");
		num1 = Float.parseFloat(sc.nextLine());
		
		System.out.println("");
		System.out.println("Introduzca el segundo número:");
		num2 = Float.parseFloat(sc.nextLine());
				
				
				
				// B.2 Transformacion
				
		
				
				// B.3 Salida de datos
		
		/**	A continuación, se explican cada una de las opciones:
		1. Sumar (0.5 puntos)
		El programa mostrará al usuario:
		Introduzca el primer número:
		(el usuario introducirá el número y le dará al botón Enter)
		Introduzca el segundo número:
		(el usuario introducirá el número y le dará al botón Enter)
		El programa mostrará el resultado con el siguiente formato:
		===================================
		La suma de NUM1 y NUM2 es RESULTADO
		===================================
		Donde NUM1 y NUM2 son los números introducidos por el usuario y siendo
		RESULTADO el resultado de la operación suma.
		2. Restar (0.5 puntos)
		El programa mostrará al usuario:
		Introduzca el primer número:
		(el usuario introducirá el número y le dará al botón Enter)
		5
		Introduzca el segundo número:
		(el usuario introducirá el número y le dará al botón Enter)
		El programa mostrará el resultado con el siguiente formato:
		====================================
		La resta de NUM1 y NUM2 es RESULTADO
		====================================
		Donde NUM1 y NUM2 son los números introducidos por el usuario y siendo
		RESULTADO el resultado de la operación resta.
		3. Multiplicar (0.5 puntos)
		El programa mostrará al usuario:
		Introduzca el primer número:
		(el usuario introducirá el número y le dará al botón Enter)
		Introduzca el segundo número:
		(el usuario introducirá el número y le dará al botón Enter)
		El programa mostrará el resultado con el siguiente formato:
		=============================================
		La multiplicación de NUM1 y NUM2 es RESULTADO
		=============================================
		Donde NUM1 y NUM2 son los números introducidos por el usuario y siendo
		RESULTADO el resultado de la multiplicación de ambos números.
		4. Dividir (0,5 puntos)
		El programa mostrará al usuario:
		Introduzca el primer número:
		(el usuario introducirá el número y le dará al botón Enter)
		Introduzca el segundo número:
		(el usuario introducirá el número y le dará al botón Enter)
		El programa mostrará el resultado con el siguiente formato:
		==========================================
		La división entre NUM1 y NUM2 es RESULTADO
		6
		==========================================
		Donde NUM1 y NUM2 son los números introducidos por el usuario y siendo
		RESULTADO el resultado de la operación división.
		5. Resto o módulo (0,5 punto)
		El programa mostrará al usuario:
		Introduzca el primer número:
		(el usuario introducirá el número y le dará al botón Enter)
		Introduzca el segundo número:
		(el usuario introducirá el número y le dará al botón Enter)
		El programa mostrará el resultado con el siguiente formato:
		=======================================
		El resto entre NUM1 y NUM2 es RESULTADO
		=======================================
		Donde NUM1 y NUM2 son los números introducidos por el usuario y siendo
		RESULTADO el resultado de la operación resto, también denominada módulo.
		0 Salir (0,5 puntos)
		El programa se ejecutará una y otra vez hasta que el usuario pulse la opción 0. Al
		pulsar 0 el programa finalizará y mostrará un texto informativo “El programa ha
		finalizado”.
		En caso de no introducir un número del 0 al 6 se deberá mostrar un mensaje
		“Opción incorrecta” y a continuación mostrar de nuevo el menú para solicitar
		de nuevo la opción al usuario

	 * @author https:/github.com/ceibeisfree
	 *
	 */
	}

}
