//Crear un procedimiento que calcule la temperatura media de un día a partir de la temperatura
//máxima y mínima. Crear un programa principal, que, utilizando un procedimiento, vaya pi-
//diendo la temperatura máxima y mínima de n días y vaya mostrando la media de cada día. El
//
//programa pedirá el número de días que se van a introducir.
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
		Escribir "La temperatura media del dia " i " es de " tMedia "°c ."
		tempMedia(dias ,i)
		
	Finsi
	
FinSubProceso
	