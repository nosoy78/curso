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
	
	valNum<-x //variable para almacenar el número original
	cont<-0 //variable para posicionar el dígito
	val2<-0 //variable para almacenar la suma de los núm fraccionarios
	
	Hacer 
		cont=cont+1 //contador utilizado para saber la posición de los dígitos
		dig=x MOD 10 //se almacena el ultimo dígito
		x=trunc(x/10) //se elimina ultimo dígito
		val2=val2 + (dig*(10^(-cont))) //se almacena el dígito dentro de un número fraccionario
		
		//Si se preguntan como funciona esto es así:
		//supongamos que ingresé el num 1234 lo primero que hago es almacenar el ultimo dígito
		//luego lo elimino quedando el num 123, el dígito eliminado ahora lo posiciono dentro de una fracción
		//al multiplicar el 4 por 10 elevado a la -1 lo que pasa es que ese 4 se conviente en 0.4
		//y al avanzar al siguiente dígito que sería 2*(10^(-2)) sería 0.03 el siguiente sería 0.002 y el último dígito 0.0001
		//al sumar todos esos fraccionarios quedaría así: 0.4 + 0.03 + 0.002 + 0.0001 = 0.4321 luego dentro del "Si"
		//corriendo la coma hacia la derecha la cantidad de espacios cómo digitos tiene en número original quedando en 4321
		//así puedo comparar los resultados y determinar si era capicúa o no 1234<>4321
		
		Si x=0 //la condición indica que hacer al finalizar de recorrer los dígitos
			val2 = redon(val2*(10^cont)) //conviento el número fraccionario en entero
			Escribir val2 //muestro en pantalla el número invertido
			Escribir ""
		FinSi	
	Mientras Que x>0 
	Si valNum=val2 //comparo si el número incial es igual al resultado obtenido
		ret=Verdadero
	SiNo
		ret=Falso
	FinSi
FinFuncion

