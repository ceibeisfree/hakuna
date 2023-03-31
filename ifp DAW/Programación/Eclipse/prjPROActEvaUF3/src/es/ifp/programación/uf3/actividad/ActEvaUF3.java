package es.ifp.programación.uf3.actividad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
	El ejercicio evaluable se compone de un ejercicio único con varias subproblemas a resolver.
	Una empresa dedicada al desarrollo de software necesita hacer un pequeño programa en Java 
	que se va a ejecutar en un sistema Linux. El programa no tendrá interfaz gráfico, sino que será a 
	través de la consola Linux donde se introducirá la información necesaria para la correcta ejecución 
	del mismo.
	El programa gestionará información en un fichero de texto donde se van a introducir datos 
	personales. Estos datos son: nombre, apellidos y correo electrónico. Los datos para cada usuario 
	se escribirán en una línea separados entre ellos por el carácter ‘;’
	1.- El programa mostrará un menú con las siguientes opciones:
	A) Crear fichero de texto. (0,5 pt.)
	B) Introducir información en el fichero. (1 pt.)
	C) Leer el fichero de texto. (1 pt.)
	D) Eliminar el fichero de texto. (0,5 pt.)
	E) Salir (0,5 pt).
	2.- Si el fichero no está creado, se creará adecuadamente. Todos los ficheros se crearán en 
	una subcarpeta denominada usuarios que estará ubicada dentro del proyecto de Eclipse.
	No se permitirá la creación de subcarpetas bajo esta carpeta.
	El usuario deberá tener en cuenta que los ficheros se crearán en esta carpeta. Esto es, si desea 
	leer un fichero tendrá que introducir la ruta completa, incluyendo esta carpeta ‘usuarios’.
	(0,5 pt.)
	4
	3.- El usuario accederá a las opciones de menú a través de la letra mayúsculas que precede el 
	texto del menú: (A, B, C, D, E). (0,5 pt)
	4.- Deberán desarrollarse las validaciones y comprobaciones que considere pertinentes el alumno 
	para un sencillo y correcto funcionamiento del programa. (1 pt.) 
	5.- Finalmente, si el usuario ya ha creado un fichero, la siguiente vez que se muestre el menú se 
	deberá mostrar al usuario, a modo informativo, la ruta en la que se encuentra el último fichero 
	creado (1,5 pt.)
	Por ejemplo:
	- Un usuario accede a la opción A y crea un fichero en la ruta: “usuarios” llamado
	usuarios.txt. Por tanto, la ruta absoluta de este fichero es: “usuarios/usuarios.txt”
	- Una vez creado este fichero, la siguiente vez que se muestre el menú aparecerá en la 
	última línea: 
	“Fichero creado por última vez: /usuarios/usuarios.txt”
	- Esto SOLO deberá programarse en la opción de crear fichero (A).
	6.- El menú se mostrará repetidamente hasta que el usuario salga del programa. (0,25 pt).
	7.- Antes de borrar un fichero deberá mostrarse un mensaje de confirmación del borrado. (0,25 pt).
	8.- Adjunta la documentación en formato Javadoc (0,5 pt).
	Resto calificación (2 pt):
	- Buenas prácticas en el código.
	- Eficiencia.
	- Solución implementada.
	- Documentación
	
	@author https:/github.com/ceibeisfree
 */

public class ActEvaUF3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String opcion;
		
		do {
			muestraMenu();
			opcion = sc.nextLine();
			
			if (opcion.equals("A")) {
				crearFichero();				
			}
			else
				if (opcion.equals("B")) {
					introducirInformación();				
				}
				else
					if (opcion.equals("C")) {
						leerFichero();
					}
					else
						if (opcion.equals("D")) {
							eliminarFichero();
						}
						else
							if (opcion.equals("E")) {
								
							}
							else
								System.out.println("Opcion icorrecta");
		}while (!opcion.equals("E")); 

	}
	
	/**
	 * Crear un fichero .txt
	 */
	
	public static void crearFichero() {
		Scanner sc =new Scanner(System.in);
		File f = null;
		String ruta=("Usuarios/");
		boolean result;
		
		System.out.println("Opción de crear fichero");
		
		f = new File(ruta);
		
		try { 
			result = f.createNewFile();
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("El fichero no ha podido ser creado");
		}
		
		if (result)
			System.out.println("Fichero creado correctamente");
	}
	
	/**
	 * Introducir información en el fichero.
	 */
	
	public static void introducirInformación() {
		System.out.println("Opción de introducir información");
		
		String ruta=("Usuarios/");
		FileWriter fw = null;
		Scanner sc = new Scanner(System.in);
		String cadena;
		BufferredWriter bw = null;
		
		System.out.println("Introduzca el nombre, apellido y email");
		cadena = sc.nextLine();
		
		try {
			fw = new FileWriter(ruta);
			bw = new BufferedWriter(fw);
			
			bw.write(cadena);
			
			bw.close();
			fw.close();
					
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
				
	
	}
	
	/**
	 * Leer el fichero de texto.
	 */
	
	public static void leerFichero() {
		
		FileReader fr = null;
		BufferedReader br = null;
		String linea = "";
		String totalLineas = "";
		Scanner sc = new Scanner(System.in);
		String ruta=("Usuarios/");
		
		System.out.println("Opción de leer fichero");
		
		try {
			fr = new FileReader(ruta);
			br = new BufferedReader(fr);
			
			linea = br.readLine();
			
			while (linea !=null) {
				totalLineas += ";"+linea;
				linea = br.readLine();
				
			}
			
			fr.close();
			br.close();
			
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println(totalLineas);
		
		
	}
	
	/**
	 * Eliminar el fichero de texto.
	 */
	
	public static void eliminarFichero() {
		
		Scanner sc =new Scanner(System.in);
		File f = null;
		String ruta=("Usuarios/");
		boolean result=false;
			
		System.out.println("Opción de eliminar fichero");
		
		f = new File(ruta);
		
		result =f.delete();
		
		if (result)
			System.out.println("Fichero borrado correctamente");
		
		else
			System.out.println("El fichero no se ha podido borrar correctamente");
				
		
	}
	/**
	 * Procedimiento muestra las opciones de menú del progragama
	 */
	
	public static void muestraMenu( ) {
		
		System.out.println("=========================================");
		System.out.println("       Actividad Evaluable UF3       ");
		System.out.println("=========================================");
		System.out.println("A) Crear fichero de texto.");
		System.out.println("B) Introducir información en el fichero.");
		System.out.println("C) Leer el fichero de texto.");
		System.out.println("D) Eliminar el fichero de texto.");
		System.out.println("E) Salir.");
		System.out.println("=========================================");
		System.out.println("Inroduzca opcion:");
		
		
	}

}
