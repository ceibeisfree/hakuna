package es.ifp.programacion.EjercicioPropuesto1;

import java.util.Scanner;

/**
 *  Ejercicio propuesto 1:

Definición de variables y constantes. Elección de tipos de datos. Asignación
Crea un programa en Java en el cual se declaren variables o constantes para almacenar los siguientes datos:

- Nombre
- Apellidos: Conjunto de caracteres alfanuméricos
- DNI: Debe incluir la letra.
- Edad: Valor numérico.
- ¿Es mayor de edad? (Deberá definirse como un booleano)
- Peso, en kg (Deberá permitir decimales)
- Número de teléfono.
- Dirección postal:
- Calle
- Número.
- Piso.
- Letra: Solo podrá contener un caracter.
- código postal.

Comportamiento del programa:

El programa solicitará a través de la consola cada uno de estos datos, exceptuando el dato de mayoría de edad.
El usuario los introducirá a través de teclado.
Los datos se asignarán a la variable/constante correspondiente.

Finalmente, el programa los mostrará por consola precidiendo cada dato con el título correspondiente.
*/

public class Ejercicio_Propuesto_1 {

	public static void main(String[] args) {
		
		// Definicion de variables 
		
		String nombre;
		String apellidos;
		String dni;
		int edad;
		boolean esMayorDeEdad = false;
		float peso;
		String telefono;
		String calle;
		int numero;
		int piso;
		char letra;
		String cp;
		
		String tmp;
		Scanner sc = new Scanner(System.in);
		
		// Instrucciones
		
		// Entrada de datos
		
		System.out.println("============= ENTRADA DE DATOS ============");
		
		System.out.println("1.Introduzca su nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("2.Introduzca sus apellidos: ");
		apellidos = sc.nextLine();
		
		System.out.println("3.Introduzca su dni: ");
		dni = sc.nextLine();
		
		System.out.println("4.Introduzca su edad: ");
		tmp = sc.nextLine();
		edad = Integer.parseInt(tmp);
		
		System.out.println("5.Introduzca su peso: ");
		tmp = sc.nextLine();
		peso = Float.parseFloat(tmp);
		
		System.out.println("6.Introduzca su telefono: ");
		telefono = sc.nextLine();
		
		System.out.println("7.Introduzca su calle: ");
		calle = sc.nextLine();
		
		System.out.println("8.Introduzca su numero de portal: ");
		tmp = sc.nextLine();
		numero = Integer.parseInt(tmp);
		
		System.out.println("9.Introduzca su piso: ");
		tmp = sc.nextLine();
		piso = Integer.parseInt(tmp);
		
		System.out.println("10.Introduzca la letra del piso: ");
		tmp = sc.nextLine();
		letra = tmp.charAt(0);
		
		System.out.println("11.Introduzca su codigo postal: ");
		cp = sc.nextLine();
		
		// Transformacion de datos
		
		esMayorDeEdad = (edad>=18);
		
		// Salida de datos
		
		System.out.println("============ ENTRADA DE DATOS ============");
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("DNI: "+dni);
		System.out.println("Edad: "+edad);
		System.out.println("¿Es mayor de edad?: "+esMayorDeEdad);
		System.out.println("Peso: "+peso);
		System.out.println("Telefono: "+telefono);
		System.out.println("Calle: "+calle);
		System.out.println("Portal: "+numero);
		System.out.println("Piso: "+piso);
		System.out.println("Letra: "+letra);
		System.out.println("Codigo Postal: "+cp);

		
		
		
		

	}

}
