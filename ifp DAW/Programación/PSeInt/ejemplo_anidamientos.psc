Algoritmo ejemplo_anidamientos
	Definir nota como Entero
	nota <- 10
	Si nota>=9 Entonces
		Escribir "Sobresaliente"
	SiNo
		Si nota>=7 Entonces
			Escribir "Notable"
		SiNo
			Si nota>=6 Entonces
				Escribir "Bien"
			SiNo
				Si nota>=5 Entonces
					Escribir "Aprobado"
				SiNo
					Escribir "Suspenso"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
