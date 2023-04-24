Algoritmo enc22a25_ejer6	
	Definir matrizmagica, num, i, j, k Como Entero	
	Escribir "Elija el tamaño de la matriz (no superior a 10)"
	Leer num	
	Dimension matrizmagica[num, num]	
	k = 0
	Para i = 0 Hasta num - 1
		Para j = 0 Hasta num - 1			
			Hacer
				Escribir "Ingrese un número"
				Leer matrizmagica[i, j]
			Mientras Que matrizmagica[i, j] < 1 | matrizmagica[i, j] > 9
			nuevoproceso(matrizmagica, i, k, j)
			Si k < num - 1
				k = k + 1
			FinSi
		FinPara
	FinPara	
	validar(matrizmagica, num)	
FinAlgoritmo
Funcion validar(matriz,lado)
	Definir i, j, mDiag, seDiag, rS, cS Como Entero
	Definir valido Como Logico	
	valido = Verdadero	
	mDiag = 0
	seDiag = 0	
	Para i = 0 Hasta lado - 1
		mDiag = mDiag + matriz[i, i]
		seDiag = seDiag + matriz[i, (lado - 1) - i]
	FinPara
	valido = mDiag == seDiag
	i = 0
	Mientras valido & i < lado
		rS = 0
		cS = 0
		Para j = 0 Hasta lado - 1
			rS = rS + matriz[i, j]
			cS = cS + matriz[j, i]
		FinPara
		valido = rS == cS & rS == mDiag
		i = i + 1
	FinMientras	
	Si valido
		Escribir "Es una matriz mágica! Suma: ", mDiag
	SiNo
		Escribir "No es una matriz mágica."
	FinSi
FinFuncion
Funcion nuevoproceso(matriz, r, c, l)
	Definir i, j Como Entero
	Limpiar Pantalla
	Para i = 0 Hasta r
		Si i == r
			c = l
		FinSi
		Para j = 0 Hasta c
			Escribir Sin Saltar matriz[i, j], "  "
		FinPara
		Escribir ""
	FinPara
FinFuncion