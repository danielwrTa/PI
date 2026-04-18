/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ado5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * meu deus
 * @author danie
 */
public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("N: "); 
        int n = sc.nextInt();
        
        System.out.print("M: "); 
        int m = sc.nextInt();
        
        int[][] y = new int[n][m];
        int[] aux = new int[n * m];
        int k = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                y[i][j] = sc.nextInt();
                aux[k++] = y[i][j];
                
            }
        }
        for (int i = 0; i < aux.length - 1; i++) {
            for (int j = 0; j < aux.length - 1 - i; j++) {
                
                if (aux[j] > aux[j + 1]) {
                    
                    int temp = aux[j];
                    aux[j] = aux[j + 1];
                    aux[j + 1] = temp;
                    
                }
            }
        }
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                y[i][j] = aux[k++];
                
            }
        }
        System.out.println("Matriz ordenada com sucesso!");
    }
    
}
