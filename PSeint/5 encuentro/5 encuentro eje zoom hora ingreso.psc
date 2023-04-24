Algoritmo sin_titulo
	Definir horaIngreso, hora como Entero
	horaIngreso=1600
	Escribir "Ingrese la hora a la que se conecto al zoom en hora militar (sin puntos ni espacios, ej.: 1600)"
	Leer hora
	Si (hora-horaIngreso > 15) Entonces
		Escribir "Hoy tendrás tardanza. Recuerda avisarle a tus coaches cuando llegarás tarde. Mañana te esperamos a tiempo, tu participación en el equipo es VITAL"
	SiNo
		Escribir "Llegaste a tiempo, tienes presente"
	FinSi
FinAlgoritmo
