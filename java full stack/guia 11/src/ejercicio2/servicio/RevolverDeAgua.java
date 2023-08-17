
package revolverDeAgua;

import java.util.Random;

public class RevolverDeAgua {
    
    private double posActual;
    private double posAgua;
    
    public void llenarRevolver(){
        Random random = new Random();
        this.posActual = random.nextInt(6)+1;
        this.posAgua = random.nextInt(6)+1;
    }
    
    public boolean mojar(){
        boolean aux = false;
        if (posActual == posAgua){
            aux = true;
        }
        return aux;
    }
    
    public void siguienteChorro(){
        if (posActual == 6){
            posActual = 1;
        }else{
            posActual ++;
        }
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }  
}
