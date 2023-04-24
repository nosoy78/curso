Algoritmo sin_titulo
	definir x, mayor1, vector Como Entero
	Dimension vector(10)
	para x = 1 Hasta 9 Con Paso 1 Hacer
		Escribir "ingrese 10 numeros"
		leer vector(x)
		
	FinPara
	mayor1=0
	para x = 1 Hasta 9 Con Paso 1 Hacer
		si vector(x)>mayor1 Entonces
			mayor1=vector(x)
		FinSi
		Escribir vector(x)
	FinPara
	Escribir "el numero mayor es: " mayor1
FinAlgoritmo
