Algoritmo sin_titulo
	definir nombre como caracter 
    definir notaPrac,notaPro,notaTeo,num,resultado Como Real
    notaPrac=0
    notaPro=0
    notaTeo=0
    escribir "Ingrese el nombre del alumno + las tres notas a calcular"
    escribir sin saltar"Nombre: "
    leer nombre
    escribir sin saltar "Practica: "
    leer num
    notaPrac=(num*10)/100
    escribir sin saltar "Problema: "
    leer num
    notaPro=num*50/100
    escribir sin saltar "Teorica: "
    leer num
    notaTeo=num*40/100
    resultado = notaPrac+notaPro+notaTeo
	
    mientras nombre <>"" y notaPrac > 0 y notaPrac <=10 y notaPro>0 y notaPro <=10 y notaPro>0 y notaPro <=10 Hacer
        escribir "Su nombre: ",nombre
        escribir "Su promedio ",resultado
		
        escribir sin saltar"Nombre: "
        leer nombre
        escribir sin saltar "Practica: "
        leer num
        notaPrac=(num*10)/100
        escribir sin saltar "Problema: "
        leer num
        notaPro=num*50/100
        escribir sin saltar "Teorica: "
        leer num
		
        si nombre == "" Entonces
            escribir "No ingreso Ningun nombre"
        FinSi
        si resultado > 10 Entonces
            escribir "Ingreso mal las notas tiene que ser ente 0 y 10"
        FinSi
    FinMientras
    escribir "Gracias!!!"
FinAlgoritmo
