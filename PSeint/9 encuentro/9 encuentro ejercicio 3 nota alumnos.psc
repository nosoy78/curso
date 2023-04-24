Algoritmo Ejercicio3_encuentro9
	Definir N,i,d,n1,n3 Como Entero
	Definir nota1,nota2,nota3,inte,expo,parc,notafinal,suma,r1,r2,notamayor,MAYOR Como Real
	Escribir "Escriba la cantidad de alumnos que tiene"
	Leer N
	d=0
	suma=0
	n1=0
	notamayor=0
	n3=0
	Para i=1 Hasta N
			Escribir "Escriba las 3 notas de su alumno número ",i," (Integrador,exposición y parcial)"
			Leer nota1,nota2,nota3
			inte=nota1*0.35
			expo=nota2*0.25
			parc=nota3*0.40
			notafinal=inte+expo+parc
			Escribir "La nota final es: ",notafinal
				Si notafinal<=6.5 Entonces
					Escribir "El alumno ha DESAPROBADO la nota final"
					d=d+1
					suma=suma+notafinal
				SiNo
					Escribir "El alumno ha APROBADO la nota final"
				FinSi
				Si nota1>=7.5 Entonces
					n1=n1+1
				FinSi
				Si nota2>notamayor
					MAYOR=nota2
				FinSi
				notamayor=nota2
				Si nota3>=4.0 y nota3<=7.5
					n3=n3+1
				FinSi
	FinPara
		r1=suma/d
		r2=(n1/N)*100
	Escribir "La cantidad de desaprobados son: ",d," y el promedio es ",r1
	Escribir "El porcentaje de alumnos que tiene una nota de integrador mayor a 7.5 es el ",r2,"%"
	Escribir "La mayor nota obtenida en las exposiciones fue: ",MAYOR
	Escribir "La cantidad de alumnos que tuvieron una nota de parcial entre 4.0 y 7.5 es: ",n3
FinAlgoritmo
