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
public class atividade7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            
            System.out.println("Digite o numero " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            
            for (int j = 0; j < 9; j++) {
                
                if (num[j] > num[j + 1]) {
                    
                    int teste = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = teste;
                    
                }
            }
        }

        System.out.println("Vetor em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            
            System.out.print(num[i] + " ");
            
        }

    }
}
