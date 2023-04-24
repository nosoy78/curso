
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC CASA
 */
public class guia3Ejercico82 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num=0;
        int i= 0;
        int j= 0;
        int k= 0;

        do { System.out.println("ingrese un numero");
        num=leer.nextInt();
        i++;
        if((num%2) == 0){
            j++;
        }else {k++;}
        }while (num%5 != 0);

        System.out.println("la cantidad de numeros es " + i);
        System.out.println("la cantidad de pares es " + j);
        System.out.println("la cantidad de impares es " + k);
    }

}
