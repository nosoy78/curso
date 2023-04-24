//El menú debe quedar de la siguiente manera:
//	1. Calcular muro de ladrillo
//	2. Calcular viga de hormigón
//	3. Calcular columnas de hormigón
//	4. Calcular contrapisos
//	5. Calcular techo
//	6. Calcular pisos
//	7. Calcular pintura
//	8. Calcular iluminación
//	9. Salir


Algoritmo sin_titulo
	menu()
FinAlgoritmo

SubProceso menu()
	
	definir seleccion Como caracter
	seleccion=""

	
	Hacer
		Escribir "1. Calcular muro de ladrillo"
		Escribir "2. Calcular viga de hormigón"
		Escribir "3. Calcular columnas de hormigón"
		Escribir "4. Calcular contrapisos"
		Escribir "5. Calcular techo"
		Escribir "6. Calcular pisos"
		Escribir "7. Calcular pintura"
		Escribir "8. Calcular iluminación"
		Escribir "9. Salir"
		
		leer seleccion
		
		Segun seleccion
			"1":
				calcularMuro()
			"2":
				calcularViga()
			"3":
				calcularColumna()
			"4":
				calcularContrapisos()
			"5":
				calcularTecho()
			"6":
				calcularPisos()
			"7":
				calcularPintura()
			"8":
				calcularIluminacion()
			"9":
				Escribir "Ha salido del programa"
			De Otro Modo:
				Escribir "Eligio una seleccion equivocada"
		FinSegun
Mientras Que seleccion<>"9"

FinSubProceso

SubProceso calcularSuperficie(base,altura , sup por referencia)
	sup=base*altura
FinSubProceso


SubProceso calcularVolumen(ancho,alto,largo,volumen Por Referencia)
	volumen = ancho * alto * largo
FinSubProceso


SubProceso calcularpintura()
	
	Definir pintura,altura,ancho,superficie Como Real
	definir respuesta Como Caracter
	
	hacer
	Escribir " Por favor ingrese la altura de la pared "
	leer altura
	Escribir	" Por favor ingrese el ancho de la pared "
	leer ancho
	
	calcularSuperficie(altura,ancho,superficie)
	
	pintura = altura * ancho /6
	
	Escribir "Necesitaria " pintura " litros de pintura"
	Escribir "-------------------------------------------------------------"
	Escribir "Quiere volver al menu?"
	leer respuesta
	
Mientras Que respuesta<>"si"
FinSubProceso


SubProceso calcularContrapisos()
	
	
	definir a, b, h Como Real
	Definir volumen Como real
	Definir respuesta Como Caracter
	
	hacer
	Escribir " ingrese el largo del contrapiso "
	leer a
	Escribir " ingrese el ancho del contrapiso "
	leer b
	Escribir " ingrese el espesor del contrapiso "
	leer h
	
	calcularVolumen(a,b,h,volumen)
	
	escribir " el volumen de contrapiso a calcular es : " volumen " m3 "
	escribir " se necesitan : " 
	escribir " cemento : " 105 * volumen "kg"
	escribir " arena : " 0.45 * volumen "m3"
	escribir " piedra : " 0.9 * volumen "m3"
	Escribir "-------------------------------------------------------------"
	Escribir "Quiere volver al menu?"
	leer respuesta
	
Mientras Que respuesta<>"si"
FinSubProceso


SubProceso calcularMuro()
	Definir espesor, largo, alto, metrosCuadrados, cemento, arena, ladrillos Como Real
	Definir respuesta Como Caracter
	hacer
	Hacer
		Escribir "Ingrese si el muro será de 20 o 30 cm."
		Leer espesor
	Mientras Que espesor <> 20 Y espesor <> 30
	Escribir "Ingrese el largo y alto del muro en metros."
	Leer largo, alto
	
	calcularSuperficie(largo,alto,metrosCuadrados)
	
	Si espesor = 20 Entonces
		cemento = metrosCuadrados * 15.2
		arena = metrosCuadrados * 0.115
		ladrillos = metrosCuadrados * 90
		Escribir "Necesitaremos " cemento, "kg de cemento, " arena, "m3 de arena y " ladrillos, " ladrillos."
	SiNo
		Si espesor = 30 Entonces
			cemento = metrosCuadrados * 10.9
			arena = metrosCuadrados * 0.09
			ladrillos = metrosCuadrados * 120
			Escribir "Necesitaremos " cemento, "kg de cemento, " arena, "m3 de arena y " ladrillos, " ladrillos."
		FinSi
	FinSi
	Escribir "-------------------------------------------------------------"
	Escribir "Quiere volver al menu?"
	leer respuesta
	
