Algoritmo udc
	definir n, unidades, decenas, centenas Como Entero
	escribir "ingrese un numero"
	leer n
	unidades=n mod 10
	n=trunc(n/10)
	decenas=n mod 10
	n=trunc(n/10)
	centenas=n mod 10
	escribir "el numero tiene:"
	escribir centenas " centenas"
	escribir decenas " decenas"
	escribir unidades " unidades"
	
	
FinAlgoritmo
