Algoritmo Clase_08_06
	Definir suma, num, cont Como Entero
	suma = 0
	num = 0
	cont = 0
	
	Escribir "Ingrese un número"
	Leer num
	
	Hacer
		
		cont = cont + 1		
		suma = suma + (2 * cont)
		
	Mientras Que cont < num
	
	Escribir "La suma de los primeros " num " números pares es: " suma
	
FinAlgoritmo
