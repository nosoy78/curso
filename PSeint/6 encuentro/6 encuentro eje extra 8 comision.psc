Algoritmo comision
	definir ht, ph, ventas, ventas2 Como entero
	Definir opci Como Caracter
	Escribir "Hola, que tipo de contrato te gustaria elegir"
	Escribir "A) Comision"
	escribir "B) salario fijo + comision"
	Escribir "C) salario fijo"
	Leer opci
	opci = Minusculas(opci)
	segun opci hacer
		'comision', 'a':
		Escribir "el contrato es por comision"
		Escribir "Ingrese el monto total de las ventas de la semana"
		leer ventas
		Escribir "el salario es de $: " ventas*0.40
	'salario fijo y comision', 'b':
		escribir "El contrato es de Salario fijo + comision"
		Escribir "Ingrese el valor de precio por hora"
		leer ph
		escribir "Ingrese el total de horas trabajadas esta semana"
		leer ht
		si ht >= 40 Entonces
			Escribir "no se permiten mas de 40 horas semanales"
			SiNo
			Escribir "Ingrese el total de las ventas"
			leer ventas2
			Escribir "el total seria de: $" (ht*ph) + (ventas2*0.25)
		FinSi
	'salario fijo', 'c':
		Escribir "el contrato seleccionado es salafio fijo"
		Escribir "ingrese el valor pagado por hora"
		leer ph
		Escribir "ingrese el total de horas trabajadas esta semana"
		leer ht
		si ht <= 40 Entonces
			Definir hx, px Como Real
			hx=(ht - 40)
			px=(ph*0.5)+ph
			Escribir "el saladrio es de $" (40*ph)+(hx*px)
		SiNo
			si ht <=40 y ht > 0 Entonces
			Escribir "el salario seria de $:" (ht*ph)
		SiNo
			Escribir "anda pa ya, bobo"
		FinSi
	FinSi
	
FinSegun
FinAlgoritmo
