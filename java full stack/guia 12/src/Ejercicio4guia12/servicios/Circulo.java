
package Ejercicio4guia12.servicios;

public class Circulo implements calculosFormas{
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        double diametro = radio * 2;
        return PI * diametro;
    }  
}
