Algoritmo sin_titulo
	Definir horaIngreso, hora como Entero
	horaIngreso=1600
	Escribir "Ingrese la hora a la que se conecto al zoom en hora militar (sin puntos ni espacios, ej.: 1600)"
	Leer hora
	Si (hora-horaIngreso > 15) Entonces
		Escribir "Hoy tendr�s tardanza. Recuerda avisarle a tus coaches cuando llegar�s tarde. Ma�ana te esperamos a tiempo, tu participaci�n en el equipo es VITAL"
	SiNo
		Escribir "Llegaste a tiempo, tienes presente"
	FinSi
FinAlgoritmo
