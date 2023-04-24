Algoritmo concalong
	definir palabra, palabra1, palabra2, palabra3, palabra4 Como Caracter
	definir n Como Entero
	escribir "ingrese una palabra o frase"
	leer palabra
	palabra1= "!"
	palabra2= "?"
	n=Longitud(palabra)
	palabra3=Concatenar(palabra,palabra1)
	palabra4=Concatenar(palabra,palabra2)
	si n<=4 Entonces
		escribir palabra3
	SiNo
		escribir palabra4
	FinSi
		
	
	
FinAlgoritmo
