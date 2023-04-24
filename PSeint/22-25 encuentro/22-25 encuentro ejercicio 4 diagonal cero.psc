Algoritmo sin_titulo
	Definir f,c,matriz Como Entero
	Dimension matriz(6,6)
	Para f=0 Hasta 5 Con Paso 1 Hacer
		para c=0 Hasta 5 Con Paso 1 Hacer
			si (f==c) Entonces
				matriz(f,c)=0
			SiNo
				matriz(f,c)=azar(9)
				
			FinSi
		FinPara
		
	FinPara
	Para f=0 Hasta 5 Con Paso 1 Hacer
		para c=0 Hasta 5 Con Paso 1 Hacer
		    Escribir matriz(f,c) Sin Saltar
		FinPara
		escribir ""
	FinPara
FinAlgoritmo
