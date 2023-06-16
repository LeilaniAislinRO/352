/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12.banderascalificacion;

/**
 *
 * @author Usuario
 */
public class BanderasCalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion1=10;
        int calificacion2=8;
        boolean bandera1;
        bandera1=(calificacion1>calificacion2);
        System.out.println("Aprobada");
        int calificacion3=5;
        boolean bandera2;
        bandera2=(calificacion2<calificacion3);
        System.out.println("Reprobada");
        int calificacion4=7;
        boolean bandera3;
        bandera3=(calificacion4>calificacion3);
        System.out.println("Aprobado");
        int calificacion5=9;
        boolean bandera4;
        bandera4=(calificacion5<calificacion1);
        System.out.println("Reprobada");
    }
    
}
