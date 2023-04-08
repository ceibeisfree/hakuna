package es.ifp.programacion.uf4.poo.introduccion;



public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Conductor conductorJose= new Conductor("Jose","Gutierrez", 33, "jose@correo.es", "A2343FR");
		
		String nom=conductorJose.getNombre();
		System.out.println("Nombre: "+nom);

		String ape=conductorJose.getApellidos();
		System.out.println("Apellidos: "+ape);
		
		int ed=conductorJose.getEdad();
		System.out.println("Edad: "+ed+" Años");
		
		String correo=conductorJose.getCorreoElectronico();
		System.out.println("Correo: "+correo);
		
	}
}