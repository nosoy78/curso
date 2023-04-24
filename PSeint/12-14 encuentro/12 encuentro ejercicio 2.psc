Funcion retorno <- Paridad(num )
    Definir retorno  Como entero
    retorno <- ( num MOD 2 ) 
Fin Funcion
Algoritmo parimpar
    Definir num Como entero
   
    escribir "ingrese un numero"
	leer num
    si Paridad(num) = 0 Entonces
        escribir Verdadero
	sino escribir falso
    FinSi
FinAlgoritmo