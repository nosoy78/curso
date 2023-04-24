//Realizar un procedimiento que permita realizar la división entre dos números y muestre el co-
//ciente y el resto utilizando el método de restas sucesivas.
//
//El método de división por restas sucesivas consiste en restar el dividendo con el divisor hasta
//obtener un resultado menor que el divisor, este resultado es el residuo, y el número de restas
//realizadas es el cociente. Por ejemplo: 50 / 13:
//		50 ? 13 = 37 una resta realizada
//		37 ? 13 = 24 dos restas realizadas
//		24 ? 13 = 11 tres restas realizadas
//	dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

Algoritmo dia15ej3
	definir num1, num2, contador Como Entero
	contador=0
	escribir "haremos una division por restas sucesivas, ingrese el dividendo"
	leer num1
	escribir "ahora ingrese el divisor"
	leer num2
	mientras num2>num1 Hacer
		escribir "el divisor debe ser menor al dividendo, intentelo nuevamente"
		leer num2
	FinMientras
	escribir sin saltar num1, " dividido en ",num2," da "
	division(num1, num2, contador)
FinAlgoritmo

subproceso division(x,z,a por referencia)
	hacer
		a=a+1
		x=x-z
	hasta que x<z
	escribir a," con resto ",x
FinSubProceso
	