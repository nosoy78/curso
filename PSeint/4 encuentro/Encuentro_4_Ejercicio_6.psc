Algoritmo listatrabajo
	
	Definir cantCorreo Como Entero
	Definir solEjec, solEmer Como Caracter
	
	Escribir "El orden de las tareas es el siguiente:" 
	Escribir "1. Iniciar sesión con usuario de administrador para ver los informes de marketing."
	Escribir "2. Buscar los ultimos ingresos publicitarios de marketing."
	Escribir "3. Completar las hojas de cálculo de ingresos mensuales."
	Escribir "4. Revisar correo electrónico."
	
	Escribir "Ingrese la cantidad de correos no leídos: "
	Leer cantCorreo
	Si cantCorreo < 10
		Escribir "5. Revisar correo de voz"
		Escribir "¿Hay solicitudes de emergencia de otros departamentos? Responda SI/NO"
		Leer solEmer
		Si solEmer == "SI"
			Escribir "6. Realizar solicitudes de emergencia"
			Escribir "¿Hay solicitudes ejecutivas? Responda SI/NO"
			Leer solEjec
			Si solEjec == "SI"
				Escribir "7. Realizar solicitudes ejecutivas"
				Escribir "8. Enviar correo electrónico de actualización"
				Escribir "9. Apagar la computadora"
				Escribir "10. Regar la planta"
			FinSi
		Sino Escribir "¿Hay solicitudes ejecutivas? Responda SI/NO"
			Leer solEjec
			Si solEjec == "SI"
				Escribir "6. Realizar solicitudes ejecutivas"
				Escribir "7. Enviar correo electrónico de actualización"
				Escribir "8. Apagar la computadora"
				Escribir "9. Regar la planta"
			Sino Escribir "6. Enviar correo electrónico de actualización"
				Escribir "7. Apagar la computadora"
				Escribir "8. Regar la planta"
			FinSi
			
		FinSi
	Sino Escribir "5. Apagar la computadora." 
		Escribir "6. Regar la planta."
	FinSi
	
FinAlgoritmo




