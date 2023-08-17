
package EjercicioIRONMAN.entidades;


public class Cascos extends Dispositivo{
    
    public Cascos() {
    }
    
    public Cascos(boolean estado) {
        super(estado);
    }
    public int usarCascos() {
        if (Math.random() <= 0.3) {
            estado = false;
            return consumo;
            
        } else {
            return consumo;
        }
    }
}
