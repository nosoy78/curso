Algoritmo sin_titulo
	Definir n,m,f,c,matriz1,matriz2 Como Entero
	Escribir "Ingresa las filas"
	leer n
	Escribir "Ingresa las columnas"
	leer m
	Dimension matriz1[n,m],matriz2[m,n]
	
	para f = 0 hasta n-1 Con Paso 1 Hacer
		para c = 0 Hasta m-1 Con Paso 1 Hacer
			matriz1(f,c) = azar(9)
			matriz2(c,f) = matriz1(f,c)
		FinPara
	FinPara
	para f = 0 Hasta n-1 Con Paso 1 Hacer
		para c = 0 Hasta m-1 Con Paso 1 Hacer
			Escribir  matriz1(f,c)," " Sin Saltar 
		FinPara
		Escribir ""
	FinPara
	Escribir ""
	para f = 0 Hasta n-1 Con Paso 1 Hacer
		para c = 0 Hasta m-1 Con Paso 1 Hacer
			Escribir  matriz2(f,c)," " Sin Saltar 
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
