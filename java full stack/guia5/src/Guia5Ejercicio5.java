

import java.util.Random;


public class Guia5Ejercicio5 {

    /**
     * Realice un programa que compruebe
     * si una matriz dada es antisimétrica. Se dice que una matriz A es
     * antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada
     * de signo. Es decir, A es antisimétrica si A = -AT. La matriz traspuesta
     * de una matriz A se denota por AT y se obtiene cambiando sus filas por
     * columnas (o viceversa).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random Aletorio = new Random();
        
        int[][] matriz = new int[4][4];
        int[][] matriz1 = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            int aux = +1;
             for (int j = 0; j < 4; j++) {
                 aux = aux + 1;
                 matriz[i][j] = aux;
             }             
        }
        System.out.println("Matriz Principal : ");  
        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
               System.out.print(" " + matriz[i][j] + " "); 
            }
            System.out.println("");
        }
        for (int i = 0; i < 4; i++) {
            int aux = +1;
            for (int j = 0; j < 4; j++) {
                aux = aux + 1;
                matriz1[j][i] = aux;
            }
        }
        System.out.println("Matriz Secundaria : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        boolean sonTraspuestas = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != matriz1[j][i]) {
                    sonTraspuestas = false;
                    break;
                }
            }       
        }    
        if (sonTraspuestas) {
                System.out.println("Las matrices son traspuestas.");
        } else {
                System.out.println("Las matrices no son traspuestas.");
            }
    }
}