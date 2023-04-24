Algoritmo sin_titulo
	definir num Como Entero
    definir numeroMaximo como entero
    definir numeroMinimo Como Entero
    definir promedio como numero
    definir i como numero 
    definir c como numero 
    definir nuevavar como numero
	
    numeroMaximo = 0
    i=0
    c=0
	
    hacer 
		escribir "escriba un número entero"
		leer num
		numeroMinimo = num
		
		si num>numeroMaximo Entonces
			numeroMaximo = num
		FinSi
		
		si num<=numeroMinimo entonces
			numeroMinimo = num
			
		FinSi
		
		i = num+i
		c=c+1
		
	mientras que num <> 0 
	
	escribir "el número más alto fue: " numeroMaximo
	escribir "el número mínimo fue: " numeroMinimo
	Escribir "el promedio es: " i/c

FinAlgoritmo
