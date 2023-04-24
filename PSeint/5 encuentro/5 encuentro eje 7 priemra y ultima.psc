Algoritmo primultima
	Definir frasePalabra Como Caracter
	Definir ultimaletra Como Entero
	Escribir "Ingrese una frase o palabra que enpiecen y terminen con la misma letra"; leer frasePalabra
	ultimaletra = Longitud(frasePalabra)	
	Si Subcadena(frasePalabra,0,0) == Subcadena(frasePalabra,ultimaletra - 1, ultimaletra - 1) Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	Fin Si
FinAlgoritmo
