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
public class atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[10];
        int[] num2 = new int[10];
        int[] ordenar = new int[20];

        System.out.println("Digite os valores do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            num1[i] = sc.nextInt();
            ordenar[i] = num1[i];
        }

        System.out.println("Digite os valores do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            num2[i] = sc.nextInt();
            ordenar[i + 10] = num2[i];
        }

        System.out.println("Vetor 1:");
        for (int i = 0; i < 10; i++) {
            
            System.out.println(num1[i]);
            
        }

        System.out.println("Vetor 2:");
        for (int i = 0; i < 10; i++) {
            
            System.out.println(num2[i]);
            
        }

        for (int i = 0; i < 20; i++) {
            
            for (int j = 0; j < 19; j++) {
                
                if (ordenar[j] > ordenar[j + 1]) {
                    
                    int tem = ordenar[j];
                    ordenar[j] = ordenar[j + 1];
                    ordenar[j + 1] = tem;
                    
                }
            }
        }

        System.out.println("Os 20 numeros ordenados:");
        for (int i = 0; i < 20; i++) {
            
            System.out.println(ordenar[i]);
            
        }
    }
}
