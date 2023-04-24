Algoritmo capicua
	definir n, a, b Como Entero
	escribir "ingrese un numero de tres cifras"
	leer n
	a = trunc(n/100)
	b = n mod 10
	
	si a = b Entonces
		escribir "el numero ",n, " es un numero capicua"
	sino 
		escribir "el numero ",n, " no es capicua"
	FinSi
	
	
	
FinAlgoritmo
