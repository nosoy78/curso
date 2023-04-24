Algoritmo sin_titulo
	Definir tiempotransc, nafta Como Real
	Escribir "Ingrese tiempo transcurrido en horas"
	Leer tiempotransc
	Si (tiempotransc <= 2) Entonces
		Escribir ("Tarifa: 400$")
	SiNo
		Escribir "Ingrese cantidad de litros de nafta gastados"
		Leer nafta
		tiempotransc=((tiempotransc)*60)*5.2+40*nafta
		Escribir "Monto total ", tiempotransc
	FinSi
FinAlgoritmo
