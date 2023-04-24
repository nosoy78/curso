Algoritmo EJERCICIO_5GE
	definir num,i Como Entero
	escribir "Por favor, ingrese un numero entero positivo:"
	leer num
	escribir par(num)
	
FinAlgoritmo


	Funcion v1<-par (num)
		definir cont,i Como Entero
		cont=0
		
		definir v1 Como caracter
		para i<-1 hasta num
			si num MOD i=0 Entonces
				cont=cont+1
			FinSi
		FinPara
		si cont=2 Entonces
			v1= "El numero es primo"
		SiNo
			v1="El numero NO ES PRIMO"
		FinSi
		
	fin funcion	
	