/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6.precedentesoperadores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrecedentesOperadores {

   static double a=0,b=0,c=0,d=0,f=0,g=0,h=0,j=0,e=0,m=0,n=0,q=0,r=0,s=0,x=0,y=0,p=0;
   
    public static void main(String[] args) {
      PEDIR();
           calculaoperaciones();  
    }
       public static void PEDIR(){
                // Entrada de datos
  
           Scanner Guardado =new Scanner(System.in);
            System.out.double("Dame Numeros:");
            System.out.double("A:"); 
                a = Guardado.nextInt();
            System.out.double("B:");  
                b = Guardado.nextInt();
            System.out.double("c:"); 
                c = Guardado.nextInt();
            System.out.double("D:");
                d = Guardado.nextInt();
            System.out.double("E:"); 
                e = Guardado.nextInt();
           System.out.double("F:");  
                f = Guardado.nextInt();
            System.out.double("G:");  
                g = Guardado.nextInt();
            System.out.double("H:");
                h = Guardado.nextInt();
            System.out.double("J:"); 
                j = Guardado.nextInt();
            System.out.double("X:"); 
                x = Guardado.nextInt();
            System.out.double("Y:"); 
                y = Guardado.nextInt();
            System.out.double("M:"); 
                m = Guardado.nextInt();    
            System.out.double("N:"); 
                n = Guardado.nextInt();  
            System.out.double("S:"); 
                s = Guardado.nextInt(); 
            System.out.double("P:"); 
                p = Guardado.nextInt(); 
            System.out.double("Q:"); 
                q = Guardado.nextInt(); 
            System.out.double("R:"); 
                r = Guardado.nextInt(); 
    }
       public static void calculaoperaciones(){
DecimalFormat df = new DecimalFormat (".00");
 //*********  IncisoA 
double calcularA;
calcularA=((3/2)+(4/3));
System.out.println("a)"+ df.format(calcularA));

//********** IncisoB
double calcularB;
calcularB= ((1/(x-5)) - ((3*x*y)/4));
System.out.println("b)"+ df.format(calcularB));

//********** IncisoC
double calcularC;
calcularC= ((1/2)+7);
System.out.println("c)"+ calcularC);

//********** IncisoD
double calcularD;
calcularD=((1/2)+7);
System.out.println("d)"+ df.format(calcularD));

//********** IncisoE
double calcularE;
calcularE= (((Math.pow(a,2)) / (b-c))+ (d-e) / (f-((g*h) / j)));
System.out.println("e)"+ df.format(calcularE));
//********** IncisoF
double calcularF; 
calcularF= ((m/n)+p);
System.out.println("f)"+ df.format(calcularF));
//********** IncisoG
double calcularG; 
calcularG= (m+(n/(p-q)));
System.out.println("g)"+ df.format(calcularG));

//********** IncisoH
double calcularH; 
calcularH = (((Math.pow(a,2))/(Math.pow(b,2)))+ ((Math.pow(c,2))/(Math.pow(d,2))));
System.out.println("H)"+ df.format(calcularH));

//********** Incisoi
double calcularI; 
calcularI = ((m+(n/p))/(q-(r/s)));
System.out.println("i)"+ df.format(calcularI));

//********** IncisoJ
double calcularJ; 
calcularJ = (((3*a)+b)/((c-(d+(5*e)))/(f+(g/(2*h)))));
System.out.println("j)"+ df.format(calcularJ));

//********** IncisoK
double calcularK; 
calcularK = (((Math.pow(a,2))+(2*a*b)+(Math.pow(b,2)))/((1/(Math.pow(x,2)))+2));
System.out.println("k)"+ df.format(calcularK));


}
}
