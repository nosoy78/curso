Algoritmo ejercicio3Encuentro11Sfuncion
	definir user , pass ,menu , acepta Como Caracter
	definir i , botellas , pesoBotellas , valorBotellas , saldo , saldoF Como Entero
	i=0
	saldo=0
	saldoF=0
	Repetir 
		escribir "ingrese el usuario"
		leer user
		escribir "ingrese la clave"
		leer pass
		i=i+1
		si user == "Albus_D" y pass =="caramelosdeLimon" Entonces
			escribir "Usuario Autorizado"
		sino 
			escribir "intente nuevamente"
			
		FinSi
	mientras que i<3 y user == "Albus_D" y pass =="caramelosdeLimon"=falso
	si i>=3 Entonces
		escribir "clave bloqueada"
		
	FinSi
		repetir 
			si user == "Albus_D" y pass =="caramelosdeLimon" Entonces
				escribir "seleccione una opcion del menu"
				escribir " 1-ingresar botellas"
				escribir " 2-consultar saldo"
				escribir " 3-salir"
				leer menu
				segun menu 
					opcion "1" , "ingresar botellas":
						
						escribir "ingrese la cantidad de botellas"
						leer botellas
						repetir 
							para i=1 hasta botellas 
								pesoBotellas=Aleatorio(100,3000)
								si pesoBotellas<=500 Entonces
									valorBotellas=50
								FinSi
								si pesoBotellas>500 y pesoBotellas<=1500 Entonces
									valorBotellas=125
								FinSi
								si pesoBotellas>1500 Entonces
									valorBotellas=200
								FinSi
								saldo=saldo+valorBotellas
								escribir "botella " i " con peso " pesoBotellas "gr valor $" valorBotellas 
							FinPara
							escribir "el saldo va a aumentar en: $" saldo
						Mientras Que i<botellas
						Escribir "acepta el valor ofrecido?"
						escribir "1-si"
						escribir "2-no"
						leer acepta
						si acepta=="si" o acepta=="1" Entonces
							saldof=saldoF+saldo
							escribir "finalizando operacion....."
							escribir "Saldo actualizado"
						FinSi
						si acepta=="no" o acepta=="2" Entonces
							escribir "Devolviendo material"
						FinSi
						
						si acepta<>"si" y acepta <> "no" y acepta <>"1" y acepta <>"2"
							escribir "opcion incorrecta"	
						FinSi
						
						
					opcion "2" , "consultar saldo":
						escribir "su saldo es de $" saldoF
				FinSegun
				
			FinSi
		mientras que menu<>"3" y menu<>"salir"
FinAlgoritmo

