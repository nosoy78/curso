Algoritmo eje4matrizcuadrada
	Definir m1,m2,mp  Como Entero
	Dimension m1(3,3), m2(3,3),mp(3,3)
	definir f,c Como Entero
	para f<-0 hasta 2
		para c<-0 Hasta 2
			mp(f,c)=0
		FinPara
	FinPara
	escribir "La primer matriz es:"
	llenar(m1)
	ver(m1)
	Escribir "--------------------------------------------"
	Escribir "la segunda matriz es:"
	llenar(m2)
	ver(m2)
	
	Escribir "el producto de ambas Matrices es:"
	producto(m1,m2,mp)
	ver(mp)
FinAlgoritmo
SubProceso llenar(m Por Referencia)
	definir f,c Como Entero
	para f<-0 hasta 2
		para c<-0 Hasta 2
			m(f,c)= azar(10)
		FinPara
	FinPara
FinSubProceso
SubProceso ver(m)
	definir f,c Como Entero
	para f<-0 hasta 2
		para c<-0 Hasta 2
			Escribir Sin Saltar m(f,c) ";"
		FinPara
		escribir""
	FinPara
FinSubProceso
SubProceso producto(m1,m2,mp Por Referencia)
	definir f,c,v Como Entero
	para f<-0 hasta 2
		para c<-0 Hasta 2
			para v<-0 hasta 2 
				mp(f,c) = mp(f,c) + (m1(f,v) * m2(v,c))
			finpara
		FinPara
	FinPara
FinSubProceso
