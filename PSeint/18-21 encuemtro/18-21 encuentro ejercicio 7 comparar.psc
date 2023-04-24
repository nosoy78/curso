Algoritmo detarea
	Definir x,c,vector1,vector2 Como Entero
	Dimension vector1[100],vector2[100]
	para x = 1 Hasta 100 Con Paso 1 Hacer
		Escribir "Ingresa un numero en el vector 1"
		leer vector1(x) 
		Escribir "Ingresa un numero en el vector 2"
		leer vector2(x)
	FinPara
	c = 0
	para x = 1 Hasta 100 Con Paso 1 Hacer
		si vector1(x) == vector2(x) Entonces
			c = c + 1
		FinSi
	FinPara
	
	si c == 100 Entonces
		Escribir "Iguales"
	SiNo
		Escribir "Diferentes"
	FinSi
FinAlgoritmo