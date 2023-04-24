Algoritmo ej3GuiaExtra
	definir i, vec1, n Como entero 
	definir vec2, palabra como cadena 
	Escribir "ingrese cantidad de nombres" 
	leer n 
	Dimension vec2[n]
	Dimension vec1[n]
	para i = 0 hasta n-1 Hacer
		Escribir "ingrese los nombres" 
		leer vec2[i] 
		vec1[i]= Longitud(vec2[i]) 
	FinPara
	para i = 0 hasta n-1 Hacer
		Escribir vec2[i], " " vec1[i],  " " 
	FinPara
FinAlgoritmo
