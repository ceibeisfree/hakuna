package es.ifp.programacion.uf1.EjercicioPropuesto3;

import java.util.Scanner;

/**
 * Ejercicio propuesto 3:


Operadores y operaciones aritméticas
Crea un programa en Java que reciba cuatro datos numéricos introducidos por el usuario a través del teclado
Dos de estos datos serán valores enteros y los otros dos, valores reales.

El programa, además de realizar la declaración adecuada de variables y su asignación correspondiente, realizará los siguientes cálculos:

1.- La suma de los cuatro datos introducidos.
2.- La multiplicación de los valores introducidos.
3.- La resta de los datos introducidos siguiendo su orden de entrada en el programa.
4.- Aumenta en una unidad todos los datos introducidos

Ejemplo:
Entrada de información:
Dato1: 5
Dato2: 3
Dato3: 2,3
Dato4: 3,4

Salida: 
1.- La suma de los valores introducidos es: 13,7
2.- La multiplicación de los valores introducidos es: 117,3
3.- La resta de los valores introducidos es: -3,7
4.- Los valores tras aumentar una unidad son: 6, 4, 3,3 y 4,4.
*/

public class EjercicioPropuesto3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Declaracion de variables
		
		int dato1;
		int dato2;
		
		float dato3;
		float dato4;
		
		String tmp;
		float suma;
		float resta;
		float multi;
		
		Scanner sc = new Scanner(System.in);
		
		// 2. Intrucciones
		
		// 2.1 Entrada de datos
		
		System.out.println("Inroduce el primer numero entero");
		tmp = sc.nextLine();
		dato1 = Integer.parseInt(tmp);
		
		System.out.println("Introduce el segundo numero");
		tmp = sc.nextLine();
		dato2 = Integer.parseInt(tmp);
		
		System.out.println("Inroduce el tercer numero");
		tmp = sc.nextLine();
		dato3 = Float.parseFloat(tmp);
		
		System.out.println("Introduce el quarto numero");
		tmp = sc.nextLine();
		dato4 = Float.parseFloat(tmp);
		
		// 2.2 Trasformacion
		
		suma = dato1 + dato2 +dato3 + dato4;
		resta = dato1 - dato2 - dato3 - dato4;
		multi = dato1 * dato2 * dato3 * dato4;
		
		dato1++;
		dato2++;
		dato3++;
		dato4++;
		
		// 2.3 Salida de datos
		
		System.out.println("La suma de los cuatro datos introducidos es: "+suma);
		System.out.println("La multiplicación de los valores introducidos es: "+multi);
		System.out.println("La resta de los datos introducidos es: "+resta);
		System.out.println("Los valores tras aumentar una unidad son: "+dato1+", "+dato2+", "+dato3+", "+dato4 );
		
	}

}
