Algoritmo ejercicio4_encuentro12
	definir frase, letra como caracter 
	definir cantidad como entero 
	escribir "Ingrese una frase"
	leer frase
	escribir "Ingrese una letra, para saber cuantas veces se repite en la frase"
	leer letra 
	cantidad = cuantasletras (frase,letra)
	escribir "La letra ingresada se repite " cantidad " veces"
FinAlgoritmo



Funcion cantidad <- cuantasletras (frase,letra)
	
	definir cantidad,contador, i como entero
	definir j como caracter
	i= longitud(frase) 
	cantidad=0
	para contador <- 0 hasta i hacer
		j= subcadena(frase,i,i)
		si j = letra entonces  
			cantidad=cantidad + 1 
		FinSi
		i = i -1
	FinPara
	
FinFuncion
