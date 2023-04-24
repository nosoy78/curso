Algoritmo sin_titulo
	Definir matriz, v, i, j Como Entero
	Dimension matriz[3,3], v[3]
	Escribir "Matriz: "
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			matriz[i,j]=Aleatorio(1,9)
		FinPara
	FinPara
	///Mostrar Matriz
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir " [",matriz[i,j],"] " Sin Saltar
		FinPara
		Escribir ""
	FinPara
	///Cambiar de lugar los elementos de la matriz
	Para i=0 Hasta 2 Con Paso 1 Hacer
		v[i]=matriz[0,i]
		matriz[0,i]=matriz[2,i]
		matriz[2,i]=v[i]
	FinPara
	///Mostrar la matriz
	Escribir "------------------------------------------"
	Para i=0 Hasta 2 Con Paso 1 Hacer
		Para j=0 Hasta 2 Con Paso 1 Hacer
			Escribir " [",matriz[i,j],"] " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
