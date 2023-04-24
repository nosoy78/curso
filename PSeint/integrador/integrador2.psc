Algoritmo sin_titulo
	Definir m Como Entero
	Definir genz Como Cadena
	Escribir "escriba el tamaño de la matriz"
	leer m
	Dimension genz(m,m)
	ingresoGen(genz,m)
	mostrarGen(genz,m)
	buscarcoincidencia(genz,m)
	
	
FinAlgoritmo
funcion ingresoGen(genz Por Referencia,m)
	//1 ingresar gen (la palabra)
	Definir i,j,cont Como Entero
	Definir palabra como cadena
	Hacer
		Escribir "por favor ingrese la palabra, de ",m*m, " digitos"
		leer palabra
		palabra=Mayusculas(palabra)
	Mientras Que Longitud(palabra) <> m*m
	cont=0
	para i=0 Hasta m-1
		para j=0 Hasta m-1
			genz(i,j) = Subcadena(palabra,cont , cont)
			cont=cont+1
		FinPara
	FinPara
	
FinFuncion
Funcion mostrarGen(genz,m)
	// 2 mostar esa matriz
	Definir i,j Como Entero
	Limpiar Pantalla
	Escribir "el gen ingresado es "
	Escribir ""
	para i=0 Hasta m-1
		Para  j=0 Hasta m-1
			Escribir Sin Saltar " |", genz(i,j) "|"
			
		FinPara
		Escribir ""
	FinPara
	
FinFuncion
Funcion buscarcoincidencia(genz,m)
	// 3 buscar coincidencias
	Definir i,j, contdiag1, contdiag2 Como Entero
	Definir validaciondiagonal, validaciondiagonal2 como cadena
	Dimension validaciondiagonal(m), validaciondiagonal2(m)
	Escribir ""
	
	para i=0 Hasta m-1
		para j=0 Hasta m-1
			si i=j 
				validaciondiagonal(i)=genz(i,j)
				
			FinSi
			
			si i+j =m-1
				validaciondiagonal2(i)=genz(i,j)
				
			FinSi
			
		FinPara
	FinPara
	contdiag1=0
	contdiag2=0
	para i=0 Hasta m-1
		si validaciondiagonal(i) = genz(0,0)
			contdiag1 = contdiag1 +1
		FinSi
		si validaciondiagonal2(i) = genz(0,m-1)
			contdiag2 = contdiag2 +1
		FinSi
		
	FinPara
	si contdiag1 = m y contdiag2 = m
		Escribir "se detecto el genz, con las letras " genz(0,0) " y ", genz(0,m-1)
	SiNo
		Escribir "no se detecto genz, las diagonales son distintas"
	FinSi
	
FinFuncion
	