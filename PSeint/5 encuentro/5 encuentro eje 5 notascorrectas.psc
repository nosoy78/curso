Algoritmo EjercicioPractico5
	Definir nota1, nota2, nota3 Como Real
	Definir variableLogica Como Logico
	Escribir "Ingrese la nota numero 1";leer nota1
	Escribir "Ingrese la nota numero 2";leer nota2
	Escribir "Ingrese la nota numero 3";leer nota3	
	Si (nota1 >= 1 y nota1 <= 10) y (nota2 >= 1 y nota2 <= 10) y (nota3 >= 1 y nota3 <= 10) Entonces
		variableLogica = Verdadero; Escribir "Las 3 notas son correctas"
	SiNo
		variableLogica = Falso; Escribir "1 o mas notas no estan en el rango pedido."
	Fin Si

FinAlgoritmo