Mientras Que respuesta<>"si"
FinSubProceso


SubProceso calcularTecho()
	
	Definir espesor,ancho,largo, volumen Como Real
	Definir respuesta Como Caracter
	
	hacer
	Escribir "Espesor del techo a calcular: (m2)"
	leer espesor
	Escribir "ancho del techo a calcular: (m2)"
	leer ancho
	Escribir "largo del techo a calcular: (m2)"
	leer largo
	
	calcularVolumen(espesor,ancho,largo,volumen)
	
	Escribir "Se necesitaran de materiales: "
	Escribir 33*volumen "kg de cemento."
	Escribir 0.072*volumen "m3 de arena."
	Escribir 0.072*volumen "m3 de piedra."
	Escribir 7*volumen "m de hierro del 8."
	Escribir 4*volumen "m de hierro del 6."
	Escribir "-------------------------------------------------------------"
	Escribir "Quiere volver al menu?"
	leer respuesta
	
Mientras Que respuesta<>"si"
	
FinSubProceso


SubProceso calcularViga ()
	definir largo,cemento, piedra, arena, hierro8, hierro4 Como Real
	Definir respuesta Como Caracter
	
	hacer
	Escribir "Escriba el largo de la viga: (mts)"
	leer largo
	
	cemento= largo *9 
	piedra= largo* 0.02
	arena=  largo * 0.03
	hierro8= largo* 4
	hierro4= largo* 3
	
	Escribir "Cantidad de cemento" cemento "KG"
	Escribir  "Cantidad de Piedra " piedra "mt3"
	Escribir "Cantidad de arena" arena "mt3"
	Escribir "Cantidad de Hierro del 8" hierro8 "Mts"
	Escribir "Cantidad de Hierro del 4" hierro4 "Mts"
	Escribir "-------------------------------------------------------------"
	Escribir "Quiere volver al menu?"
	leer respuesta
	
Mientras Que respuesta<>"si"
	
FinSubProceso


SubProceso calculariluminacion()
	
	Definir iluminacion,altura,ancho,largo,volumen Como Real
	definir respuesta Como Caracter
	
	Hacer
	Escribir " Por favor ingrese la altura "
	Leer  altura
	Escribir " Por favor ingrese el ancho "
	Leer  ancho
	Escribir " Por favor ingrese el largo "
	Leer  largo
	
	calcularVolumen(altura,ancho,largo,volumen)
	
	iluminacion = trunc(volumen * 0.20)+1
	
	escribir "La cantidad mínima de superficie de iluminación natural (ventanas y puertas de vidrio) es: " iluminacion
	Escribir "-------------------------------------------------------------"
	Escribir "Quiere volver al menu?"
	leer respuesta
	
Mientras Que respuesta<>"si"
	
FinSubProceso

SubProceso calcularColumna()
	definir largoColumna como real
	definir respuesta como caracter
	
hacer
	Escribir "Escriba el largo de la columna"
	leer largoColumna
	
	Escribir "Se necesitan los siguientes materiales:"
	Escribir 7.5*largoColumna "kg de cemento."
	Escribir 0.016*largoColumna "m3 de arena."
	Escribir 0.016*largoColumna "m2 de piedra"
	Escribir 6*largoColumna "mts de hierro del 10"
	Escribir 3*largoColumna "mts de hierro del 4"
	Escribir "-------------------------------------------------------------"
	Escribir "Quiere volver al menu?"
	leer respuesta
	
Mientras Que respuesta<>"si"
	
FinSubProceso


SubProceso calcularPisos()
	definir respuesta Como Caracter
	Definir ancho, largo,superficie como real
	
	hacer
	
	Escribir "Escriba el ancho y largo del piso: "
	leer ancho,largo
	
	calcularSuperficie(ancho,largo,superficie)
	
	Escribir "Necesitaria " superficie*0.1+superficie "mts de piso."
	Escribir "-------------------------------------------------------------"
	Escribir "Quiere volver al menu?"
	leer respuesta
	
Mientras Que respuesta<>"si"
	
FinSubProceso


