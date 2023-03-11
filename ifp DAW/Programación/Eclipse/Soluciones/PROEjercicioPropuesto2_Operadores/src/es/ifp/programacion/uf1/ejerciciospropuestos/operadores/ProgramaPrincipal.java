package es.ifp.programacion.uf1.ejerciciospropuestos.operadores;


import java.util.Scanner;

/**
 * 

Crea un programa en Java que realice la comparación entre dos números indicando si el primer número introducido es mayor, menor o igual.

El programa recibirá los dos números por teclado que serán introducidos por el usuario.

Una vez realizada la comparación se mostrará el resultado final en la consola.

Por ejemplo:
Entrada:
Número 1:  5
Número 2:  6

Salida: 
¿El número 1 es menor que el número 2?: true
¿El número 1 es igual que el número 2?: false
¿El número 1 es mayor que el número 2?: false
 
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		//1.- Declaración de variables
		String dato1;
		String dato2;
		
		boolean esMenor;
		boolean esIgual;
		boolean esMayor;
		
		int dato1n;
		int dato2n;
		
		
		
		//2.- Instrucciones
		
		//2.1.- Entrada de datos
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número:");
		dato1 = sc.nextLine();
		
		System.out.println("Introduzca el segundo número");
		dato2 = sc.nextLine();
		
		
		
		//2.2.- Transformación
		
		dato1n = Integer.parseInt(dato1);
		dato2n = Integer.parseInt(dato2);
		
		esMenor = (dato1n<dato2n);
		esIgual = (dato1n==dato2n);
		esMayor = (dato1n>dato2n);
		
		
		//2.3.- Salida de datos
		
		System.out.println("¿El número 1 es menor que el número 2?: "+esMenor);
		System.out.println("¿El número 1 es igual que el número 2?: "+esIgual);
		System.out.println("¿El número 1 es mayor que el número 2?: "+esMayor);
		
		
		
	}

}
