//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo entero.
//La variable A, debe terminar con el valor de la variable B.
Algoritmo c15_ej1
	definir a , b Como Entero
	escribir "Ingrese dos enteros"
	leer a , b
	alternar(a, b)
	escribir a
	Escribir b
	
FinAlgoritmo

SubProceso alternar(a Por Referencia ,b Por Referencia )
	definir aux Como entero
	aux = a
	a = b 
	b = aux
FinSubProceso