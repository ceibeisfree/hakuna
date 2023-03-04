package es.ifp.programacion.pseudocodigo.calculosalario;

import java.util.Scanner;


/**
 * Clase que hace el calculo del salario a partir
 * de dos datos introducidos por el usuario por consola.
 * 
 * Salario = num_hora * precio_por_hora
 * 
 * 
 * @author hakuna matata
 *
 */

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//definicion variables
		int num_horas=0;
		float precio_por_hora=0.0f;
		float salario=0.0f;
		Scanner sc = new Scanner(System.in);
		
		//Bloque de entrada de datos
		System.out.println("Introduzca el numero de horas");
		num_horas = Integer.parseInt(sc.nextLine());
		
		System.out.println("Introduzca el precio por hora");
		precio_por_hora = Float.parseFloat(sc.nextLine());
		
		//Bloque de transformacion
		salario = num_horas * precio_por_hora;
		
		//Bloque de salida
		
		System.out.println("El salario es: "+salario);

	}

}
