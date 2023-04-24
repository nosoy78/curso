Algoritmo sin_titulo
	Definir mes Como Caracter
	Definir monto, total Como Entero
	Escribir "Ingrese el mes actual y el monto total"
	Leer mes
	Leer monto
	Si (mes == "septiembre") O (mes == "octubre") O (mes == "noviembre") Entonces
		total = monto-((10*monto)/100)
	SiNo
		total=monto
	FinSi
	Escribir "El total a pagar es " total
FinAlgoritmo