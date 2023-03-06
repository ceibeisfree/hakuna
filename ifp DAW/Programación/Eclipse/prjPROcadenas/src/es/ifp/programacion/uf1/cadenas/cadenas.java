package es.ifp.programacion.uf1.cadenas;

/**
 * Programa con ejemplos de gestion de cadenas y uso de la clase String.
 * @author hakuna matata
 * @version 1.0
 * 
 */

public class cadenas {

	/**
	 * Funcion de arranque de mi programa.
	 * Donde se empieza a ejecutar el codigo
	 * @param args argumentos de un program
	 * @return En este caso la funcion no retorna nada
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creacion de cadenas
		
		/**
		 * variable que contiene la cadena a gestionar
		 */
		String cadena ="MUSICA";
		boolean tmp;
		String str;
		int size;
		int i;
		
		System.out.println("LLAMADAS A FUNCIONES DE LA CLASE STRING");
		System.out.println("#######################################");
		
		tmp = cadena.isEmpty();
		System.out.println("¿La cadena esta vacia? "+tmp);
		
		tmp = cadena.endsWith("CA");
		System.out.println("¿La cadena acaba en CA? "+tmp);
		
		str = cadena.substring(2,4);
		System.out.println("La subcadena (2,4) es: "+str);
		
		str = cadena.concat("1");
		System.out.println("La concatenacion con 1 es: "+str);
		
		if (cadena.equals(str))
			System.out.println("Cadena es igual a str");
		else 
			System.out.println("Cadena no es igual a str");
		
		
		System.out.println("===============================");
		//Recorrer la variable cadena con while
		
		i=0;
		size=cadena.length();
		char c;
		while (i<size) {
			c = cadena.charAt(i);
			System.out.print(c);
			i++; //Cambiar las condiciones del while
		}
		
		System.out.println("");
		System.out.println("==============================");
		
		//Recorremos la variable con un bucle for
		for(int j=0;j<size;j++) {
			c = cadena.charAt(j);
			System.out.print(c);	
		}
		
		System.out.println("");
		System.out.println("==============================");
		
		//Mostramos la cadena al reves
		for (int k=size-1;k>=0;k--) {
			c=cadena.charAt(k);
			System.out.print(c);
		}
		
		System.out.println("");
		System.out.println("==============================");
		
		str=cadena.toLowerCase();
		System.out.println(str);
		
		
		
		
		
	}

}
