/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author daniel.wrtavares
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int idade[] = new int[4];
        
        for(int i = 0; i < 4; i++){
            
            System.out.println("A idade do aluno" + i + " => ");
            idade[i] = sc.nextInt();
           
       
        }
         for(int i = 0; i < 4; i++){
            
            System.out.println("A idade do aluno" + (i+1) + " e " + idade[i]);
           
       
        }
        
        
       
       
        
    }
    
}
