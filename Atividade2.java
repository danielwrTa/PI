/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadematrizes;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Atividade2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int VetorA[] = new int[10];
        int VetorB[] = new int[10];
        int resultado[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + i + "da tabela A:");
            VetorA[i]= sc.nextInt();
            
            System.out.println("Digite o " + i + "da tabela B:");
            VetorB[i]= sc.nextInt();

        }
        for (int i = 0; i < 10; i++) {
            
            resultado[i] = VetorA[i]*VetorB[i];
            
            System.out.println("Numero " + i + ": " + VetorA[i] + " x " + VetorB[i] + " = " + resultado[i]);
            
        }
        
        
    }
}
