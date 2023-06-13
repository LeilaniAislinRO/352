/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.trifiv;

import java.util.Scanner;

public class TRIFIV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i, multiplos_de_3, multiplos_de_5, n;
        multiplos_de_3 = 0;
        multiplos_de_5 = 0;
        System.out.print("Ingresa el valor de n: ");
        n = in.nextInt();
        in.nextLine();
        for (i=1; i<=n; i++) {
            System.out.print("PROCESO " + i);
            if(n%3==0)
                multiplos_de_3;
            if(n%5==0)
                multiplos_de_5;
            System.out.println();
        }
        System.out.println("Valor de multiplos de 3: " + multiplos_de_3);
        System.out.println("Valor de multiplos de 5: " + multiplos_de_5);
    }
}    

