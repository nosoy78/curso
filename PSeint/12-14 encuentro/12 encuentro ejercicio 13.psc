Algoritmo sin_titulo
	
	Definir num Como Real
	Leer num
	Escribir "Es " num " un numero capicua? "
	Escribir ""
	Escribir FunCapicua(num)
	
FinAlgoritmo

Funcion ret<-FunCapicua(x)
	Definir ret Como Logico
	Definir cont,dig Como Entero
	Definir val2,valNum Como Real
	
	valNum<-x //variable para almacenar el n�mero original
	cont<-0 //variable para posicionar el d�gito
	val2<-0 //variable para almacenar la suma de los n�m fraccionarios
	
	Hacer 
		cont=cont+1 //contador utilizado para saber la posici�n de los d�gitos
		dig=x MOD 10 //se almacena el ultimo d�gito
		x=trunc(x/10) //se elimina ultimo d�gito
		val2=val2 + (dig*(10^(-cont))) //se almacena el d�gito dentro de un n�mero fraccionario
		
		//Si se preguntan como funciona esto es as�:
		//supongamos que ingres� el num 1234 lo primero que hago es almacenar el ultimo d�gito
		//luego lo elimino quedando el num 123, el d�gito eliminado ahora lo posiciono dentro de una fracci�n
		//al multiplicar el 4 por 10 elevado a la -1 lo que pasa es que ese 4 se conviente en 0.4
		//y al avanzar al siguiente d�gito que ser�a 2*(10^(-2)) ser�a 0.03 el siguiente ser�a 0.002 y el �ltimo d�gito 0.0001
		//al sumar todos esos fraccionarios quedar�a as�: 0.4 + 0.03 + 0.002 + 0.0001 = 0.4321 luego dentro del "Si"
		//corriendo la coma hacia la derecha la cantidad de espacios c�mo digitos tiene en n�mero original quedando en 4321
		//as� puedo comparar los resultados y determinar si era capic�a o no 1234<>4321
		
		Si x=0 //la condici�n indica que hacer al finalizar de recorrer los d�gitos
			val2 = redon(val2*(10^cont)) //conviento el n�mero fraccionario en entero
			Escribir val2 //muestro en pantalla el n�mero invertido
			Escribir ""
		FinSi	
	Mientras Que x>0 
	Si valNum=val2 //comparo si el n�mero incial es igual al resultado obtenido
		ret=Verdadero
	SiNo
		ret=Falso
	FinSi
FinFuncion

