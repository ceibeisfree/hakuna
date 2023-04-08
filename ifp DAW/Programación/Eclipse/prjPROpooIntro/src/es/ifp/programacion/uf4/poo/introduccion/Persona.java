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

	/**
	 * Metodo que retorna el nombre de la persona
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Metodo que modifica el nombre de la persona
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Metodo que retorna los apellidos de la persona
	 * @return the apellidos
	 */
	public String getApellidos() {
		return this.apellidos;
	}

	/**
	 * Metodo que modifica los apellidos de la persona
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Metodo que retorna la edad de la persona
	 * @return the edad
	 */
	public int getEdad() {
		return this.edad;
	}

	/**
	 * Metodo que modifica la edad de la persona
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Metodo que retorna el corre de la persona
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	/**
	 * Metodo que modifica el correo de la persona
	 * @param correoElectronico the correoElectronico to set
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	
	

	
	
}
