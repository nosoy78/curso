Algoritmo sin_titulo
	Definir usuario, contrasena Como Caracter
    Definir j Como Entero
    Definir resultado Como Logico
    j=0
    Hacer
		j=j+1
        Escribir "Ingrese su usuario"
        Leer usuario
        Escribir "Ingrese su contraseña"
        Leer contrasena
        resultado=Login(usuario, contrasena)
    Mientras Que resultado=Falso y j<>3
    Escribir resultado
FinAlgoritmo

Funcion  VeroFal <- Login (usu, contra)
    Definir VeroFal Como Logico
	Si usu="1024" y contra="4567"
		VeroFal=Verdadero
	FinSi
FinFuncion

