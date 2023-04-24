Algoritmo bisiestro
	definir n Como Entero
	escribir "ingrese el año a determinar"
	leer n 
	si n mod 4 == 0 y ((n mod 100 <> 0) o (n mod 400=0)) Entonces
		escribir n " es un año bisiestro"
	SiNo
		escribir n " no es un año bisiestro"
	FinSi
	
FinAlgoritmo
