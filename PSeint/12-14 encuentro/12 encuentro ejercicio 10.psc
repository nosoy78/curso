Funcion retorno<- SumaDigitos(num)
    definir retorno,i como enteros
	
	si num<=9 entonces 
		retorno=num
	SiNo
		si num>9 Y num<100 Entonces
			retorno=(num mod 10) + (trunc(num/10))
		SiNo
			si num>99 Y num<1000
				retorno=(num mod 10)+(trunc(num/10) mod 10)+ (trunc(num/100))
			FinSi
		FinSi
	finsi
	
FinFuncion

Algoritmo sumaDigitos_funcion
    definir num Como entero
    escribir " Ingrese un numero entero por favor (limite: 3 digitos) "
    leer num 
    escribir " La suma de los digitos del numero ingresado es de: " SumaDigitos(num)
FinAlgoritmo
