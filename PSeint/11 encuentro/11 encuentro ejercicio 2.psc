Algoritmo sin_titulo
	Definir num, dig, i, j Como Entero 
	
    Escribir "Ingrese un n�mero"
    leer num
    j=1
    i= 0 + trunc(num/10)
    Mientras i>0 Hacer
        j=j+1
        i = 0 + trunc(i/10)
    FinMientras
    Escribir "La Cantidad de Digitos de: ", num, " es: ", j
FinAlgoritmo
