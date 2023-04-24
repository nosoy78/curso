//Escriba un programa que solicite dos números enteros (mínimo y máximo). A continuación,
//se debe pedir al usuario que ingrese números enteros situados entre el máximo y mínimo.
//Cada vez que un número se encuentre entre ese intervalo, se sumara uno a una variable.
//El programa terminará cuando se escriba un número que no pertenezca a ese intervalo, y
//al finalizar se debe mostrar por pantalla la cantidad de números ingresados dentro del
//intervalo.
Algoritmo encuentro7_ejercicio5
	Definir n1, n2, n3, contador Como entero
	Escribir "Ingrese dos numero, un minimo y un maximo: " ; Leer n1, n2
	Escribir "Ingrese numero situados entre el maximo y el minimo: " ; Leer n3
	contador = 0
	Mientras n3 < n2 Y n3 > n1 Hacer
		Escribir "Ingrese numero situados entre el maximo y el minimo: " ; Leer n3
		contador = contador + 1
	FinMientras
	Escribir "Secuencia finalizada, usted ha ingresado: " contador " numeros"	
FinAlgoritmo
