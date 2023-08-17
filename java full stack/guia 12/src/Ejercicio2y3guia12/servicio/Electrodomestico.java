
package Ejercicio2y3guia12.servicio;

import java.util.Scanner;


public class Electrodomestico {

    
    protected double precio;
    protected String color;
    protected char consumoEnergia;
    protected int peso;

    public Electrodomestico(double precio, String color, char consumoEnergia, int peso) {
        this.precio = precio;
        comprobarColor(color);
        this.color = color;
        
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
    }

    public Electrodomestico() {
    }

    public void comprobarConsumoEnergetico(char letra) {
       
        letra = Character.toUpperCase(letra);
        if (letra != 'A' && letra != 'B' && letra != 'C'
        && letra != 'D' && letra != 'E' && letra != 'F') {
           
            setConsumoEnergia('F');
        }
    }

    public void comprobarColor(String color) {
       
        color = color.toLowerCase();
        if (!"blanco".equals(color) && !"negro".equals(color) && !"rojo".equals(color)
                && !"azul".equals(color) && !"gris".equals(color)) {
            this.color = "blanco";
        }
    }

    public void crearElectrodomestico() {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("--- INGRESE ELECTRODOMESTICO ---");

        System.out.println("Ingrese el precio : ");
        this.precio = leer.nextInt() + 1000;
        System.out.println("Ingrese el color : ");
        this.color = leer.next();
        comprobarColor(this.color);
        System.out.println("Ingrese el peso : ");
        this.peso = leer.nextInt();
        System.out.println("Ingrese el Consumo Electrico la letra A|B|C|D|E|F : ");
        String consumoE = leer.next();
        this.consumoEnergia = consumoE.charAt(0);
        comprobarConsumoEnergetico(this.consumoEnergia);
    }

    public void precioFinal() {
      
        char var = consumoEnergia;
        switch (var) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
        }

        int pesoValor = this.peso;
        if (pesoValor >= 1 && pesoValor <= 19) {
            this.precio += 100;
        }
        if (pesoValor >= 20 && pesoValor <= 49) {
            this.precio += 500;
        }
        if (pesoValor >= 50 && pesoValor <= 79) {
            this.precio += 800;
        }
        if (pesoValor >= 80) {
            this.precio += 1000;
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergia=" + consumoEnergia + ", peso=" + peso + '}';
    }
    
    

}
