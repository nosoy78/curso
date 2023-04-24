Algoritmo manzana
	Definir kilo Como Entero
	Definir precio,total,descuento Como Real
	Escribir "Ingresa los kilos de manzanas"
	leer kilo
	Escribir "Ingresa el precio del kilo de manzanas"
	leer precio
	total = precio * kilo
	si kilo <= 2 Entonces
		descuento = 0
	SiNo
		si kilo >= 2.01 y kilo <= 5 Entonces
			descuento = total * .10
			Escribir "Se aplico un 10% de descuento"
		SiNo
			si kilo >= 5.01 y kilo <= 10 Entonces
				descuento = total * .15
				Escribir "Se aplico un 15% de descuento"
			SiNo
				descuento = total * .20
				Escribir "Se aplico un 20% de descuento"
			FinSi
		FinSi
	FinSi
	Escribir "El descuento aplicado es: $",descuento
	Escribir "El total a pagar por ",kilo," kilos de manzana es: $",total - descuento
	
FinAlgoritmo
