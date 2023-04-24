Algoritmo sin_titulo
	Definir f,c,matriz Como Entero
	Dimension matriz(3,3)
	para f=0 Hasta 2 Con Paso 1 Hacer
		para c=0 Hasta 2 Con Paso 1 Hacer
			escribir "ingrese un numero en la fila ",f," columna ",c
			leer matriz(f,c)
		FinPara
	FinPara
	para f=0 Hasta 2 Con Paso 1 Hacer
		para c=0 Hasta 2 Con Paso 1 Hacer
			Escribir matriz(f,c), " " Sin Saltar
		FinPara
		escribir ""
	FinPara
FinAlgoritmo
