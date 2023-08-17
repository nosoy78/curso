
package EjercicioIRONMAN.entidades;

public class Generador extends Dispositivo{
    
    protected float energiaTotal;
    protected float energiaTT;
   

    public Generador() {
    }

    public Generador(float energiaTotal, boolean estado) {
        super(estado);
        this.energiaTotal = energiaTotal;
        this.energiaTT = energiaTotal;
    }

    public float getEnergiaTT() {
        return energiaTT;
    }

    public float getEnergiaTotal() {
        return energiaTotal;
    }

    public void setEnergiaTotal(float energiaTotal) {
        this.energiaTotal = energiaTotal;
    }


    @Override
    public String toString() {
        return "Generador{" + "energiaTotal=" + energiaTotal + ", estado=" + estado + '}';
    }
}
