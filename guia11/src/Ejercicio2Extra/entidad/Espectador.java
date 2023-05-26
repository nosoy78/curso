
package espectador;

public class Espectador {
    
    
    private String nombreE;
    private int edadE;
    private int dineroE;

    public Espectador() {
    }

    public Espectador(String nombreE, int edadE, int dineroE) {
        this.nombreE = nombreE;
        this.edadE = edadE;
        this.dineroE = dineroE;
    }

    public int getDineroE() {
        return dineroE;
    }

    public void setDineroE(int dineroE) {
        this.dineroE = dineroE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getEdadE() {
        return edadE;
    }

    public void setEdadE(int edadE) {
        this.edadE = edadE;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombreE=" + nombreE + ", edadE=" + edadE + ", dineroE=" + dineroE + '}';
    }

}
