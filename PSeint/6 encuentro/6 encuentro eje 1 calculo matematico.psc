Algoritmo ejercicio3_encuentro6
	
    definir num1,num2,a como real 
    definir rep como caracter 
	
    escribir "Por favor ingrese dos numeros para realizar operaciones aritmeticas"
    escribir sin saltar "Numero 1: "
    leer num1
    escribir sin saltar "Numero 2: "
    leer num2
	
    si num1<num2 Entonces
        a=num1
        num1=num2
        num2=a
    FinSi
	
    escribir "Que desea hacer: "
    escribir "CALCULADORA"
    escribir  "(S) Sumar "
    escribir  "(R) Restar "
    escribir  "(M) Multiplicar "
    escribir  "(D) Dividir "
    escribir  "Repuesta: "
    leer rep
    segun rep hacer
        "S","s","SUMAR":
            escribir "La suma de los numeros ingresado es: ",num1+num2
        "R","r","RESTAR":
            escribir "La resta de los numeros ingresado es: ",num1-num2
        "M","m","MULTIPLICAR":
            escribir "La multiplicacion de los numeros ingresado es: ",num1*num2
        "D","d","DIVISION":
            escribir "La division de los numeros ingresado es: ",num1/num2
        De Otro Modo:
            escribir "No ingreso la letra que corresponde, por favor leer bien"
    FinSegun
	
FinAlgoritmo
