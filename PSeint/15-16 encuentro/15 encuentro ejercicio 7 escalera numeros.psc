//Crear un programa que dibuje una escalera de n�meros, donde cada l�nea de n�meros co-
//mience en uno y termine en el n�mero de la l�nea. Solicitar la altura de la escalera al usuario al
//
//comenzar. Ejemplo: si se ingresa el n�mero 3:
//1
//12
//123

Algoritmo dia15ej7
	definir num, i, j Como Entero
	i=0
	j=0
	escribir "ingrese la altura de la piramide de numeros"
	leer num
	piramide(num, i, j)
FinAlgoritmo
subproceso piramide(x,z,k)
	para z=1 hasta x Hacer
		para k=1 hasta z Hacer
			escribir sin saltar k
		FinPara
		escribir ""
	FinPara
FinSubProceso
