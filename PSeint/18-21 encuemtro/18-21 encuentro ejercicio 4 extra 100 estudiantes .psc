Algoritmo sin_titulo
	definir numeros_aleatorios,tamanio, contadores,i Como Entero
	Definir deficientes, regulares, buenos, exelentes Como Entero
	Escribir "Escribe un numero para el tamaño del arreglo"
	leer tamanio
	i=0
	
	dimension numeros_aleatorios[tamanio]
	dimension contadores[4]
	
	deficientes=0
	regulares=0
	buenos=0
	exelentes=0
	
	Para i<-0 Hasta tamanio-1 Con Paso 1 Hacer
		numeros_aleatorios[i] = Aleatorio(0,20)
		Escribir numeros_aleatorios[i]
		
		Si numeros_aleatorios[i]>=0 y numeros_aleatorios[i]<=5 Entonces
			deficientes=deficientes+1
		Sino 
			si numeros_aleatorios[i]>=6 y numeros_aleatorios[i]<=10
				regulares=regulares+1	
			Sino 
				si	numeros_aleatorios[i]>=11 y numeros_aleatorios[i]<=15
					buenos=buenos+1
				sino 
					si numeros_aleatorios[i]>=16 y numeros_aleatorios[i]<=20
						exelentes=exelentes+1	
					fin si
				FinSi
			fin SI
		Fin Si
		
	Fin Para
	
	
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Segun i Hacer
			0:
				Escribir "Deficientes (0-5): ", deficientes
			1:
				Escribir "Regulares (6-10): ", regulares
			2:
				Escribir "Buenos (11-15): ", buenos
			3:	
				Escribir "Excelentes (16-20): ", exelentes
		Fin Segun
	Fin Para
	
	
FinAlgoritmo
