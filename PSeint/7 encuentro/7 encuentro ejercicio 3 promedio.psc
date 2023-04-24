Algoritmo secuencia
	definir num, promedio, suma, cont Como Real
	escribir "escriba un numero"
	leer num
	suma=0
	suma=num+suma
	cont=1
	mientras num <> (-1) Hacer
		escribir "ingrese otro numero"
		leer num
		si num <> -1 Entonces
			suma=suma+num
			cont=cont+1
			
		FinSi
	FinMientras
	promedio=suma/cont
	escribir "el promedio es : " , promedio
	
FinAlgoritmo
