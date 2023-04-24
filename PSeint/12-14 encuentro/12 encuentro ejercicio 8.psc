Funcion res <- login ( user, contra, i )
	definir res Como Logico
	si (user="usuario1" y contra="asdasd" y i >= 0) entonces
		res=verdadero
	sino
		res=falso
	finsi
Fin Funcion

Algoritmo funcionlogin
    
	definir user, contra Como Caracter
	definir res como logico
	definir i, x como entero
    
	escribir "ingrese usuario"
	leer user
	escribir "ingrese contraseña" 
	leer contra
	i=2
	res=login(user, contra, i)
	
	mientras res=falso y i > 0 hacer
		escribir "resultado incorrecto le quedan " i " intentos"
		Escribir ""
		Escribir "Por favor ingrese su usuario"
		leer user
		Escribir "ingrese su clave"
		leer contra
		i=i-1
		res=login(user, contra, i)
        
		si res=verdadero
			escribir "ingreso exitoso"
		sino
			escribir "acceso bloqueado"
		FinSi
	finmientras
FinAlgoritmo