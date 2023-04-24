Algoritmo sin_titulo
	Definir opc Como Caracter
	Definir vA,vB,vC,vD Como Real
	Definir n Como Entero
	
	Escribir "========== Longitud =========="
	Escribir ""
	Escribir "   Ingrese la lóngitud que"
	Escribir "    tendrán los vectores"
	Escribir ""
	Escribir "=============================="
	Leer n
	
	
	Dimension vA(n),vB(n),vC(n),vD(n)
	vA()<-0
	vB()<-0
	vC()<-0
	vD()<-0
	
	Esperar 1 Segundos
	Limpiar Pantalla
	Hacer
		Escribir "============ MENU ============"
		Escribir "A. Llenar Vector A"
		Escribir "B. Llenar Vector B"
		Escribir "C. Llenar Vector C con la "
		Escribir "   suma de los vectores A y B"
		Escribir "D. Llenar Vector C con la "
		Escribir "   resta de los vectores B y A"
		Escribir "E. Mostrar Vector"
		Escribir "F. Salir"
		Escribir "=============================="
		Leer opc
		opc<-mayusculas(opc)
		Esperar 1 Segundos
		Limpiar Pantalla
		Segun opc
			"A":
				vectorA(vA,n)
			"B":
				vectorB(vB,n)
			"C":
				Si vA()<>0 y vB()<>0
					vectorC(vA,vB,vC,n)
				SiNo
					Escribir ""
					Escribir "==============================="
					Escribir "======= Completar A y B ======="
					Escribir "=======     Primero     ======="
					Escribir "==============================="
					Esperar 2 Segundos
					Limpiar Pantalla
				FinSi
			"D":
				Si vA()<>0 y vB()<>0
					vectorD(vA,vB,vD,n)
				SiNo
					Escribir ""
					Escribir "==============================="
					Escribir "======= Completar A y B ======="
					Escribir "=======     Primero     ======="
					Escribir "==============================="
					Esperar 2 Segundos
					Limpiar Pantalla
				FinSi
			"E":
				mostrarVector(vA,vB,vC,vD,n)
			"F":
				Escribir ""
				Escribir "==============================="
				Escribir "=========  Saliendo   ========="
				Escribir "==============================="
				Escribir "========= Fernando  ==========="
				Esperar 2 Segundos
				Limpiar Pantalla
			De Otro Modo:
				Escribir ""
				Escribir "==============================="
				Escribir "======= Ingrese una opc ======="
				Escribir "=======      válida     ======="
				Escribir "==============================="
				Esperar 2 Segundos
				Limpiar Pantalla
		FinSegun
	Mientras Que opc<>"F"
	Esperar 1 Segundos
	Limpiar Pantalla
FinAlgoritmo
//------------------------------------------------------------------------------------------------------
Funcion vectorA(v Por Referencia,m)
	Definir i Como Real
	Escribir "==============================="
	Escribir "===== Llenando el vector A ====="
	Escribir "==============================="
	Esperar 1 Segundos
	
	Para i<-0 Hasta m-1
		v(i)<-Aleatorio(-100,100)
	FinPara
	
	Escribir ""
	Escribir "==============================="
	Escribir "===== vector A completado ====="
	Escribir "==============================="
	Esperar 2 Segundos
	Limpiar Pantalla
FinFuncion
//--------------------------------------------------------------------------------------------------------
Funcion vectorB(v Por Referencia,m)
	Definir i Como Real
	Escribir "==============================="
	Escribir "===== Llenando el vector B ====="
	Escribir "==============================="
	Esperar 1 Segundos
	
	Para i<-0 Hasta m-1
		v(i)<-Aleatorio(-100,100)
	FinPara
	
	Escribir ""
	Escribir "==============================="
	Escribir "===== vector B completado ====="
	Escribir "==============================="
	Esperar 2 Segundos
	Limpiar Pantalla
