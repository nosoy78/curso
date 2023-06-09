
package entidades;

public class ahorcado {

    /**
     * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá
     * contener como atributos, un vector con la palabra a buscar, la cantidad
     * de letras encontradas y la cantidad jugadas máximas que puede realizar el
     * usuario.
     */
    
    private String[] vectorPalabra = new String[0];
    private int cantletras;
    private int jugadasMax;

    public ahorcado() {
    }

    public ahorcado(int cantletras, int jugadasMax) {
        this.cantletras = cantletras;
        this.jugadasMax = jugadasMax;
        this.vectorPalabra[0] = "Holamundo";
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getCantletras() {
        return cantletras;
    }

    public void setCantletras(int cantletras) {
        this.cantletras = cantletras;
    }

}