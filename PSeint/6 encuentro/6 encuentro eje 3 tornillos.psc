Algoritmo ejercicio_3
    Definir gr5,gr6,gr7,gr8,men,mas, td,tsd Como Entero
    Escribir "ingrese la cantidad de tornillos defectuosos"
    leer td
    Escribir "ingrese la cantidad de tornillos sin defectos"
	
    leer tsd
	
	Si td<=200 y tsd>=1000 Entonces
        Escribir "grado 8"
		
    SiNo
        Si td>=200 y tsd>=1000 Entonces
			
            Escribir "grado 7"
			
        SiNo
            si  td<=200 y  tsd<=1000 Entonces
				
                Escribir "grado 6"
            SiNo
                si  td>=200 y  tsd<=1000 Entonces
					
                    Escribir "grado 5"
                FinSi
            FinSi
        FinSi
    Fin Si
	
	
	
	
	
FinAlgoritmo