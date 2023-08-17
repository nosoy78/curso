
package EjercicioIRONMAN.entidades;


public final class Botas extends Dispositivo{

    public Botas() {
    }

    
    public Botas(boolean estado) {
        super(estado);
    }

    public int usarBotas() {
       
        if (Math.random() <= 0.3) {
            estado = false;
            return consumo;
        } else {
            return consumo;
        }
    }

    @Override
    public String toString() {
        return "Botas{" + "consumo=" + consumo + ", estado=" + estado + '}';
    }
}
    
    
