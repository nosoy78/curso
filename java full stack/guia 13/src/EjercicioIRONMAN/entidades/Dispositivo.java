
package EjercicioIRONMAN.entidades;


public class Dispositivo {
    protected int consumo = 1;
    protected boolean estado = true;

    public Dispositivo() {
    }

    public Dispositivo(boolean estado) {
        this.estado = estado;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" + "consumo=" + consumo + ", estado=" + estado + '}';
    }
    
    
    
}
