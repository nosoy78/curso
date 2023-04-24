Algoritmo sin_titulo
	Definir x,a,b Como Entero
	x = 1
	a = 0
	b = 0
	Mientras x <= 100 Hacer
		si x mod 2 == 0 Entonces
			Escribir x
			a = a + 1
		SiNo			
			si x mod 3 == 0 Entonces
				Escribir x
				b = b + 1
			FinSi
		FinSi
		x = x + 1
	FinMientras
	Escribir "Numeros multiplos de 2: ",a
	Escribir "Numeros multiplos de 3: ",b	
FinAlgoritmo
