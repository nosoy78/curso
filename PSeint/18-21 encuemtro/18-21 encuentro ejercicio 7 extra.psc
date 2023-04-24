//7. Programe una función que calcule el producto de un arreglo de números enteros. Para esto
//imagine, por ejemplo, que para un vector V de tamaño 4, el producto de todos los valores es
//igual a (V[1]*V[2]*V[3]*V[4])

Algoritmo enc18a21_extras7
	
	Definir numVector, N, i Como Entero
	
	N = Aleatorio(1, 9)
	Escribir "Dimensionando -> numVector[", N, "]"
	Dimension numVector[N]
	Escribir "Poblando vector..."
	fillVector(numVector, N)
	showVector(numVector, N)
	
	Escribir "Producto: ", multElements(numVector, N)
	
FinAlgoritmo

Funcion fillVector(v, r)
	Definir i Como Entero
	Para i = 0 Hasta r - 1
		v[i] = Aleatorio(0, 9)
	FinPara
FinFuncion

Funcion showVector(v, r)
	Definir i Como Entero
	Para i = 0 Hasta r - 1
		Escribir "v[", i, "]: ", v[i]
	FinPara
FinFuncion

Funcion return <- multElements(v, n)
	Definir return, i Como Entero
	return = 1
	Para i = 0 Hasta n - 1
		return = return * v[i]
	FinPara
FinFuncion