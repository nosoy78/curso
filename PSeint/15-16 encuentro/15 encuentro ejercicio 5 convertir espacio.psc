//Crea un procedimiento "convertirEspaciado", que reciba como argumento un texto y muestra
//una cadena con un espacio adicional tras cada letra.
//Por ejemplo, "Hola, tú" devolverá "H o l a , t ú ". Crea un programa principal donde se use
//dicho procedimiento.

Algoritmo dia15ej5
	definir frase, frase2, letra Como Caracter
	definir i Como Entero
	i=0
	frase2="" 
	letra=""
	escribir "ingrese una frase cualquiera"
	leer frase
	convertirEspaciado(frase, i, frase2, letra)
	
FinAlgoritmo

subproceso convertirEspaciado(x, i, z, l)
	para i=0 hasta longitud(x) Hacer
		l=concatenar(" ",subcadena(x,i,i))
		z=concatenar(z,l)
	FinPara
	escribir z
FinSubProceso
	