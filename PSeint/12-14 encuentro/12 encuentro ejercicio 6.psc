funcion suma <- sum_div(num)
	definir suma,i Como Entero
	suma=0
	para i <- 1 Hasta num-1 Hacer
		si num mod i == 0 Entonces
			
			suma=suma+i
		FinSi
	FinPara
	
	
FinFuncion

Algoritmo sin_titulo
	definir num, i Como Entero
	escribir "ingrese un numero"
	leer num
	escribir sum_div(num)
FinAlgoritmo
