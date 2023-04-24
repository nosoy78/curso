Algoritmo Final
	// Definici�n de variables
	Definir calculadora Como Entero
	Definir cadena1,cadena2 Como Caracter
	Definir diagonal3D1,diagonal3D2 Como Entero
	// Definimos las 3 dimensiones de la matriz calculadora
	Dimension calculadora[3,3,3]
	// Asignamos valores a las cadenas de texto
	cadena1 <- "789090362"
	cadena2 <- "484529837"
	// Inicializamos la matriz
	inicializarMatriz(calculadora)
	// Llenamos las matrices como se marca en el enunciado
	llenarMatriz_Z0(calculadora,cadena1)
	// Mostramos los resultados de la matriz
	llenarMatriz_Z1(calculadora,cadena2)
	llenarMatriz_Z2(calculadora)
	imprimirMatriz(calculadora)
	// Asignamos los valores de las diagonales 3D
	diagonal3D1 <- calculadora[0,2,0]*calculadora[1,1,1]*calculadora[2,0,2]
	diagonal3D2 <- calculadora[0,0,0]*calculadora[1,1,1]*calculadora[2,2,2]
	// Escribimos los resultados de las diagonales
	Escribir "La multiplicaci�n de los elementos de la diagonal 3D 1 es " ,diagonal3D1
	Escribir "La multiplicaci�n de los elementos de la diagonal 3D 2 es " ,diagonal3D2
FinAlgoritmo

Funcion llenarMatriz_Z0(matriz,cadena)
	Definir i,j,contador Como Entero
	// Recibe una matriz y la llena con los valores de la cadena separados y
	// convertidos a n�meros. Pista: tendremos que utilizar un contador auxiliar
	// para asignar los valores.
	contador <- 0
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			matriz[0,i,j]<-ConvertirANumero(Subcadena(cadena,contador,contador))
			contador <- contador+1
		FinPara
	FinPara
FinFuncion

Funcion llenarMatriz_Z1(matriz,cadena)
	Definir i,j,contador Como Entero
	// Recibe una matriz y la llena conlos valores de la cadena separados y
	// convertidos a n�meros. Pista: tendremos que utilizar un contador auxiliar
	// para asignar los valores.
	contador <- 0
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			matriz[1,i,j]<-ConvertirANumero(Subcadena(cadena,contador,contador))
			contador <- contador+1
		FinPara
	FinPara
FinFuncion

Funcion llenarMatriz_Z2(matriz)
	Definir i,j Como Entero
	// Llena los valores multiplicando los elementos de las otras capas que
	// est�n en la misma posici�n.
	Para i<-0 Hasta 2 Hacer
		Para j<-0 Hasta 2 Hacer
			matriz[2,i,j]<-matriz[0,i,j]*matriz[1,i,j]
		FinPara
	FinPara
FinFuncion

Funcion inicializarMatriz(matriz)
	Definir i,j,k Como Entero
	// Inicializa la matriz con alg�n valor gen�rico en todas sus posiciones, por
	// ejemplo con el n�mero 0.
	Para k<-0 Hasta 2 Hacer
		Para i<-0 Hasta 2 Hacer
			Para j<-0 Hasta 2 Hacer
				matriz[k,i,j]<-0
			FinPara
		FinPara
	FinPara
FinFuncion

Funcion imprimirMatriz(matriz)
	Definir i,j,k Como Entero
	// Muestra por pantalla la matriz. Se mostrar� la capa 0, debajo la capa 1 y
	// luego la capa 2.
	Para k<-0 Hasta 2 Hacer
		Para i<-0 Hasta 2 Hacer
			Para j<-0 Hasta 2 Hacer
				Escribir "(",matriz[k,i,j],")"," " Sin Saltar
			FinPara
			Escribir ""
		FinPara
		Escribir ""
		Escribir ""
	FinPara
FinFuncion
