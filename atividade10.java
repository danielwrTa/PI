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
public class atividade10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];

        System.out.println("Digite 10 numeros:");
        
        for (int i = 0; i < 10; i++) {

            vetorA[i] = sc.nextInt();

        }

        for (int i = 0; i < 10; i++) {

            vetorB[i] = vetorA[i];

        }

        System.out.println("copia:");

        for (int i = 0; i < 10; i++) {

            System.out.println(vetorB[i]);

        }
    }
}
