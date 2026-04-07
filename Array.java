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
    
        
        System.out.println("Digite o numero de alunos que vc quer registrar a idade: "); 
        int quantIdade = sc.nextInt();
        
        int idade[] = new int[quantIdade];
        
        for(int i = 0; i < quantIdade; i++){
            
            System.out.println("A idade do aluno" + i + " => ");
            idade[i] = sc.nextInt();
           
       
        }
       
   
        
         for(int i = 0; i < quantIdade; i++){
            
            System.out.println("A idade do aluno" + (i+1) + " e " + idade[i]);
           
       
         }
       
        int maior = idade [0];
        int menor = idade [0];
         
        for (int i = 0; i < quantIdade; i++) {
            
            if (idade[1] > maior) {
                
                maior = idade[i];
                
            } if (idade[1] < menor) {
                
                menor = idade[1];
                
                System.out.println("Maior idade: " + maior);
                System.out.println("Menor idade: " + menor);
            }
            
        }
       
       
        
    }
    
}
