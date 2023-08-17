
package Ejercicio2Extra.entidades;

public abstract class Edificio {
    private float ancho;
    private float largo;
    private float alto;
    
    
    public abstract float calcularSuperficie();
    public abstract float calcularVolumen();

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "{ ancho=" + ancho + ", largo=" + largo + ", alto=" + alto + '}';
    }
    
    
    
    
}
