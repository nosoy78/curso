
//	Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se
//	calcula seg�n el siguiente criterio: la parte pr�ctica vale el 10%; la parte de problemas vale
//	el 50% y la parte te�rica el 40%. El programa leer� el nombre del alumno, las tres notas
//	obtenidas, mostrar� el resultado por pantalla, y a continuaci�n volver� a pedir los datos del
//	siguiente alumno hasta que el nombre sea una cadena vac�a. Las notas deben estar
//	comprendidas entre 0 y 10, y si no est�n dentro de ese rango no se imprimir� el promedio
//	y se mostrar� un mensaje de error.

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
		
		Escribir " Nota de pr�ctica (10%) "
		Leer nPractica
		
		Escribir " Nota de problemas (50%) "
		Leer nProblemas
		
		Escribir " Nota te�rica (40%) "
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
	
	Escribir " Ingres� un enter en nombre. Gracias por usar el programa :) "
FinAlgoritmo
