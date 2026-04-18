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
public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("N: "); int n = sc.nextInt();
        System.out.print("M: "); int m = sc.nextInt();
        int[][] a = new int[n][m], b = new int[n][m], c = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                c[i][j] = a[i][j] + b[i][j];
                
            }
        }
    }
    
}
