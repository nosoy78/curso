Algoritmo sin_titulo
	Definir vector, suma, promedio Como Real
	Definir x Como Entero
	Dimension vector(5)
	para x=1 Hasta 5 Con Paso 1 Hacer
		escribir "ingrese un numero"
		leer vector(x-1)
	FinPara
	suma=0 
	promedio=0
	para x=1 Hasta 5 Con Paso 1 Hacer
		suma=suma+vector(x-1)
		
	FinPara
	promedio=suma/5
	escribir "el promedio es: " promedio
FinAlgoritmo
