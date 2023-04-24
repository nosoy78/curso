Algoritmo invetir
   
    Definir n, inv Como Entero
    n <- 0
    Mientras n<=0 Hacer
        Escribir 'Ingresar un número entero mayor que cero: ' Sin Saltar
        Leer n
    FinMientras
    Escribir 'El número ', n, ' invertido es ' Sin Saltar
    inv <- 0
    Mientras n<>0 Hacer
        inv <- inv * 10 + n MOD 10
        n <- Trunc(n/10)
    FinMientras
    Escribir inv
FinAlgoritmo
