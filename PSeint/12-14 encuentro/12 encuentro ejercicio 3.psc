Funcion multiplo <- EsMultiplo(num1,num2)
	Definir multiplo Como Logico;
	Si num1 % num2 = 0 Entonces
		multiplo <- Verdadero;
	SiNo
		multiplo <- Falso;
	FinSi
FinFuncion
Proceso CalcularMultiplo
	Definir numero1,numero2 Como Entero;
	Escribir Sin Saltar "N�mero 1:";
	Leer numero1;
	Escribir Sin Saltar "N�mero 2:";
	Leer numero2;
	Si EsMultiplo(numero1,numero2) Entonces
		Escribir numero1," es m�ltiplo de ",numero2;
	SiNo
		Escribir numero1," no es m�ltiplo de ",numero2;
	FinSi
FinProceso