
Algoritmo dia22xtra7
	definir diaTotal como caracter                             
	definir prod,totSem,masV como entero                
	dimension diaTotal[7],prod[5,7],totSem[6],masV[6]      
    dias(diaTotal)                                         
	ingreso(prod,diaTotal)
	encabezado(diaTotal)
	prodDiaySuma(prod)
	filaTotal(prod,totSem)
	filaMV(prod,masV)
FinAlgoritmo

subproceso dias(diaTotal)            
	diaTotal[0]="prod - dias->"
	diaTotal[1]="     [Lunes]"
	diaTotal[2]="    [Martes]"
	diaTotal[3]="   [Miercoles]"
	diaTotal[4]="    [Jueves]"
	diaTotal[5]="   [Viernes]"
	diaTotal[6]="  [Total Producto]"
FinSubProceso

subproceso ingreso(prod,diaTotal)                                     
	definir i,j como entero	
	para i=0 hasta 4 Hacer
		escribir "ingrese la cantidad de venta del producto ",i+1
		para j=0 hasta 0 Hacer
			prod[i,j]=i
		finpara
        para j=1 hasta 5 Hacer
			escribir " para el dia ",diaTotal[j],":"
			leer prod[i,j]
		FinPara
	FinPara
FinSubProceso
subproceso encabezado(diaTotal)                                    
	definir i como entero
	para i=0 hasta 6 Hacer
		escribir sin saltar diaTotal[i]		
	FinPara	
	escribir""
	Escribir "_______________________________________________________________________________________________"
FinSubProceso

subproceso prodDiaySuma(prod)                                        
	definir i,j,sumaP como entero
	sumaP=0
	para i=0 hasta 4 Hacer
		sumaP=0
		escribir sin saltar "[Producto "
		para j=0 hasta 6 Hacer
			si j=0 Entonces                                          
				escribir sin saltar prod[i,j]+1,"]"
			SiNo
				si j<6 entonces                                      
					escribir sin saltar "        [",prod[i,j],"]"
					sumaP=sumaP+prod[i,j]                            
				SiNo
					prod[i,j]=sumaP                                   
					escribir sin saltar "         [",prod[i,j],"]"  
				finsi
			FinSi
			
		FinPara
		escribir "" 
		Escribir "_______________________________________________________________________________________________"
	FinPara
FinSubProceso

subproceso filaTotal(prod,totSem)                     
	definir i,j,sumaT Como Entero
	para i=0 hasta 5 Hacer                           
		totSem[i]=0
	FinPara
	para i=0 hasta 4 Hacer
		para j=1 hasta 5 Hacer
			segun j Hacer                           
				1:
					totSem[0]=totSem[0]+prod[i,j]
				2:
					totSem[1]=totSem[1]+prod[i,j]
				3:
					totSem[2]=totSem[2]+prod[i,j]
				4:
					totSem[3]=totSem[3]+prod[i,j]
				5:
					totSem[4]=totSem[4]+prod[i,j]
			FinSegun
		FinPara
	FinPara
	escribir sin saltar "[Total Semana]"                  
	sumaT=0
	para i=0 hasta 5 Hacer
		si i<5 Entonces
			escribir sin saltar "      [",totSem[i],"] " 
			sumaT=sumaT+totSem[i]
		SiNo
			totSem[i]=sumaT
			escribir "        [",totSem[i],"]"  
			Escribir "_______________________________________________________________________________________________"
		FinSi
	FinPara
FinSubProceso

subproceso filaMV(prod, masV)                      
	definir i,j, prodT, x, freq, z como entero
	dimension prodT[7,5], freq[5]
	para i=0 hasta 4 Hacer                        
		para j=0 hasta 6 Hacer                    
			prodT[j,i]=prod[i,j]
		FinPara
	FinPara
	x=0
	para i=1 hasta 6 Hacer                                  
		para j=0 hasta 4 Hacer                   
			si prodT[i,j]>x Entonces
				x=prodT[i,j]                       
				masV[i-1]=prodT[0,j]               
			FinSi                                 
		FinPara
		x=0
	FinPara
	para i=0 hasta 4 Hacer                       
		freq[i]=0                                  
	FinPara                                       
	para i=0 hasta 4 Hacer
		segun masV[i] Hacer                       
			0:                                     
				freq[masV[i]]=freq[masV[i]]+1
			1:
				freq[masV[i]]=freq[masV[i]]+1
			2:
				freq[masV[i]]=freq[masV[i]]+1
			3:
				freq[masV[i]]=freq[masV[i]]+1
			4:
				freq[masV[i]]=freq[masV[i]]+1				
		FinSegun
	FinPara
	z=0                                           
	para i=0 hasta 4 Hacer                     
		si freq[i]>z Entonces                    
			z=freq[i]                            
			masV[5]=i
		FinSi
	FinPara
	escribir sin saltar "[Mas vendido]"              
	para i=0 hasta 5 Hacer
		escribir sin saltar "       [",masV[i]+1,"]  " 
	FinPara
	escribir ""
	
	Escribir "_______________________________________________________________________________________________"
FinSubProceso
