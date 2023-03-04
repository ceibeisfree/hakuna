package es.ifp.programacion.uf1.condicional2ex;

import java.util.Scanner;

/*
Enunciado:

Dados dos números, el programa indicará si el primer número es mayor, menor o igual que el segundo.

Por ejemplo:

>Introduce el primer número:
5
>Introduce el segundo número:
6

> El primer número es menor que el segundo número.
*/

public class CondicionalSegundoEjercicio {

	public static void main(String[] args) {
		
		//Definicion e inicializacion de variable.
		int num1 = 0;
		int num2 = 0;
		Scanner sc = new Scanner(System.in);
		
		//Entrada de datos
		System.out.println("Introduzca el primer numero");
		num1 = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el segundo numero");
		num2 = Integer.parseInt(sc.nextLine());
		
		if (num1<num2) {
			System.out.println("El primer numero es menor que el segundo numero");
		}
		else {
			if (num1==num2) {
				System.out.println("Los numeros son iguales");
			}
			else {
				System.out.println("El primer numero es mayor que el segundo numero");
			}
		}
	
	
	
	}

}
