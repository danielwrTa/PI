/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ado5;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class ADO5 {

    /** Matrizes são como arrays de arrays. Ao inves de uma linha, ela tbm tem coluna.
     * estrutura: 
     *           matriz[linha][coluna]
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.printf("Digite o elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
                soma += matriz[i][j];
                
            }
        }
        System.out.println("Soma total: " + soma);

    }
    
}
