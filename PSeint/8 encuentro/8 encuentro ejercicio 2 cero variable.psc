Algoritmo sin_titulo
	definir nMax, nmin, n,i, s Como entero
	i=-1
	nMax=0
	nmin=9
	s= 0
	Repetir
		Escribir "Escriba un numero entero"
		Leer n
		i=i+1
		si nMax < n
			nMax=n
		FinSi
		si n<>0 y nmin > n  
			nmin=n
		FinSi
		s=s+n 
	Mientras Que n<>0
	escribir "El dato maximo ingresado fue " nMax  ",el dato minimo infresado fue " nmin " y el promedio de los datos ingresados fue " s/i 
FinAlgoritmo
