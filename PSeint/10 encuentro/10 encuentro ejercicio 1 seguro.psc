Algoritmo c10_ej1
	definir i , j , vendedores , cantidadVentas Como Entero
	definir sueldoBase , sueldoTotal , comision , totalComisiones Como Real
	
	Escribir "Ingrese cantidad de vendedores"
	leer vendedores
	
	para i = 1 hasta vendedores
		
		totalComisiones=0
		
		escribir "Ingrese sueldo base de vendedor numero " i
		leer sueldoBase
		
		escribir "Ingrese cantidad de ventas"
		leer cantidadVentas
		
		para j=1 hasta cantidadVentas
			
			escribir "Ingrese monto de la venta numero " j
			leer comision
			
			totalComisiones= totalComisiones + comision*.1
			
		FinPara
		
		sueldoTotal= totalComisiones + sueldoBase
		escribir "El vendedor numero " i " cobrara $" totalComisiones " enconcepto de comisiones de las ventas realizadas y $" sueldoTotal " en total esta semana."
		Escribir " "
	FinPara
	
FinAlgoritmo
