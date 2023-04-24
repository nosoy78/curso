//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como numero
//
//entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner números con de-
//cimales ni letras. Ejemplo: ingresando "100"(carácter) debe convertirse en 100(entero).

Algoritmo dia12ej7
	definir num Como Entero
	definir numC como caracter
	repetir
		escribir "ingrese un numero de 3 digitos, se guardara como linea de caracteres"
		leer numC
	hasta que longitud(numC)<=3
	num = conversor(numC)
	escribir "el numero convertido a entero es: " num
FinAlgoritmo

funcion retorno = conversor(x)
	definir retorno, c, d, u, i Como Entero
	si longitud(x) == 1 entonces
		x=concatenar("00",x)
	FinSi
	si longitud(x) == 2 Entonces
		x=concatenar("0",x)
	FinSi
	para i=0 hasta longitud(x) Hacer
		si i=0 entonces
			segun subcadena(x,i,i) Hacer
				"1": 
					c=100
				"2": 
					c=200
				"3": 
					c=300
				"4":
					c=400
				"5":
					c=500
				"6":
					c=600				
				"7":
					c=700
				"8":
					c=800
				"9":
					c=900
				"0": 
					c=0
			FinSegun
		sino 
			si i=1 Entonces
				segun subcadena(x,i,i) Hacer
					"1": 
						d=10
					"2": 
						d=20
					"3": 
						d=30
					"4":
						d=40
					"5":
						d=50
					"6":
						d=60
					"7":
						d=70
					"8":
						d=80
					"9":
						d=90
					"0": 
						d=0
				FinSegun
			SiNo
				segun subcadena(x,i,i) Hacer
					"1": 
						u=1
					"2": 
						u=2
					"3": 
						u=3
					"4":
						u=4
					"5":
						u=5
					"6":
						u=6
					"7":
						u=7
					"8":
						u=8
					"9":
						u=9
					"0": 
						u=0
				FinSegun
			FinSi
		finsi
	FinPara
	retorno=c+d+u
FinFuncion
