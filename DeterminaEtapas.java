/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.determinaetapas;

import java.util.Scanner;

public class DeterminaEtapas {

   static int Edad=0;
    public static void main(String[] args) {
 Pedir();
 Resultado();
}
    public static void main(String[] args) {
      //pedir datos
           Scanner Guardado =new Scanner(System.in);
            System.out.println("Dame Edad:");
                   Edad = Guardado.nextInt();
    }
    public static void Resultado(){
        //operaciones
        if (Edad<=5 && Edad >=0  )
        {
           System.out.println("Eres un infante");  
        }
   
          if (Edad<=17 && Edad>=6)
        {
           System.out.println("Eres un niño");  
        }
            if (Edad>=18)
        {
           System.out.println("Eres un adolecente/adulto");  
        }
             if (Edad<0)
        {
           System.out.println("No puedes crecer de manera negativa");  
        }
                 if (Edad>=180)
        {
           System.out.println("eres inmortal?");  
        }    
    }
    
    
}
