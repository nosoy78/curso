Algoritmo sin_titulo
	Definir n,x,mayor1,menor1,vector Como Entero
	Escribir "Ingresa el tamaño del vector"
	leer n
	Dimension vector[n]
	para x = 0 Hasta n-1 Con Paso 1 Hacer
		Escribir "Ingresa un numero"
		leer vector(x)
	FinPara
	mayor1 = 0
	menor1 = 0
	para x = 0 Hasta n-1 Con Paso 1 Hacer
		
		si x == 0 Entonces
			menor1 = vector(x)
			mayor1 = vector(x)
		SiNo
			si vector(x) > mayor1 Entonces
				mayor1 = vector(x)
			SiNo
				si vector(x) < menor1 Entonces
					menor1 = vector(x)
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "El numero mayor es: ",mayor1
	Escribir "EL numero menor es: ",menor1
FinAlgoritmo
