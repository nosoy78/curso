Algoritmo sin_titulo
	definir num, num2 Como real
	definir letra Como Caracter
	num2 = 0
	repetir
		escribir "ingrese un numero"
		leer num
		num2 = num2+num
		escribir "quiere ingresar otro numero s/n"
		leer letra
	hasta que letra = "n"
	
	escribir "la suma es: " num2
FinAlgoritmo
