package es.ifp.programacion.ejerciciospropuestos.variables;


import java.util.Scanner;

/**
 * 
Crea un programa en Java en el cual se declaren variables o constantes para almacenar los siguientes datos:


- Nombre
- Apellidos: Conjunto de caracteres alfanuméricos
- DNI: Debe incluir la letra.
- Edad: Valor numérico.
- ¿Es mayor de edad? (Deberá definirse como un booleano)
- Peso, en kg (Deberá permitir decimales)
- Número de teléfono.
- Dirección postal:
Calle
Número.
Piso.
Letra: Solo podrá contener un caracter.
código postal.

Comportamiento del programa:
El programa solicitará a través de la consola cada uno de estos datos, exceptuando el dato de mayoría de edad.
El usuario los introducirá a través de teclado.
Los datos se asignarán a la variable/constante correspondiente.

Finalmente, el programa los mostrará por consola precidiendo cada dato con el título correspondiente.
*/


public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Bloque de declaración de variables
		String nombre;
		String apellidos;
		String dni;
		int edad;
		boolean esMayorDeEdad;
		float peso;
		String telefono;
		String calle;
		int numero;
		int piso;
		char letra;
		String cp;
		
		String tmp;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		
		//Entrada de datos
		
		System.out.println("============ ENTRADA DE DATOS ============");
		
		System.out.println("1.- Introduzca su nombre:");
		nombre = sc.nextLine();
		
		System.out.println("2.- Introduzca sus apellidos:");
		apellidos = sc.nextLine();
		
		System.out.println("3.- Introduzca su dni:");
		dni = sc.nextLine();
		
		System.out.println("4.- Introduzca la edad:");
		tmp = sc.nextLine();
		edad = Integer.parseInt(tmp);
		
		System.out.println("5.- Introduzca su peso:");
		tmp = sc.nextLine();
		peso = Float.parseFloat(tmp);
		
		System.out.println("6.- Introduzca su teléfono:");
		telefono = sc.nextLine();
		
		System.out.println("7.- Introduzca su calle:");
		calle = sc.nextLine();
		
		System.out.println("8.- Introduzca número de portal:");
		tmp = sc.nextLine();
		numero = Integer.parseInt(tmp);
		
		System.out.println("9.- Introduzca su piso:");
		tmp = sc.nextLine();
		piso = Integer.parseInt(tmp);
		
		System.out.println("10.- Introduzca la letra del piso:");
		tmp  = sc.nextLine();
		letra = tmp.charAt(0);
		
		System.out.println("11.- Introduzca su código postal:");
		cp = sc.nextLine();
		
		
		//Instrucciones
		
		//Transformación de datos
		esMayorDeEdad = (edad>=18);
		
		
		
		
		// Salida de datos
		System.out.println("============ ENTRADA DE DATOS ============");
		System.out.println("Nombre:"+nombre);
		
		System.out.println("Apellidos:"+apellidos);
		System.out.println("DNI:"+dni);
		System.out.println("Edad:"+edad);
		System.out.println("¿Es mayor de edad?:"+esMayorDeEdad);
		System.out.println("Peso:"+peso+" kg.");
		System.out.println("Teléfono:"+telefono);
		System.out.println("Calle:"+calle);
		System.out.println("Portal:"+numero);
		System.out.println("Piso:"+piso);
		System.out.println("Letra:"+letra);
		System.out.println("Código postal:"+cp);
		
		
		
		
		
		
		

	}

}
