Algoritmo Enc22Ej5
	Definir matriz,palabra Como Caracter
	Dimension matriz(3,3)	
	Escribir  "Ingrese una frase: "
	Leer palabra
	
	llenaMatriz(matriz,palabra)	
	muestraMatriz(matriz)
FinAlgoritmo

SubProceso llenaMatriz(matriz,palabra)
	Definir i,j,k Como Entero
	k = 0       
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			matriz(i,j) = Subcadena(palabra,k,k)
			k = k + 1
		FinPara
	FinPara
FinSubProceso

SubProceso muestraMatriz(matriz)
	Definir i,j Como Entero
	Para i = 0 Hasta 2 Hacer
		Para j = 0 Hasta 2 Hacer
			Escribir Sin Saltar matriz(i,j)," "
		FinPara
		Escribir ""		
	FinPara
FinSubProceso