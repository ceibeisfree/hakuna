package es.ifp.programacion.uf4.poo.introduccion;

public class Conductor extends Persona{
	
	// Atributos de la clase
	
	// Los  atributos de la clase padre see heredan a la clase hija
	// Es como se en esta clase Conductor, tuvieramos los atributos
	// de la claase Persona (nombre, apellids, edad y correo electronico).
	

	private String numCarnetConducir;
	
	// Constructores
		
	/**
	 * Constructor de la clase Conductor que invoca al constructor
	 * de la clase padre, Persona
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param correo
	 * @param numCarnetConducir
	 */
	
	public Conductor(String nombre, String apellidos, int edad, String correo,
			String numCarnetConducir) {
		
		super(nombre, apellidos, edad, correo);
		this.setNumCarnetConducir(numCarnetConducir);
		// Con la palabra reservada super llamamos a un constructr de la 
		// clase padre
		
		
	}

	// Métodos

	/**
	 * Metodo que retorna el carnet de conducir
	 * @return the numCarnetConducir un String con el carnet de conducir de esta persona
	 */
	public String getNumCarnetConducir() {
		return this.numCarnetConducir;
	}

	/**
	 * @param numCarnetConducir the numCarnetConducir to set
	 */
	public void setNumCarnetConducir(String numCarnetConducir) {
		this.numCarnetConducir = numCarnetConducir;
	}
	
		

}
