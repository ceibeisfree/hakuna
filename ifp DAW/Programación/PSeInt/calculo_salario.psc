Algoritmo calculo_salario
	// Este algoritmo calcula el salario a partir de dos datos itroducidos por el usuario
	// Nuestro primer bloque
	Definir num_horas como entero
	Definir precio_por_hora como real
	Definir salario como real
	// Bloque de entrada de datos
	Escribir "Introduzca el numero de horas"
	Leer num_horas
	Escribir "Introduzca el precio por hora"
	Leer precio_por_hora
	// Transformacion d informacion
	salario <- num_horas * precio_por_hora
	// Bloque de salida d informacion
	Escribir "El salario es: ", salario
FinAlgoritmo
