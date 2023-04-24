Algoritmo sin_titulo
	definir matrix, F Como Entero
	Escribir "Ingrese la cantidad de filas que desea"
	leer F
	Dimension matrix[F,3]
	sumar(matrix, F)
	Imprimi(matrix, F)
FinAlgoritmo
SubProceso sumar(matrix, F Por Referencia)
	definir i, j, aux, val Como Entero
	aux=0
	para i <-0 Hasta F-1 Hacer
		para j<-0 Hasta 2 Hacer
			si j<2 Entonces
				Escribir "ingrese un valor ", i Sin Saltar
				leer val
				matrix[i,j]=val
				aux=aux+val
			SiNo
				matrix[i,j]=aux
				aux=0
			FinSi
			
		FinPara
	FinPara
FinSubProceso
SubProceso Imprimi(matrix, F por referencia)
	Definir i, j Como Real
	Para i = 0 Hasta F-1 Hacer
		Para j = 0 hasta 1 Hacer
			Escribir Sin Saltar matrix(i,j)
			para j = 1 hasta 1 Hacer
				Escribir " + "Sin Saltar matrix(i,j)
				para j = 2 Hasta 2 Hacer
					Escribir " = " Sin Saltar matrix(i,j)
				FinPara
			FinPara
		FinPara
		Escribir " "
	FinPara
FinSubProceso	