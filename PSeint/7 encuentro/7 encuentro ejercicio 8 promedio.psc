
//	Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//	calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale
//	el 50% y la parte teórica el 40%. El programa leerá el nombre del alumno, las tres notas
//	obtenidas, mostrará el resultado por pantalla, y a continuación volverá a pedir los datos del
//	siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben estar
//	comprendidas entre 0 y 10, y si no están dentro de ese rango no se imprimirá el promedio
//	y se mostrará un mensaje de error.

Algoritmo ep7_calificaciones_de_alumnos
	
	Definir nFinal, nPractica, nProblemas, nTeorica Como Real
	Definir nombre, espacio Como Caracter
		
	Escribir " Ayudaremos a calcular las notas de sus alumnos. "
	Escribir " Cuando quiera finalizar, responda al nombre con un simple enter. "
	Escribir " "
	
	// Para que inicie el bucle cuando es diferente de un espacio el nombre
	
	Escribir " Nombre: " 
	Leer nombre	
	
	// Inicio del bucle
	
	Mientras nombre <> "" Hacer
		
		Escribir " Nota de práctica (10%) "
		Leer nPractica
		
		Escribir " Nota de problemas (50%) "
		Leer nProblemas
		
		Escribir " Nota teórica (40%) "
		Leer nTeorica
		
		Si  nPractica <= 10 y nPractica >= 0 y nProblemas <= 10 y nProblemas >= 0  y nTeorica <= 10 y nTeorica >= 0 
			
			// Operaciones logicas para Nota Final 
			
			nFinal = ( nPractica * 0.1) + ( nProblemas * 0.5 ) + (nTeorica * 0.4)
 			
			Escribir " Nota Final: " nFinal 
			
		SiNo
			
			Escribir " Error. Una o varias notas ingresadas no estan entre 0 y 10."
			
		FinSi
		
		//Volver a ingresar la variable. Para que vuelva a iniciar. Importante en el bucle Mientras.
		
		Escribir " Nombre del alumno: " 
		Leer nombre
		
	FinMientras
	
	Escribir " Ingresó un enter en nombre. Gracias por usar el programa :) "
FinAlgoritmo
