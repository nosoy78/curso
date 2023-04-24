//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo y
//muestre por pantalla la suma, resta y multiplicación de todos los números ingresados al arre-
//glo.

Algoritmo detarea
	Definir suma,i,vector, resta, multiplicacion,num Como entero
	Dimension vector[10]
	
	para i = 0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingresa un numero"
		leer num
		vector(i)=num
		
	FinPara
	suma = 0
	resta = 0
	multiplicacion = 1
	para i = 0 Hasta 9 Con Paso 1 Hacer
		suma = suma + vector[i]
		resta = resta - vector[i]
		multiplicacion = multiplicacion * vector[i]
		
	FinPara
	Escribir "La suma de los numeros es: ",suma
	Escribir "La resta de los 10 elementos es: ",resta
	Escribir "La multiplicacion de los 10 elementos es: ",multiplicacion
FinAlgoritmo
