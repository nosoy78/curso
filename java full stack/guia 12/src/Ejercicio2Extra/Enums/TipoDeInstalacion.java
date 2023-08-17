
package Ejercicio2Extra.Enums;

public enum TipoDeInstalacion {
    
    TECHADO ("TECHADO"),
    ABIERTO ("ABIERTO");
    
    String valor;

    private TipoDeInstalacion(String valor) {
        this.valor = valor;
    }
    

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "TipoDeInstalacion{" + "valor=" + valor + '}';
    }
    
    
    
}
