package es.ifp.programacion.poo.ejercicios.gestionlibros;

import java.util.Date;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String titulo;
		String autor;
		String isbn;
		String editorial;
		String sinopsis;
		Date fechaPublicacion;
		
		Libro libro1 = new Libro("EN LA BOCA DEL LOBO", "ELVIRA LINDO", "SEIX BARRAL",
				"Julieta y su madre llegan a La Sabina a pasar las vacaciones. A sus once años "
				+ "esa aldea perdida le parece a Julieta el mejor lugar para dejar atrás problemas "
				+ "a los que no sabe poner nombre. Ese verano eterno lleno de primeras veces, "
				+ "descubrirá que los cimientos del pueblo están hechos de secretos y recuerdos; "
				+ "los lindes del bosque, de cuentos y leyendas; y el corazón de las personas de miedo, "
				+ "odio, amor y esperanza, los cuatro sentimientos que nutren sus sueños y también sus "
				+ "peores pesadillas.",20);
		
		float precio=(float) 19.85;
		Libro libro2 = new Libro("EL LATIDO DEL MAR", "JORGE MOLIST", "PLANETA", 
				"El escritor Jorge Molist, autor de ocho novelas de éxito, entre las que destacan "
				+ "La reina oculta o Prométeme que serás libre, vuelve a las librerías con El latido del mar, "
				+ "una apasionante novela histórica en torno a dos heroicas aventuras: las cruzadas "
				+ "y la expansión mediterránea de la Corona de Aragón.", precio);

		titulo = libro1.getTitulo();
		System.out.println("El titulo del libro es: "+titulo);
		
		autor = libro1.getAutor();
		System.out.println("El autor del libro es: "+autor);
		
		isbn = libro1.getISBN();
		if (isbn!=null)
			System.out.println("El isbn del libro es: "+isbn);
		
		editorial = libro1.getEditorial();
		System.out.println("La editorial del libro es: "+editorial);
		
		sinopsis = libro1.getSinopsis();
		System.out.println("La sinopsis del libro es: "+sinopsis);
		
		System.out.println("");
		System.out.println("=================================");
		System.out.println("");
		
		titulo = libro2.getTitulo();
		System.out.println("El titulo del libro es: "+titulo);
		
		autor = libro2.getAutor();
		System.out.println("El autor del libro es: "+autor);
		
		isbn = libro2.getISBN();
		if (isbn!=null)
			System.out.println("El isbn del libro es: "+isbn);
		
		editorial = libro2.getEditorial();
		System.out.println("La editorial del libro es: "+editorial);
		
		sinopsis = libro2.getSinopsis();
		System.out.println("La sinopsis del libro es: "+sinopsis);
		
		
		
	}

}
