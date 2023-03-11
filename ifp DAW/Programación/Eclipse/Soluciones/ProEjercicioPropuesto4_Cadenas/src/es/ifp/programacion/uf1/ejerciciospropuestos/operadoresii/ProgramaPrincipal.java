package es.ifp.programacion.uf1.ejerciciospropuestos.operadoresii;

import java.util.Scanner;

/**
 * 

Crea un programa en Java que reciba por parte del usuario (a través de teclado) cinco palabras y 
genere una salida en consola con los siguientes resultados:
- Concatenación, en el mismo orden de entrada, de las cinco palabras separadas por un espacio en blanco.
- Concatenación, en orden inverso a su entrada, de las cinco palabras separadas por el caracter '-'.

*/

public class ProgramaPrincipal {

	public static void main(String[] args) {
			//1.- Declaración de variables
		
			String cadena1;
			String cadena2;
			String cadena3;
			String cadena4;
			String cadena5;
			
			Scanner sc = new Scanner(System.in);
			
			String tmp1;
			String tmp2;
			
		
			//2.- Instrucciones
		
			//2.1.- Entrada de datos
			
			System.out.println("Introduzca la primera palabra:");
			cadena1= sc.nextLine();
			
			System.out.println("Introduzca la segunda palabra:");
			cadena2= sc.nextLine();
			
			System.out.println("Introduzca la tercera palabra:");
			cadena3= sc.nextLine();
			
			System.out.println("Introduzca la cuarta palabra:");
			cadena4= sc.nextLine();
			
			System.out.println("Introduzca la quinta palabra:");
			cadena5= sc.nextLine();
			
			
			//2.2.- Transformación
			tmp1 = cadena1+" "+cadena2+" "+cadena3+" "+cadena4+" "+cadena5;
			
			tmp2 = cadena5+"-"+cadena4+"-"+cadena3+"-"+cadena2+"-"+cadena1;
			
			
			
			
			
			//2.3.- Salida de datos
		
			System.out.println("La concatenación en orden de entrada es:"+tmp1);
			System.out.println("La concatenación en orden inverso es:"+tmp2);
			
			
	}

}
