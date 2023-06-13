/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.funcmayoredad;

import java.util.Scanner;
        
public class FUNCMAYOREDAD {

   
    public static void main(String[] args) {
       Scanner teclado = new Scanner (Systrem.in);
       System.out.println ("Ingrese su edad");
       int edad = teclado .nextInt();
       
       if (edad > 17){
           System.out.println ("Eres mayor de edad");
       } else {
           System.out.println ("Eres menor de edad");
       }
    }

    private static class Systrem {

        public Systrem() {
        }
    }
    
}
