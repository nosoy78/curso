Algoritmo Fechas
	definir dia, mes, anio Como entero
    definir meses como cadena
	Dimension meses[12] 
	meses[0]="Enero"
	meses[1]="Febrero"
	meses[2]="Marzo"
	meses[3]="Abril"
	meses[4]="Mayo"
	meses[5]="Junio"
	meses[6]="Julio"
	meses[7]="Agosto"
	meses[8]="Septiembre"
	meses[9]="Octubre"
	meses[10]="Noviembre"
	meses[11]="Diciembre"
	//Leer los valores de dia, mes y anio
	escribir "ingrese el dia"
	leer dia
	escribir "ingrese el mes"
	leer mes
	escribir "ingrese el año"
	leer anio
	
	//Comprobar que sea una fecha válida
	si (mes < 1 o mes > 12) o (anio < 1) entonces
		escribir("Fecha inválida")
		
	fin si
	
	//Comprobar que el día sea válido según el mes y el año
	segun mes hacer
		caso 2:
			//Comprobar si es año bisiesto
			si (anio mod 4 = 0) y ((anio mod 100 <> 0) o (anio mod 400 = 0)) entonces
				si (dia > 29) entonces
					escribir("Fecha inválida")
					
				fin si
			sino
				si (dia > 28) entonces
					escribir("Fecha inválida")
					
				fin si
			fin si
		caso 4,6,9,11:
			si (dia > 30) entonces
				escribir("Fecha inválida")
				
			fin si
		caso 1,3,5,7,8,10,12:
			si (dia > 31) entonces
				escribir("Fecha inválida")
				
			fin si
		De Otro Modo:
			
			si (dia > 30) entonces
				escribir("Fecha inválida")
				
			fin si
	fin segun
	
	//Imprimir la fecha cambiando el número que representa el mes por su nombre
	escribir dia, " de ", meses[mes-1], " de ", anio
	

FinAlgoritmo
