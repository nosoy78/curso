Algoritmo sin_titulo
	Definir frase,n Como Caracter
	Definir i,f Como Entero
	Escribir "Escriba una frase"
	Leer frase
	f=Longitud(frase)
	Para i=0 Hasta f 
		n<-Subcadena(frase,i,i)
		Escribir Sin Saltar " " n " "
	FinPara
FinAlgoritmo
