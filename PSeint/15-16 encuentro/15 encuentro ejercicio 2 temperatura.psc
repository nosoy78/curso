//Crear un procedimiento que calcule la temperatura media de un d�a a partir de la temperatura
//m�xima y m�nima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura m�xima y m�nima de n d�as y vaya mostrando la media de cada d�a. El
//
//programa pedir� el n�mero de d�as que se van a introducir.
Algoritmo c15_ej2_1
	definir dias,i Como Entero
	
	Escribir "Ingrese la cantidad de dias a analizar"
	leer dias
	i=0
	tempMedia(dias , i)
	
FinAlgoritmo

SubProceso tempMedia (dias, i )
	definir tMin ,tMax  Como Entero
	definir tMedia Como Real
	
	si i < dias Entonces
		
		escribir "Ingrese temperatura minima y maxima"
		leer tMin , tMax
		tMedia=(tMin+tMax)/2
		i=i+1
		Escribir "La temperatura media del dia " i " es de " tMedia "�c ."
		tempMedia(dias ,i)
		
	Finsi
	
FinSubProceso
	