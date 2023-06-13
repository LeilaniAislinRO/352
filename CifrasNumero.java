/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8.cifrasnumero;

import java.util.Scanner;

public class CifrasNumero {
  static int n=0;
    public static void main(String[] args) {
    Pedir();
    Numeros();
    
    public static void main(String[] args) {
        }
    public static void Pedir(){
        //Pedir
  
        Scanner Guardado =new Scanner(System.in);
            System.out.println("Numero:");
                   N = Guardado.nextInt();
    }
    public static void Numeros(){
           // Los if
        if (n<10 && n>=1)
             {
            System.out.println("una cifra");  
             }
            if (n<100 && n>=10)
            {
            System.out.println("dos cifras");  
            }
             if (n<1000 && n>=100)
            {
            System.out.println("tres cifras");  
            }
             if (n<10000 && n>=1000)
            {
            System.out.println("cuatro cifras");  
             }
              if (n<100000 && n>=10000)
            {
            System.out.println("cinco cifras");  
             }
            if (n>=100000)
            {
            System.out.println("Muchas cifras");  
             }
            if (n<0)
            {
            System.out.println("No hay negativos en bang sing se");  
             }
    }
    
}
