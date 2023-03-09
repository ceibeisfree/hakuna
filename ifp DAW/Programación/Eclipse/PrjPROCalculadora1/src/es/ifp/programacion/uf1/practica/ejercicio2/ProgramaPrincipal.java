package es.ifp.programacion.uf1.practica.ejercicio2;

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

	}

}
