//Diseñar un procedimiento que reciba una frase, y el programa remueva todas las vocales re-
//petidas. Al final el procedimiento mostrará la frase final.
//
//Por ejemplo:
//Entrada: "Habia una vez un barco"
//Salida: "Habi un vez n brco"
//	
//	Se marcan en rojo las repetidas sólo para explicar la consigna. Las vocales ?e?, ?i? y ?o? que-
//		dan al no estar repetidas.

Algoritmo dia15ej9
	definir frase Como Caracter
	
	escribir "ingrese una frase cualquiera"
	leer frase
	frase=minusculas(frase)
	chauVocal(frase)
	
FinAlgoritmo

subproceso chauVocal(f)
	definir i, a,e,t,p,u Como Entero
	definir j como caracter
	a=0
	e=0
	t=0
	p=0
	u=0
	para i=0 hasta longitud(f) Hacer
		j=subcadena(f,i,i)
		si j<>"a" y j<>"e" y j<>"i" y j<>"o" y j<>"u" Entonces
			escribir sin saltar j
		SiNo
			segun j Hacer
				"a": 
					si a<1 Entonces
						escribir sin saltar j
						a=a+1
					FinSi
				"e":
					si e<1 Entonces
						escribir sin saltar j
						e=e+1
					FinSi
				"i":
					si t<1 Entonces
						escribir sin saltar j
						t=t+1
					FinSi
				"O":
					si p<1 Entonces
						escribir sin saltar j 
						p=p+1
					FinSi
				"u": 
					si u<1 Entonces
						escribir sin saltar j 
						u=u+1
					FinSi
			FinSegun
		FinSi
	FinPara
	escribir "" 
FinSubProceso
	