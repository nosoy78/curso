Algoritmo sin_titulo
	definir seleccion Como caracter
	Definir  vector_a,vector_b, vector_c, n Como Entero
	Escribir "que tarea quiere realizar"
	escribir "ingresa el tamaño de vectores A, B, C"
	leer n
	Dimension vector_a(n)
	Dimension vector_b(n)
	Dimension vector_c(n)
	//Realizar un programa con el siguiente menú y le pregunte al usuario que quiere hacer hasta
	//que ingrese la opción Salir:
	Hacer
		Escribir "A. Llenar vector A"
		Escribir "B. Llenar vector B"
		Escribir "C. Llenar vector C con suma de A y B"
		Escribir "D. Llenar vector C con resta  de A y B"
		Escribir "E. Mostrar vector A, B o C"
		Escribir "F. Salir"
		leer seleccion
		seleccion =Mayusculas(Subcadena(seleccion ,0,0))
		Segun seleccion
			"A":
				llenar_vector_a(vector_a, n)
			"B":
				lenar_vector_B(vector_b, n)
			"C":
				llenar_vector_c_suma(vector_a, vector_b, vector_c, n)
			"D":
				llenar_vector_c_resta(vector_a, vector_b, vector_c, n)
			"E":
				ver(vector_a, vector_b, vector_c, n)
			"F":
				Escribir "Ha salido del programa"
			De Otro Modo:
				Escribir "Eligio una seleccion equivocada"
		FinSegun
	Mientras Que seleccion <> "F"
FinAlgoritmo
// A. Llenar Vector A. Este vector es de tamaño N y se debe llenar de manera aleatoria
// usando la función Aleatorio(valorMin, valorMax) de PseInt.
Subproceso llenar_vector_a (vector_a, n por referencia)
	Definir va, i Como Entero
	Para i=0 Hasta n-1 Hacer
		vector_a(i)= aleatorio(-100,100)
	Fin Para
FinSubProceso
// B. Llenar Vector B. Este vector también es de tamaño N y se llena de manera aleatoria.
Subproceso lenar_vector_B(vector_b,n por referencia)
	Definir i Como Entero
	Para i=0 Hasta n-1 Hacer
		vector_b(i)=Aleatorio(-100, 100)
	Fin Para
FinSubProceso
// C. Llenar Vector C con la suma de los vectores A y B. La suma se debe realizar elemento
//a elemento. Ejemplo: C = A + B
Subproceso llenar_vector_c_suma(vector_a, vector_b, vector_c, n)
	Definir i Como Entero
	// vector_a+vector_b=vector_c
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		vector_c(i)=vector_a(i)+vector_b(i)
	FinPara
FinSubProceso
//  D. Llenar Vector C con la resta de los vectores B y A. La resta se debe realizar elemento a
// elemento. Ejemplo: C = B - A
Subproceso llenar_vector_c_resta(vector_a, vector_b, vector_c, n)
	Definir i Como Entero
	//   Definir vector_c Como Entero
	// vector_a+vector_b=vector_c
	//   escribir "ingresa el tamaño del vector B"
	//   leer n
	//   Dimension vector_c(n)
	Para i=0 Hasta n-1 Con Paso 1 Hacer
		vector_c(i)=vector_a(i) - vector_b(i)
	FinPara
FinSubProceso
//  E. Mostrar. Esta opción debe permitir al usuario decidir qué vector quiere mostrar: Vector
// A, B, o C.
Subproceso  ver(vector_a, vector_b, vector_c, n)
	Definir z Como Caracter
	Definir i Como entero
	Repetir
		escribir "Que Vector desea mostrar: A, B o C?"
		Leer z
		z=Mayusculas(Subcadena(z,0,0))
	Hasta Que z="A" o z="B" o z="C"
	escribir "Vector ", z
	Segun z Hacer
		"A":
			para i=0 hasta n-1 Hacer
				escribir "[", vector_a[i], "]"
			FinPara
		"B":
			para i=0 hasta n-1 Hacer
				escribir "[", vector_b[i],"]"
			FinPara
		"C":
			para i=0 hasta n-1 Hacer
				escribir "[",vector_c[i],"]"
			FinPara
	FinSegun
	escribir "Presione Enter para continuar."
	//   leer z
    Esperar Tecla
FinSubProceso
//   F. Salir.
//NOTA: El rango de los números aleatorios para los Vectores será de [-100 a 100]. La longitud
//    para todos los vectores debe ser la misma, por lo tanto, esa información sólo se solicitará una vez.



// 029            llenar_vector_c_resta(vector_a, vector_b, n)
// 029            llenar_vector_c_resta(vector_a, vector_b, vector_c, n)
// 037   Mientras Que seleccion<>"9"
// 037   Mientras Que seleccion <> "F"
// 065 Subproceso llenar_vector_c_resta(vector_a, vector_b, n)
//	/ 065 Subproceso llenar_vector_c_resta(vector_a, vector_b, vector_c, n)
//		/ 066
//		/ 066   Definir i Como Entero
//		/ 067   Definir vector_c Como Entero
//		/ 067 //   Definir vector_c Como Entero
//		/ 069   escribir "ingresa el tamaño del vector B"
//		/ 069 //   escribir "ingresa el tamaño del vector B"
//		/ 070   leer n
//		/ 070 //   leer n
//		/ 071   Dimension vector_c(n)
//		/ 071 //   Dimension vector_c(n)
//		/ 072   Para i=0 Hasta n Con Paso 1 Hacer
//			/ 072   Para i=0 Hasta n-1 Con Paso 1 Hacer
//				/ 073      vector_c(i)=vector_a(i)+vector_b(i)
//				/ 073      vector_c(i)=vector_a(i) - vector_b(i)
//				/ 079   Definir z, i Como Caracter
//				/ 079   Definir z Como Caracter
//				/ 080
//				/ 080   Definir i Como entero
//				/ 093         para i=0 hasta vn-1 Hacer
//					/ 093         para i=0 hasta n-1 Hacer
//						/ 097         para i=0 hasta vn-1 Hacer
//							/ 097         para i=0 hasta n-1 Hacer
//								/ 102   leer z
//								/ 102 //   leer z
//								/ 103
//								/ 103     Esperar Tecla