Algoritmo sin_titulo
	Definir f,c,n,x ,matriz Como Entero
	Dimension matriz(5,5)
	Para f=0 hasta 4 Con Paso 1 Hacer
		para c=0 Hasta 4 Con Paso 1 Hacer
			matriz(f,c)=azar(25)
		FinPara
	FinPara
	Para f=0 hasta 4 Con Paso 1 Hacer
		para c=0 Hasta 4 Con Paso 1 Hacer
			Escribir matriz(f,c), " " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	Escribir "ingrese un numero a buscar" 
	leer n
	x=0
	Para f=0 hasta 4 Con Paso 1 Hacer
		para c=0 Hasta 4 Con Paso 1 Hacer
			si matriz(f,c) == n Entonces
				Escribir "el numero " ,n, " se encuentra en la fila " ,f, " columna ",c
				x=1
			FinSi
		FinPara
		Escribir ""
	FinPara
	si x==0 Entonces
		Escribir "el numero ",n, " no se encuentra el la matriz"
	FinSi
FinAlgoritmo
