/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att2;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Att2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
         System.out.println("Digite a nota 1: ");
         float n1 = sc.nextFloat();
         System.out.println("Digite a nota 2: ");
         float n2 = sc.nextFloat();
         
         float media = (n1+n2)/2;
         
         if (media >= 6) {
             
             System.out.println("Aprovado");
            
        }else{
         
             System.out.println("Reprovado");
         
         }
    }
    
}
