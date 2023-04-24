//Realice un algoritmo que solicite al usuario una fecha y muestre por pantalla la fecha anterior.
//	
//	Para ello se deberá utilizar un procedimiento llamado diaAnterior que reciba una fecha repre-
//		sentada a través de tres enteros dia, mes y anio, y retorne la fecha anterior. Puede asumir que
//		
//		dia, mes y anio representan una fecha válida. Realice pruebas de escritorio para los valores
//			dia=5, mes=10, anio=2012 y para dia=1, mes=3, anio=2004.

Algoritmo dia15ej8
	
	definir dia, mes, anio Como Entero
	escribir "vamos a ingresar la fecha del dia, te diré que dia fue ayer, ingrese el dia en numeros"
	leer dia
	escribir "ahora ingrese el mes"
	leer mes
	escribir "por ultimo ingrese el año"
	leer anio
	diaAnterior(dia,mes,anio)
FinAlgoritmo

subproceso diaAnterior(d por referencia,m por referencia,a por referencia)
	d=d-1
	si d=0 Entonces
		si m=1 Entonces
			d=31
		SiNo
			si m=2 Entonces
				d=31
			SiNo
				si m=3 Entonces
					d=28
				SiNo
					si m=4 entonces
						d=31
					sino
						si m=5 Entonces
							d=30
						sino
							si m = 6 Entonces
								d=31
							SiNo
								si m=7 Entonces
									d=30
								SiNo
									si m=8 Entonces
										d=31
									sino
										si m=9 Entonces
											d=31
										SiNo
											si m=10 Entonces
												d=30
												SINO
												si m=11 Entonces
													d=31
													sino
													si m=12 Entonces
														d=30
													FinSi
												FinSi
											FinSi
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
		m=m-1
	FinSi
	si m=0 Entonces
		m=12
		a=a-1
	FinSi
	escribir "ayer fue ",d,"-",m,"-",a
FinSubProceso
	