Algoritmo clase12_14Ejerc9revisar
    definir nombre,dia,diaf,respuesta,turno Como Caracter
    definir horas como entero
	
    escribir " digite su nombre "
    leer nombre
    escribir "ingrese el dia de la semana "
    leer dia
    escribir "ingrese su turno"
    leer turno
    escribir "ingrese cantidad de horas trabajadas"
    leer horas
    escribir "ese dia era festivo? , responda con s / n "
    leer respuesta
	
    escribir "a " nombre " le corresponde " jornal(respuesta,turno,horas)
FinAlgoritmo

funcion monto <- jornal(respuesta,turno,horas)
    definir monto Como Entero
    definir n,s,diurno,nocturno como caracter
	
    monto = 0
    si turno = "diurno"
        monto = horas * 90
        si respuesta = "s"
            monto = horas * (90+1.10)
			
        FinSi
    sino 
        si turno = "nocturno"
            monto = horas + 125
            si respuesta =" s"
                monto = horas + (125*1.15)
            FinSi
        FinSi
    fin si
fin funcion