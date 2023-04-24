//Realizar un subproceso que reciba una letra y muestre un mensaje si esa letra esta entre las
//		letras "M" y "T". Recordar que Pseint le da un valor numérico a cada letra a través del Código
//		Ascii, lo que nos deja usar operadores relacionales con letras y cadenas.

Algoritmo dia15ej6
	definir letra Como Caracter
	escribir "ingrese una letra"
	leer letra
	letra=mayusculas(letra)
	enRango(letra)
	
FinAlgoritmo

subproceso enRango(x)
	si x>="M" y x<="T" Entonces
		escribir "la letra se encuentra entre M y T"
	SiNo
		escribir "la letra se encuentra fuera del rango comprendido entre M y T"
	FinSi
FinSubProceso
	