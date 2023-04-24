Algoritmo quitarnota
	definir n1, n2, n3, n4, prom, elimi Como Real
	Escribir "ingrese sus 4 notas"
	leer n1, n2 n3 n4;
	si n1<n2 & n1<n3 & n1<n4 Entonces
		elimi=n1
	SiNo
		si n2<n1 & n2<n3 & n2<n4 Entonces
			elimi=n2
		SiNo
			si n3<n1 & n3<n2 &n3<n4 Entonces
				elimi=n3
			SiNo
				elimi=n4
			FinSi
		FinSi
	FinSi
	prom=(n1+n2+n3+n4-elimi)/3;
	escribir "su promedio fue " ,prom, " y la mota mas baja eliminada fue ",elimi;
	
	
FinAlgoritmo
