package es.ifp.programacion.EjercicioPropuesto2;

import java.util.Scanner;

/**
 * Ejercicio propuesto 2:
Operadores y operaciones booleanas
Crea un programa en Java que realice la comparación entre dos números indicando si el primer número introducido es mayor, menor o igual.

El programa recibirá los dos números por teclado que serán introducidos por el usuario.

Una vez realizada la comparación se mostrará el resultado final en la consola.

Por ejemplo:
Entrada:
Dato1:  5
Dato2:  6

Salida: 
¿El número 1 es menor que el número 2?: true
¿El número 1 es igual que el número 2?: false
¿El número 1 es mayor que el número 2?: false

 * @author hakuna matata
 *
 */


public class Ejercicio_Propuesto_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Declaracion de variables
		
		String dato1;
		String dato2;
		
		boolean esMenor;
		boolean esIgual;
		boolean esMayor;
		
		int dato1n;
		int dato2n;
		
		// 2. Intrucciones
		
		// 2.1 Entrada de datos 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inroduce el primer numero");
		dato1 =	sc.nextLine();
		
		System.out.println("Introduce el segundo numero");
		dato2 = sc.nextLine();
		
		// 2.2 Trasformacion
		
		dato1n = Integer.parseInt(dato1);
		dato2n = Integer.parseInt(dato2);
		
		esMenor = (dato1n<dato2n);
		esIgual = (dato1n==dato2n);
		esMayor = (dato1n>dato2n);
		
		// 2.3 Salida de datos
		
		System.out.println("¿El numero 1 es menor que el numero 2?: "+esMenor);
		System.out.println("¿El numero 1 es igual que el numero 2?: "+esIgual);
		System.out.println("¿El numero 1 es mayor que el numero 2?: "+esMayor);

	}

}
