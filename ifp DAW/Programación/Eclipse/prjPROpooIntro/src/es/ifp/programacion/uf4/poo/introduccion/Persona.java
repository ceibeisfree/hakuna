package es.ifp.programacion.uf4.poo.introduccion;
/**
 * Definicion de la clase del puerto
 * Una persona se compone de un nombre, apellidos y email
 *  
 * @author https:/github.com/ceibeisfree
 *
 */
public class Persona {
	
	// Declaracion de atributos de objetos
	private String nombre;
	private String apellidos;
	private int edad;
	private String correoElectronico;
	
	//Atributo de clase
	static String nacionalidad="España";  
	
	/**
	 * Constructor por defecto
	 */
	public Persona() {
		nombre="";
		apellidos="";
		edad=0;	
		correoElectronico="";
	}
	
	/**
	 * Costructor con tres parametros: nom, ape, ed
	 * @param nom Nombre de la persona
	 * @param ape Apellidos de la persona
	 * @param ed Edad de la persona
	 */
	public Persona(String nom, String ape, int ed) {
		this.nombre=nom;
		this.apellidos=ape;
		this.edad=ed;
	}	
	
	/**
	 * Costructor con todos los parametros
	 * @param nom Nombre de la persona
	 * @param ape Apellidos de la persona
	 * @param ed Edad de la persona
	 * @param correo correo electronico de la persona
	 */
	public Persona(String nom, String ape, int ed, String correo) {
		this.nombre=nom;
		this.apellidos=ape;
		this.edad=ed;
		this.correoElectronico=correo;
	}	

	
	public void cambiarCorreoElectronico(String correoElectronico) {
		this.correoElectronico=correoElectronico;
		
	}
	
	public void mirar () {
		System.out.println(this.nombre+" esta mirando");
		System.out.println("Nacionalidad "+nacionalidad);
	}
	
	public static void imprimeNacionalidad() {
		System.out.println(nacionalidad);
		
	}
	
	
	
	
	
	
	
	
	
	
}
