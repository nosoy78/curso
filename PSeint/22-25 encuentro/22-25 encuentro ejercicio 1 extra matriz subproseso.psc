Algoritmo Enc22Ej1extra
	Definir matriz,palabra,llenar Como entero
	Dimension matriz(3,3)	

	palabra=0
	llenaMatriz(matriz,palabra)	
	muestraMatriz(matriz)
FinAlgoritmo

SubProceso llenaMatriz(matriz,palabra)
	Definir i,j Como Entero
	      
	Para i = 0 Hasta 3-1 Hacer
		Para j = 0 Hasta 3-1 Hacer
			matriz(i,j) = azar(9)
			
		FinPara
	FinPara
FinSubProceso

SubProceso muestraMatriz(matriz)
	Definir i,j Como Entero
	Para i = 0 Hasta 3-1 Hacer
		Para j = 0 Hasta 3-1 Hacer
			Escribir Sin Saltar matriz(i,j)," "
		FinPara
		Escribir ""		
	FinPara
FinSubProceso