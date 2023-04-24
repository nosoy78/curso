
package guia7ejercicio.pkg2.Cicun;

import java.util.Scanner;


public class Circun {
    private double radio;
    
    
    public Circun() {
        
    }

    public Circun(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircun() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();
    }

    public double area() {
        double area = Math.PI * radio * radio;
        System.out.println("Area : " + area );
        return area;
    }

    public double perimetro() {
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Perimetro : " + perimetro );
        return perimetro;
    }
}
