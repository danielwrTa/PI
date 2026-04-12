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
public class Atividade6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[7];

        for (int i = 0; i < 7; i++) {
            
            System.out.print("Digite o valor " + i + ": ");
            vetor[i] = sc.nextInt();
            
        }

        int menor = vetor[0];
        int posMenor = 0;

        for (int i = 1; i < 7; i++) {
            
            if (vetor[i] < menor) {
                
                menor = vetor[i];
                posMenor = i;
                
            }
        }

        System.out.println("Menor elemento: " + menor);
        System.out.println("Posicao do menor: " + posMenor);

        System.out.println("Vetor apos a divisao:");
        for (int i = 0; i < 7; i++) {
            
            vetor[i] = vetor[i] / menor;
            System.out.print(vetor[i] + " ");
            
        }      
    }

}
