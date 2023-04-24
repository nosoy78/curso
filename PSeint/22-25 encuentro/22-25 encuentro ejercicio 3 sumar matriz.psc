

Algoritmo Ejer3
	
	Definir M, N, retorno, suma Como Entero
	
	Escribir "Ingrese el tamaño de la matriz."
	Leer M, N
	
	Dimension matriz(M,N)
	Definir matriz Como Real
	
	mas(matriz, M, N)
	
	Sum(matriz,M,N)
	
FinAlgoritmo

SubProceso mas(matriz, M, N)
	
	Definir i, j Como Entero
	
	Para i <- 0 Hasta M - 1
		
		Para j <- 0 Hasta N - 1
			
			matriz(i,j) = Aleatorio(1,13)
			Escribir matriz(i,j), " " Sin Saltar
			
		FinPara
		Escribir ""
	FinPara
	
FinSubProceso

Funcion sum (matriz, M, N)
	
	Definir i, j, suma Como Entero
	
	suma = 0
	
	Para i <- 0 Hasta M - 1
		
		Para j <- 0 Hasta N - 1
			
			suma = suma + matriz(i,j)
			
		FinPara
		
	FinPara	
	Escribir "Suma: ", suma
	
FinFuncion
