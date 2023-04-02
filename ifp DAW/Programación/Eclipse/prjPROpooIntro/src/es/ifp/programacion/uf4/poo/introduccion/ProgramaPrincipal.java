package es.ifp.programacion.uf4.poo.introduccion;

import java.io.File;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Variables (son de un tipo primitivo o basico)
		String opcion;
		int num;
		
		//Objeto f de tipo File que 
		//creo (instancia) a traves de su costructor.
		File f = new File("usuarios.txt");
	
		//Creamos un objeto de tipo persna llamado ana
		Persona ana = new Persona("Ana", "Lamas", 54);
		ana.mirar();
		
		//Creamos un objeto de tipo persna llamado juan
		Persona juan = new Persona("Juan", "Sanchez", 55);
		juan.mirar();
		
		System.out.println("Objeto Juan: "+juan.nacionalidad);
		System.out.println("Objeto Ana: "+ana.nacionalidad);
		
		//System.out.println("Clase persona Nacionalidad: "+Persona.nacionalidad);
		
		Persona.imprimeNacionalidad();
	}

}
