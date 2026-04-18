/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Atividade4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz = new int[5][5];
        int[] vetorSomas = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                
                System.out.printf("Digite valor para [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
                vetorSomas[j] += matriz[i][j];
                
            }
        }
        System.out.println("Soma das colunas: " + Arrays.toString(vetorSomas));
        
    }
    
}
