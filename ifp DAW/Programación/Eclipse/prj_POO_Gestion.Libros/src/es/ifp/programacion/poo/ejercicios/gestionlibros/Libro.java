package es.ifp.programacion.poo.ejercicios.gestionlibros;

import java.util.Date;

public class Libro {
	
	//Definicion de atributos de la clase Libro
	private String titulo;
	private String nomApeAutor;
	private String isbn;
	private String editorial;
	private String sinopsis;
	private Date fechaPublicacion;
	private float precio;
	
	//Consructores
	/**
	 * Constructor con todos los parametros/atributos
	 * @param titulo
	 * @param nomApeAutor
	 * @param isbn
	 * @param editorial
	 * @param sinopsis
	 * @param fechaPublicacion
	 * @param precio
	 */
	public Libro(String titulo, String nomApeAutor, String isbn, String editorial,
			String sinopsis, Date fechaPublicacion, float precio) {
		this.titulo=titulo;
		this.nomApeAutor=nomApeAutor;
		this.isbn=isbn;
		this.editorial=editorial;
		this.sinopsis=sinopsis;
		this.fechaPublicacion=fechaPublicacion;
		this.precio=precio;
		
	}
	
	/**
	 * Todos los parametros menos isbn y fecha publicacion
	 * @param titulo
	 * @param nomApeAutor
	 * @param editorial
	 * @param sinopsis
	 * @param precio
	 */
	public Libro(String titulo, String nomApeAutor, String editorial,
			String sinopsis, float precio) {
		this.titulo=titulo;
		this.nomApeAutor=nomApeAutor;
		this.editorial=editorial;
		this.sinopsis=sinopsis;
		this.precio=precio;
	}	
	
	
	//Metodos
	/**
	 * Metodo get que retorna el titulo del libro
	 * @return un String con el titulo del libro
	 */
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getAutor() {
		return this.nomApeAutor;
	}
	
	public String getISBN() {
		return this.isbn;
	}
	
	public String getEditorial() {
		return this.editorial;
	}

	public String getSinopsis() {
		return this.sinopsis;
	}
	
	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}
	
	public float getPrecio( ) {
		return this.precio;
	}
	
	/**
	 * Modifica el precio del libro
	 * @param nuevoPrecio nuevo precio a asignar al libro
	 */
	public void setPrecio(float nuevoPrecio ) {
		this.precio=nuevoPrecio;
	}
	
	
	
}
