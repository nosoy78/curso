
package Ejercicio2Extra.entidades;

public class Oficina {
    private int cantPersonas;
    private int numero;

    public Oficina() {
    }

    public Oficina(int cantPersonas, int numero) {
        this.cantPersonas = cantPersonas;
        this.numero = numero;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Oficina{" + "cantPersonas=" + cantPersonas + ", numero=" + numero + '}';
    }
    
    
    
}
