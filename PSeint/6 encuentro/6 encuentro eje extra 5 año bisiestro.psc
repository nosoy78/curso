Algoritmo bisiestro
	definir n Como Entero
	escribir "ingrese el a�o a determinar"
	leer n 
	si n mod 4 == 0 y ((n mod 100 <> 0) o (n mod 400=0)) Entonces
		escribir n " es un a�o bisiestro"
	SiNo
		escribir n " no es un a�o bisiestro"
	FinSi
	
FinAlgoritmo
