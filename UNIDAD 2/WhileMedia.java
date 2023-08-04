
package whilemedia;

import java.util.Scanner;

public class WhileMedia {

    public static void main(String[] args) {
media();
    }
   public static void media(){
       Scanner entrada =new Scanner(System.in);
        int suma, num,elementos;
        float media;
System.out.println("Introduce numero ");
num = entrada.nextInt();
suma=0;
elementos=0;

while(num>=0)
{
suma+=num;
elementos++;
System.out.println("Introduce otro numero ");
num = entrada.nextInt();
}
    if(elementos==1){
System.out.println("No promedio");    
}
else{
    media=(float)suma/elementos;
    System.out.println("La media es  de " + media);
    
}
   } 
}
