Algoritmo detarea
	Definir x,a,f,c,n,m,matriz,vector Como Entero
	Escribir "Ingresa las filas"
	leer n
	Escribir "Ingresa las columnas"
	leer m
	x = n*m
	Dimension matriz[n,m],vector[x]
	para f = 0 Hasta n-1 Con Paso 1 Hacer
		para c = 0 Hasta m-1 Con Paso 1 Hacer
			matriz(f,c) = azar(9) + 1 
		FinPara
	FinPara
	a = 0
	para f = 0 Hasta n-1 Con Paso 1 Hacer
		para c = 0 Hasta m-1 Con Paso 1 Hacer
			Escribir matriz(f,c)," " Sin Saltar
			vector(a) = matriz(f,c)
			a = a + 1
		FinPara
		Escribir ""
	FinPara
	para f = 0 Hasta x-1 Con Paso 1 Hacer
		Escribir "vector: ",vector(f)
	FinPara
FinAlgoritmo