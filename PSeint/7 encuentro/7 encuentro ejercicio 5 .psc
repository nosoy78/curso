Algoritmo sin_titulo
	Definir minimo, maximo, numeroUsuario, contador Como Entero
    contador = 0
	
    Escribir 'Ingrese un valor minimo'
    Leer minimo
	
    Escribir 'Ingrese un valor maximo'
    leer maximo
	
    Escribir 'Ingrese un valor'
    leer numeroUsuario
	
    Mientras (numeroUsuario > minimo) Y (numeroUsuario < maximo) Hacer
        contador = contador + 1
        Escribir 'Ingrese un valor'
        leer numeroUsuario
    Fin Mientras
	
    Escribir 'La cantidad de numeros ingresados entre ', minimo ' y ', maximo, ' es de ', contador
FinAlgoritmo
