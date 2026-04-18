/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado5;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaColuna2 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.printf("Matriz [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
                if (j == 1) {
                    somaColuna2 += matriz[i][j];
                    
                }
            }
        }
        System.out.println("Soma da Coluna 2: " + somaColuna2);

    }

}
