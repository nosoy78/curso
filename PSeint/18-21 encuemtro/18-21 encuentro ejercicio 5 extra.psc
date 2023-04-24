Algoritmo Ejercicio_extra_5
	Definir frase,vector como cadena
	Definir i, posi,pMe , pMa,dMe,dMa como entero
	Definir carac Como Caracter
	
	pMe=0
	pMa=0
	
	Escribir "Ingrese una frase"
	leer frase
	Dimension vector[20]
	
	Para i=0 Hasta 19 Con Paso 1 Hacer
		vector[i]= Subcadena(frase,i,i)
	Fin Para
	
	Escribir "Ingrese un caracter y una posicion dentro del arreglo"
	leer carac, posi
	
	si vector[posi] = "" o  vector[posi] = " " Entonces
		vector[posi] = carac
		Para i=0 Hasta 19 Con Paso 1 Hacer
			Escribir Sin Saltar vector[i]
		Fin Para
	SiNo
		
		buscar(posi,vector,pMe,pMA)
		dMe = posi - pMe
		dMa= pMa - posi
		Si dMe<dMa Entonces
			vector[posi] = carac
			Para i=(posi+1) Hasta 19 Con Paso 1 Hacer
				vector[i]= Subcadena(frase,(i-1),(i-1))
			Fin Para
			Para i=0 Hasta 19 Con Paso 1 Hacer
				Escribir Sin Saltar vector[i]
			Fin Para
		Fin Si
		
		Si dMa<=dMe Entonces
			vector[posi] = carac
			Para i=(posi+1) Hasta 19 Con Paso 1 Hacer
				vector[i]= Subcadena(frase,(i-1),(i-1))
			Fin Para
			Para i=0 Hasta 19 Con Paso 1 Hacer
				Escribir Sin Saltar vector[i]
			Fin Para
		Fin Si
		
		
	FinSi
	
FinAlgoritmo
SubProceso buscar(posi,vector,pMe Por Referencia,pMA Por Referencia)
	Definir i Como Entero
	
	Para i=posi Hasta 0 Con Paso -1 Hacer
		Si (vector[i] = "" o  vector[i] = " ") y pMe=0  Entonces
			pMe=i
		Fin Si
	Fin Para
	Para i=posi Hasta 19 Con Paso 1 Hacer
		Si (vector[i] = "" o  vector[i] = " ") y pMa=0  Entonces
			pMa=i
		Fin Si
	Fin Para
	Escribir pMe " y " pMa 
FinSubProceso
	