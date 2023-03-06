package es.ifp.programacion.uf1.RupturaSalto;

public class RupturaSalto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		while (i<=100) {
			
			if (i==90) {
				
				i++;
				continue; //Instruccion de salto
			}
			
			if (i==95) {
				
				break; //Instruccion de ruptura
			}
			
			System.out.println(i);
			i++;
		}
		
		
		

	}

}