FinFuncion
//-----------------------------------------------------------------------------------------------------
Funcion vectorC(x,z,q Por Referencia,m)
	Definir i Como Real
	
	Escribir "==============================="
	Escribir "===== Llenando el vector C ====="
	Escribir "==============================="
	Esperar 1 Segundos
	
	Para i<-0 Hasta m-1
		q(i)<-x(i)+z(i)
	FinPara
	
	Escribir ""
	Escribir "==============================="
	Escribir "===== vector C completado ====="
	Escribir "==============================="
	Esperar 2 Segundos
	Limpiar Pantalla
FinFuncion
//-----------------------------------------------------------------------------------------------------
Funcion vectorD(x,z,q Por Referencia,m)
	Definir i Como Real
	
	Escribir "==============================="
	Escribir "===== Llenando el vector D ====="
	Escribir "==============================="
	Esperar 1 Segundos
	
	Para i<-0 Hasta m-1
		q(i)<-z(i)-x(i)
	FinPara
	
	Escribir ""
	Escribir "==============================="
	Escribir "===== vector D completado ====="
	Escribir "==============================="
	Esperar 2 Segundos
	Limpiar Pantalla
FinFuncion
//----------------------------------------------------------------------------------------------------
Funcion mostrarVector(a,b,c,d,m)
	Definir opc,i Como Entero
	Hacer
		Escribir "========== Menú Mostrar ==========="
		Escribir "1. Mostrar contenido del Vector A"
		Escribir "2. Mostrar contenido del Vector B"
		Escribir "3. Mostrar contenido del Vector C"
		Escribir "4. Mostrar contenido del Vector D"
		Escribir "5. Salir"
		Escribir "==================================="
		Leer opc
		Esperar 1 Segundos
		Limpiar Pantalla
		Escribir "========== Menú Mostrar ==========="
		Segun opc
			1:
				Escribir ""
				Escribir "Contenido del Vector A"
				Escribir ""
				Para i<-0 Hasta m-1
					Escribir " " a(i) "," Sin Saltar
				FinPara
				Escribir ""
				Escribir ""
				Escribir "Presione una tecla para continuar"
				Escribir ""
				Escribir "==================================="
				Esperar Tecla
				Limpiar Pantalla
			2:
				Escribir ""
				Escribir "Contenido del Vector B"
				Escribir ""
				Para i<-0 Hasta m-1
					Escribir b(i) "," Sin Saltar
				FinPara
				Escribir ""
				Escribir ""
				Escribir "Presione una tecla para continuar"
				Escribir ""
				Escribir "==================================="
				Esperar Tecla
				Limpiar Pantalla
			3:
				Escribir ""
				Escribir "Contenido del Vector C"
				Escribir ""
				Para i<-0 Hasta m-1
					Escribir c(i) "," Sin Saltar
				FinPara
				Escribir ""
				Escribir ""
				Escribir "Presione una tecla para continuar"
				Escribir ""
				Escribir "==================================="
				Esperar Tecla
				Limpiar Pantalla
			4:
				Escribir ""
				Escribir "Contenido del Vector D"
				Escribir ""
				Para i<-0 Hasta m-1
					Escribir d(i) "," Sin Saltar
				FinPara
				Escribir ""
				Escribir ""
				Escribir "Presione una tecla para continuar"
				Escribir ""
				Escribir "==================================="
				Esperar Tecla
				Limpiar Pantalla
			5:	
			De Otro Modo:
				Escribir ""
				Escribir "==============================="
				Escribir "======= Ingrese una opc ======="
				Escribir "=======      válida     ======="
				Escribir "==============================="
				Esperar 2 Segundos
				Limpiar Pantalla
		FinSegun
	Mientras Que opc<>5
	Limpiar Pantalla
	Escribir ""
	Escribir "==============================="
	Escribir "=====  Volviendo al Menú  ====="
	Escribir "=====      Principal      ====="
	Escribir "==============================="
	Esperar 2 Segundos
	Limpiar Pantalla
FinFuncion
	