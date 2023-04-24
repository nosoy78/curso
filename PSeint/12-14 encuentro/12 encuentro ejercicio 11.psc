Algoritmo sin_titulo
	Definir n Como Real
	Escribir "ingrese numero para conocer si sus digitos son impares"
	Leer n	
	Escribir impar(n)

FinAlgoritmo

Funcion g <- impar (n)
	Definir v como entero
	Definir g Como Logico
	v=1
	g = Verdadero
	Hacer 
		v = n mod 10 // mod tengo el decimal
		n = trunc(n/10) // divido en 10 y trunco (desprecio decimal)
		//Escribir n " <- n"
		//Escribir v " <- v"
		//Escribir v mod 2 " <- v"
		Si (v mod 2) == 0 Entonces
			g = Falso
		SiNo Si ( v mod 2 ) <> 0 Entonces
				g = Verdadero
			FinSi
		FinSi
		//Escribir g " <- g"
	Mientras Que ((n <> 0) y (g == Verdadero))
	
FinFuncion
//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número
//tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener que separar el
//		numero en partes (si es un numero de más de un digito) y ver si cada número es par o impar.
//		Nota: recordar el uso de la función Mod y Trunc(). No podemos pasar el numero a cadena para
//				realizar el ejercicio.