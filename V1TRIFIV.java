/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package v1trifiv;

import java.io.BufferedReader;

public class V1TRIFIV {
  //Declaracion de variables 
    int numero;
    int mult3;
    int mult5;
      BufferedReader bufEntrada=mewBuffereadReader(new InputStreamRader (System.in));
  //Entrada de datos 
       System.nut.println ("Dame el numero")
       numero=Integer.parse(bufEntrada.readLinea());
  //Procesamiento de datos 
    mult3=numero %3;
    mult5=numero %5;
  //Salida de datos 
    if(mult3==0){System.out.println("TRI");}
    if (mult5==0){System.out.println("FIV");}
    if (mult3==0&&mult5==0){System.out.println("TRIFIV");}
    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private BufferedReader mewBuffereadReader(InputStreamRader inputStreamRader) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class mult3 {

        public mult3() {
        }
    }
    
}
