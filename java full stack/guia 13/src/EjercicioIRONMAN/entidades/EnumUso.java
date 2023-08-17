
package EjercicioIRONMAN.entidades;


public enum EnumUso {
    
    NORMAL(1),
    MEDIO(2),
    INTENSO(3);

    private final int nivel;

    private EnumUso(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}