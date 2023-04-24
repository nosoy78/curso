//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el usua-
//rio. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar tam-
//bi�n debe ser ingresado por el usuario). El programa debe indicar la posici�n donde se en-
//cuentra el valor. En caso de que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso de que el n�mero a buscar no est� adentro del arreglo se debe mostrar
//un mensaje.


Algoritmo buscarUnValor
	definir vector, n, veces, num, i Como Entero
	n  = aleatorio(1,10)
	dimension vector(n)
	escribir "Ingrese los valores del vector"
	
	para i=0 hasta n-1 con paso 1 Hacer
		leer vector(i)
	FinPara
	Escribir ""
	escribir "ingrese el valor que desea buscar"
	leer num
	veces = 0
	para i=0 hasta n-1 con paso 1 hacer 
		si vector(i) = num
			veces = veces + 1
			escribir "El numero se encontro en la posicion ", i+1
		FinSi
	FinPara
	
	si veces >= 1
		escribir "El numero se repitio ", veces, " veces"
	SiNo
		escribir "El numero no se encuentra en dicho vector"
	finsi
FinAlgoritmo
