

import java.util.Random;


public class Guia5Ejercicio4 {

    /**
     * Realizar un programa que rellene
     * un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la
     * matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
     * cambiando sus filas por columnas (o viceversa).
     */
    public static void main(String[] args) {
       
        Random Aletorio = new Random();
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                 matriz[i][j] = Aletorio.nextInt(10);
             }             
        }
        System.out.println("Matriz Original : ");  
        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
               System.out.print(" " + matriz[i][j] + " ");              
             }
        System.out.println("");    
        }
        System.out.println("Matriz traspuesta : "); 
        for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
               System.out.print(" " + matriz[j][i] + " ");              
             }
        System.out.println(""); 
        
    }
    }       
}