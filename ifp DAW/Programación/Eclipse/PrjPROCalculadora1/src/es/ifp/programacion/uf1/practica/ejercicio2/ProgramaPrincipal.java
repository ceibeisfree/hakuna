package es.ifp.programacion.uf1.practica.ejercicio2;

import java.util.Scanner;

/**
	 * Parte 2: Utilizando funciones.
	La empresa desea mejorar el desarrollo implementando una nueva versión de la calculadora
	utilizando programación modular.
	Los requisitos son los siguientes:
	1. Debe poseer una clase llamada ProgramaPrincipal ubicada en el paquete
	es.ifp.programacion.uf1.practica.ejercicio2. Esta clase contendrá el método main (punto
	de inicio de ejecución).
	2. Esta clase estará en el mismo proyecto que el ejercicio de la parte 1.
	3. Se mostrará la misma cabecera.
	4. El comportamiento del menú será igual, se deberá mostrar una y otra vez hasta que el
	usuario pulse la opción 0, o bien, las letras ‘S’ y ‘s’.
	5. El nuevo menú incorporará una nueva opción: el cálculo del número factorial. Se elimina
	la opción del cálculo del resto.
	Introduzca una opción del menú:
	Sumar (+)
	Multiplicar (*)
	Dividir (/)
	Factorial. (!)
	Salir (S o s)
	Introduzca una opción:
	6. Cada una de las opciones deberá implementarse en una función diferente.
	7. Las funciones deberán tener el siguiente formato:
	float NOMBRE_FUNC (float num1, float num2)
	Donde NOMBRE_FUNC podrá ser sumar, restar, multiplicar, dividir o factorial
	8. No está permitido el uso de la sentencia System.out.println dentro de las funciones
	ya que no tenemos funciones que no retornen datos.
	9. La función factorial tendrá un comportamiento tal y como se indica:
	a. El factorial de un número es el producto de todos los números desde el número
	introducido hasta el 1. Por ejemplo: el factorial de 5 es: 5*4*3*2*1 = 120.
	b. Crea una función llamada factorial, la cual calcula el número factorial de un
	número mayor que cero.
	c. La función tendrá un único parámetro de tipo entero.
	d. La función retornará un entero que será el factorial del número pasado como
	parámetro.
	e. En caso de introducirse un valor menor o igual a cero, se mostrará el siguiente
	mensaje: “Error, valor no válido. Introduzca un valor superior a 0”.
	8
	10. Las opciones tendrán las siguientes puntuaciones:
	Sumar (+): 0,5 puntos
	Restar (-): 0,5 puntos.
	Multiplicar (*): 0,5 puntos.
	Dividir (/): 0,5 puntos.
	Factorial. (!): 1 punto.
	Salir (S o s): 0,5 puntos.
	
 * @author hakuna matata
 *
 */
public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		
		Scanner sc = new Scanner(System.in);
		String str;
		int lon;
		
		
		System.out.println("");
		System.out.println("============ CALCULADORA :: GESTIÓN DE AGUAS, SL ============");
		System.out.println("");
		
		do {
		muestraMenu();
		System.out.println("Introduzca la opción a ejecutar:");
		String opcion = sc.nextLine();
		float num1=0.0f;
		float num2=0.0f;
		
		float result=0.0f;
		
		switch {
			case "1": 
				System.out.println("Sumar (+)");
				str = sc.nextLine();
				System.out.println("");
				System.out.println("Introduzca el primer número:");
				num1 = Float.parseFloat(sc.nextLine());
				System.out.println("");
				
				System.out.println("Introduzca el segundo número:");
				num2 = Float.parseFloat(sc.nextLine());
				
				result = num1 + num2;
				System.out.println("===================================");
				System.out.println("La suma de NUM1 y NUM2 es RESULTADO");
				System.out.println("===================================");
				System.out.println(result);
				break;
				
			case "2": 
				System.out.println("Restar (-) ");
				str = sc.nextLine();
				
				System.out.println("");
				System.out.println("Introduzca el primer número:");
				num1 = Float.parseFloat(sc.nextLine());
				
				System.out.println("");
				System.out.println("Introduzca el segundo número:");
				num2 = Float.parseFloat(sc.nextLine());
				
				result = num1 - num2;
				System.out.println("====================================");
				System.out.println("La resta de NUM1 y NUM2 es RESULTADO");
				System.out.println("====================================");
				System.out.println(result);
				break;
				
			case "3": 
				System.out.println("Multiplicar (*)");
				System.out.println("");
				System.out.println("Introduzca el primer número:");
				num1 = Float.parseFloat(sc.nextLine());
				
				System.out.println("");
				System.out.println("Introduzca el segundo número:");
				num2 = Float.parseFloat(sc.nextLine());
				
				result = num1 * num2;
				System.out.println("=============================================");
				System.out.println("La multiplicación de NUM1 y NUM2 es RESULTADO");
				System.out.println("=============================================");
				System.out.println(result);				
				break;
				
			case "4": 
				System.out.println("Dividir (/)"); 
				System.out.println("");
				System.out.println("Introduzca el primer número:");
				num1 = Float.parseFloat(sc.nextLine());
				
				System.out.println("");
				System.out.println("Introduzca el segundo número:");
				num2 = Float.parseFloat(sc.nextLine());
				
				result = num1 / num2;
				System.out.println("==========================================");
				System.out.println("La división entre NUM1 y NUM2 es RESULTADO");
				System.out.println("==========================================");
				System.out.println(result);
				break;
				
			case "5": 
				System.out.println("Resto (%)"); 
				System.out.println("");
				System.out.println("Introduzca el primer número:");
				num1 = Float.parseFloat(sc.nextLine());
				
				System.out.println("");
				System.out.println("Introduzca el segundo número:");
				num2 = Float.parseFloat(sc.nextLine());
				
				result = num1 % num2;
				System.out.println("=======================================");
				System.out.println("El resto entre NUM1 y NUM2 es RESULTADO");
				System.out.println("=======================================");
				System.out.println(result);
				break;
			
			case "0": 
				break;
		System.out.println("Opción incorrecta");break;
		
		}
		while (!opcion.equals("5"));
		
		System.out.println("Fin de la ejecución del programa");
	}
	
	
	
	public static void muestraMenu() {
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
		
	}
	
	
	public static int result(String str) {
		return str.length();
	}
	
	

}
